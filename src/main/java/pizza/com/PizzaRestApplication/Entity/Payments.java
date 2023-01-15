package pizza.com.PizzaRestApplication.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private int order_id ;
    private  float amount ;
    private Date payment_date;
    private String payment_method;
    private String  transaction_id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", amount=" + amount +
                ", payment_date=" + payment_date +
                ", payment_method='" + payment_method + '\'' +
                ", transaction_id='" + transaction_id + '\'' +
                '}';
    }
}
