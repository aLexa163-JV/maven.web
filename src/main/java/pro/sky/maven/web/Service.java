package pro.sky.maven.web;

import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Service
public class Service {

    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<b>Введите значение!</b>";
        }
        int num3 = num1 + num2;
        return num1 + " + " + num2 + " = " + num3;
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<b>Введите значение!</b>";
        }
        int num3 = num1 - num2;
        return num1 + " - " + num2 + " = " + num3;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<b>Введите значение!</b>";
        }
        int num3 = num1 * num2;
        return num1 + " * " + num2 + " = " + num3;
    }

    public String divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "<b>Введите значение!</b>";
        }
        if (num2 == 0) {
            return "<b>Деление на ноль недопустимо!!!</b>";
        }
        Double num3 = num1 / num2;
        return num1 + " / " + num2 + " = " + num3;
    }

}
