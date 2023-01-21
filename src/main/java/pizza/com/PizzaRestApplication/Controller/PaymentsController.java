package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.DTO.PaymentDTO;
import pizza.com.PizzaRestApplication.Entity.Payment;
import pizza.com.PizzaRestApplication.Repository.PaymentsRepository;
import pizza.com.PizzaRestApplication.Utility.ValueMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
    @Autowired
    private PaymentsRepository repository;
    @GetMapping("/all")
    List<PaymentDTO> all() {
       List<Payment> payments = repository.findAll();
       return payments.stream().map(ValueMapper::mapPaymentToPaymentDTO).collect(Collectors.toList());
    }
}
