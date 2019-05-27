package calculator;
import java.util.*;

public class Calculator{
    private String [] values;
    private Operator op;
    private char [] operators = {'+','-','*','/'};

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

    public double operate(){
        String type = op.getType();
        double num1 = Double.parseDouble(values[0]);
        double num2 = Double.parseDouble(values[1]);
        if(type.equals("sum")){
            return num1+num2;
        }
        else if(type.equals("substract")){
            return num1-num2;
        }
        else if(type.equals("multiply")){
            return num1*num2;
        }
        else if(type.equals("divide")){
            if(num2 != 0)
                return num1/num2;
            else {
                System.out.println("Error de división entre cero");
                return -1;
            }
        }
        return -1;
    }

}
