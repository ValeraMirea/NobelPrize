import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String url = "https://api.nobelprize.org/2.0/nobelPrize/phy/2010";
        HttpsURLConnection connection;
        URL u = new URL(url);
        connection = (HttpsURLConnection) u.openConnection();
        connection.setConnectTimeout(10000);
        connection.connect();

        int status = connection.getResponseCode();
        //System.out.println(status);

        StringBuilder stringBuilder = new StringBuilder();
//        ArrayList<String> lines = new ArrayList<>();
        if (status==200){
            Scanner scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
            }
        }
        Gson gson = new Gson();
        Response[] responses = gson.fromJson(stringBuilder.toString(), Response[].class);

        for (int i = 0; i < responses.length; i++) {
            List<Laureate> laureates = responses[i].getLaureates();
            for (int j = 0; j < laureates.size(); j++) {
                System.out.println(laureates.get(j).getFullName().getEn() + ", " + responses[0].getAwardYear());
            }
            System.out.println();
        }
    }
}