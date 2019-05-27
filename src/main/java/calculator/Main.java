package calculator;

public class Main {
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.validate("124*234");
        System.out.println(calculator.operate());
        calculator.validate("Ans+1");
        System.out.println(calculator.operate());
    }
}
