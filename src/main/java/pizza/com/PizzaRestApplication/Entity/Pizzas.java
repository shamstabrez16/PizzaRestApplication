package pizza.com.PizzaRestApplication.Entity;

import jakarta.persistence.*;

@Entity(name = "pizzas")
public class Pizzas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private  String name;
    private String toppings;
    private float price ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toppings='" + toppings + '\'' +
                ", price=" + price +
                '}';
    }
}
