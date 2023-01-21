package pizza.com.PizzaRestApplication.DTO;

import pizza.com.PizzaRestApplication.RequiredMethods.BaseEntityInterface;

public class Order_itemDTO implements BaseEntityInterface {
    private Long id;
    private int order_id ;
    private int pizza_id;
    private int quantity;
    private float price;

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

    public int getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(int pizza_id) {
        this.pizza_id = pizza_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
