package calculator;

public class Operator {
    private String operateType;

    public Operator(char op){
        if(op == '+'){operateType = "sum";}
        else if (op == '-'){operateType = "substract";}
        else if (op == '/'){operateType = "divide";}
        else if (op == '*'){operateType = "multiply";}
    }
    public String getType(){
        return operateType;
    }
}
