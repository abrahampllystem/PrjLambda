package pe.com.demo.java.prjlambda.decimal;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

public class TesttDecimal {

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("20.00");
        BigDecimal number3 = new BigDecimal("40.00");
        BigDecimal decimal = BigDecimal.ZERO;


        System.out.println("resultado de la resta del decimal :" + decimal.subtract(number3));




//        BigDecimal number1 =null;
        BigDecimal number2 = new BigDecimal("40.00");
        if (Optional.ofNullable(number1).isEmpty()){
            System.out.println("valor es vacio");
            return;
        }

        if (number1.compareTo(number2) == 0){
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

    }
}
