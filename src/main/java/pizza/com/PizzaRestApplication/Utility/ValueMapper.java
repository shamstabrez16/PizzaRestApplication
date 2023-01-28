package pizza.com.PizzaRestApplication.Utility;

import pizza.com.PizzaRestApplication.DTO.*;
import pizza.com.PizzaRestApplication.Entity.*;

import java.util.Optional;

public class ValueMapper {

    public static CustomerDTO mapCustomerToCustomerDTO(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setPhone(customer.getPhone());
        customerDTO.setAddress(customer.getAddress());
        return customerDTO;
    }

    public static Customer mapCustomerDTO_ToCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setPhone(customerDTO.getPhone());
        customer.setAddress(customerDTO.getAddress());
        return customer;
    }

    public static Order_itemDTO mapOrderItemsToOrderItemsDTO(Order_item orderItem){
        Order_itemDTO order_itemDTO = new Order_itemDTO();
        order_itemDTO.setId(orderItem.getId());
        order_itemDTO.setOrder_id(orderItem.getOrder_id());
        order_itemDTO.setPizza_id(orderItem.getPizza_id());
        order_itemDTO.setQuantity(orderItem.getQuantity());
        order_itemDTO.setPrice(orderItem.getPrice());
        return order_itemDTO;

    }
    public static Order_item mapOrderItemsDTO_ToOrderItems(Order_itemDTO order_itemDTO){
        Order_item order_item = new Order_item();
        order_item.setId(order_itemDTO.getId());
        order_item.setOrder_id(order_itemDTO.getOrder_id());
        order_item.setPizza_id(order_itemDTO.getPizza_id());
        order_item.setQuantity(order_itemDTO.getQuantity());
        order_item.setPrice(order_itemDTO.getPrice());
        return order_item;
    }

    public static OrderDTO mapOrderToOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrder_id(order.getOrder_id());
        orderDTO.setCustomerId(order.getCustomerId());
        orderDTO.setOrder_total(order.getOrder_total());
        orderDTO.setOrder_date(order.getOrder_date());
        return orderDTO;

    }

    public static OrderDTO OptionalMapOrderToOrderDTO(Optional<Order> order) {
        OrderDTO orderDTO = new OrderDTO();
        if(order.isPresent()) {
            orderDTO.setOrder_id(order.get().getOrder_id());
            orderDTO.setCustomerId(order.get().getCustomerId());
            orderDTO.setOrder_total(order.get().getOrder_total());
            orderDTO.setOrder_date(order.get().getOrder_date());
        }
        return orderDTO;
    }
    public static PaymentDTO mapPaymentToPaymentDTO(Payment payment){
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setId(payment.getId());
        paymentDTO.setOrder_id(payment.getOrder_id());
        paymentDTO.setAmount(payment.getAmount());
        paymentDTO.setPayment_date(payment.getPayment_date());
        paymentDTO.setPayment_method(payment.getPayment_method());
        paymentDTO.setTransaction_id(payment.getTransaction_id());
        return paymentDTO;
    }
    public static PizzaDTO mapPizzaToPizzaDTO(Pizza pizza){
        PizzaDTO pizzaDTO = new PizzaDTO();
        pizzaDTO.setId(pizza.getId());
        pizzaDTO.setName(pizza.getName());
        pizzaDTO.setToppings(pizza.getToppings());
        pizzaDTO.setPrice(pizza.getPrice());
        return pizzaDTO;
    }
    public static PromotionDTO mapPPromotionToPromotionDTO(Promotion promotion){
        PromotionDTO promotionDTO = new PromotionDTO();
        promotionDTO.setId(promotion.getId());
        promotionDTO.setName(promotion.getName());
        promotionDTO.setType(promotion.getType());
        promotionDTO.setStart_date(promotion.getStart_date());
        promotionDTO.setEnd_date(promotion.getEnd_date());
        promotionDTO.setDescription(promotion.getDescription());
        promotionDTO.setApplicable_products(promotion.getApplicable_products());
        promotionDTO.setDiscount_percent(promotion.getDiscount_percent());
        return promotionDTO;
    }

    public static UserDTO mapUserToUserDTO(Users users){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(users.getId());
        userDTO.setEmail(users.getEmail());
        userDTO.setPassword(users.getPassword());
        userDTO.setCreated_at(users.getCreated_at());
        userDTO.setSalt(users.getSalt());
        return userDTO;
    }
}
