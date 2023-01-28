package pizza.com.PizzaRestApplication.DTO;

import pizza.com.PizzaRestApplication.RequiredMethods.BaseEntityInterface;

import java.util.Date;
public class OrderDTO implements BaseEntityInterface {
    private int order_id;
    private int customerId;
    private float order_total;
    private Date order_date;


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public float getOrder_total() {
        return order_total;
    }

    public void setOrder_total(float order_total) {
        this.order_total = order_total;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

}
