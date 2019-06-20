package jcalc;

public class Backend {
    
    private double a = 0;
    private double b = 0;
    public double result = 0; 
    private String op = null;
    
    protected void getValues(String value, String op){
            
        if (this.a == 0){
            
            a = Double.parseDouble(value);
            
        } else if (this.b == 0){
            
            b = Double.parseDouble(value);
            
        }
        
        if (this.op == null) {
            
            this.op = op;
            
        }
        
        if (this.a != 0 && this.b != 0 && this.op != null){
            
            this.result = calc();
            clean();
            
        }
        
    }
    
    protected double calc(){
        
        switch (op){
            
            case "+":
                
                result = a+b;
                break;
            
            case "-":
                
                result = a-b;
                break;
            
            case "*":
                
                result = a*b;
                break;
            
            case "/":
                
                result = a/b;
                break;
            
        }
        
        return result;
                
    }
    
    public void clean(){
        
        this.a = 0;
        this.b = 0;
        this.op = null;
    
    }
    
}
