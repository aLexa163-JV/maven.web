package pro.sky.maven.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("")
    public String calculator() {

        return service.calculator();
    }

    @GetMapping("/plus")
    public String plus(Integer num1, Integer num2) {

        return service.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(Integer num1, Integer num2) {

        return service.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2) {

        return service.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(Double num1, Double num2) {

        return service.divide(num1, num2);
    }

}
