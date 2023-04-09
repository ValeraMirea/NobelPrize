import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Generated("jsonschema2pojo")
public class Category {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("se")
    @Expose
    private String se;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

}

@Generated("jsonschema2pojo")
 class CategoryFullName {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("se")
    @Expose
    private String se;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

}

@Generated("jsonschema2pojo")
 class Response {

    @SerializedName("awardYear")
    @Expose
    private String awardYear;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("categoryFullName")
    @Expose
    private CategoryFullName categoryFullName;
    @SerializedName("dateAwarded")
    @Expose
    private String dateAwarded;
    @SerializedName("prizeAmount")
    @Expose
    private Integer prizeAmount;
    @SerializedName("prizeAmountAdjusted")
    @Expose
    private Integer prizeAmountAdjusted;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("laureates")
    @Expose
    private List<Laureate> laureates;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public String getAwardYear() {
        return awardYear;
    }

    public void setAwardYear(String awardYear) {
        this.awardYear = awardYear;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CategoryFullName getCategoryFullName() {
        return categoryFullName;
    }

    public void setCategoryFullName(CategoryFullName categoryFullName) {
        this.categoryFullName = categoryFullName;
    }

    public String getDateAwarded() {
        return dateAwarded;
    }

    public void setDateAwarded(String dateAwarded) {
        this.dateAwarded = dateAwarded;
    }

    public Integer getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(Integer prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public Integer getPrizeAmountAdjusted() {
        return prizeAmountAdjusted;
    }

    public void setPrizeAmountAdjusted(Integer prizeAmountAdjusted) {
        this.prizeAmountAdjusted = prizeAmountAdjusted;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Laureate> getLaureates() {
        return laureates;
    }

    public void setLaureates(List<Laureate> laureates) {
        this.laureates = laureates;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}

@Generated("jsonschema2pojo")
 class FullName {

    @SerializedName("en")
    @Expose
    private String en;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}

@Generated("jsonschema2pojo")
 class KnownName {

    @SerializedName("en")
    @Expose
    private String en;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}

@Generated("jsonschema2pojo")
 class Laureate {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("knownName")
    @Expose
    private KnownName knownName;
    @SerializedName("fullName")
    @Expose
    private FullName fullName;
    @SerializedName("portion")
    @Expose
    private String portion;
    @SerializedName("sortOrder")
    @Expose
    private String sortOrder;
    @SerializedName("motivation")
    @Expose
    private Motivation motivation;
    @SerializedName("links")
    @Expose
    private Links__1 links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KnownName getKnownName() {
        return knownName;
    }

    public void setKnownName(KnownName knownName) {
        this.knownName = knownName;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Motivation getMotivation() {
        return motivation;
    }

    public void setMotivation(Motivation motivation) {
        this.motivation = motivation;
    }

    public Links__1 getLinks() {
        return links;
    }

    public void setLinks(Links__1 links) {
        this.links = links;
    }

}

@Generated("jsonschema2pojo")
 class Links {

    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("types")
    @Expose
    private String types;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

}

@Generated("jsonschema2pojo")
 class Links__1 {

    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("types")
    @Expose
    private String types;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

}

@Generated("jsonschema2pojo")
 class Meta {

    @SerializedName("terms")
    @Expose
    private String terms;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

}

@Generated("jsonschema2pojo")
 class Motivation {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("se")
    @Expose
    private String se;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

}