package calculator;
import java.util.*;

public class Calculator{
    private String [] values;
    private Operator op;
    private char [] operators = {'+','-','*','/'};
    private double Ans;
    public Calculator() {
        values = new String[2];
    }

    public boolean isOperator(char op){
        for(int i = 0; i < 4; i++){
            if(op == operators[i]) return true;
        }
        return false;
    }

    public void validate(String operation){
        String term = "";
        for(int i = 0; i < operation.length();i++){
            if(isOperator(operation.charAt(i))){
                values[0] = term;
                term = "";
                op = new Operator(operation.charAt(i));
            }
            else {
                term = term + operation.charAt(i);
            }
        }
        values[1] = term;
    }

    private double parseToNumber(String value)
    {
        if(value.equals("Ans"))
            return Ans;
        else
            return Double.parseDouble(value);
    }

    public double operate(){
        String type = op.getType();
        double num1 = parseToNumber(values[0]);
        double num2 = parseToNumber(values[1]);
        if(type.equals("sum")){
            Ans = num1+num2;
            return num1+num2;
        }
        else if(type.equals("substract")){
            Ans = num1 - num2;
            return num1-num2;
        }
        else if(type.equals("multiply")){
            Ans = num1*num2;
            return num1*num2;
        }
        else if(type.equals("divide")){
            if(num2 != 0) {
                Ans = num1/num2;
                return num1 / num2;
            }
            else {
                System.out.println("Error de división entre cero");
                return -1;
            }
        }
        return -1;
    }

}
