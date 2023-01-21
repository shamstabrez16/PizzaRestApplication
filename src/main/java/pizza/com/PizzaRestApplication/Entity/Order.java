package pizza.com.PizzaRestApplication.Entity;

import jakarta.persistence.*;
import pizza.com.PizzaRestApplication.RequiredMethods.BaseEntityInterface;

import java.util.Date;

@Entity(name = "orders")
public class Order implements BaseEntityInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private int order_id;
    @Column(name = "customer_id", nullable = false)
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

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", customer_id=" + customerId +
                ", order_total=" + order_total +
                ", order_date=" + order_date +
                '}';
    }


}
