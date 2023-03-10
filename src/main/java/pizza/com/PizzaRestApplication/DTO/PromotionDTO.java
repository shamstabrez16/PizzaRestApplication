package pizza.com.PizzaRestApplication.DTO;

import java.util.Date;

public class PromotionDTO {
    private Long id;
    private String name;
    private String type;
    private Date start_date ;
    private Date end_date ;
    private String description ;
    private String applicable_products;
    private float discount_percent;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Date getStart_date() {
        return start_date;
    }
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
    public Date getEnd_date() {
        return end_date;
    }
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getApplicable_products() {
        return applicable_products;
    }
    public void setApplicable_products(String applicable_products) {
        this.applicable_products = applicable_products;
    }
    public float getDiscount_percent() {
        return discount_percent;
    }
    public void setDiscount_percent(float discount_percent) {
        this.discount_percent = discount_percent;
    }
}
