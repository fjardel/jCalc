package jcalc;

public class Backend {

    private double a = 0;
    private double b = 0;
    private double result = 0;
    private String operator = null;

    protected void setValueA(String a) {
        
        this.a = Double.valueOf(a);

    }
    
    protected void setValueB(String b) {
        
        this.b = Double.valueOf(b);
        
    }
    
    protected void setOperator(String op){
        
        this.operator = op;
            
    }
    
    protected String getValueA(){
        
        return String.valueOf(this.a);
        
    }
    
    protected String getValueB(){
        
        return String.valueOf(this.b);
        
    }
    
    protected String getOperator(){
        
        return this.operator;
        
    }
    
    protected String getResult(){
        
        this.result = calc();
        return String.valueOf(this.result);
        
    }
    
    private double calc() {

        if (this.a != 0 && this.b != 0 && this.operator != null) {

            switch (this.operator) {

                case "+":

                    result = a + b;
                    break;

                case "-":

                    result = a - b;
                    break;

                case "*":

                    result = a * b;
                    break;

                case "/":

                    result = a / b;
                    break;

            }

            return result;

        } else {
            
            return 0;
        
        }

    }

}
