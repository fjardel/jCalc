package jcalc;

public class Backend {

    /* Declarando as variáveis */
    
    private double value_a = 0;
    private double value_b = 0;
    private double result = 0;
    private String operator = null;
    
    /* 
    Metodos que recebem ou alteram os valores de entrada. 
    Se o valor recebido não for vazio, recebe entrada. 
    Se o valor recebido for vazio, não recebe entrada. 
    */

    protected void setValueA(String a) {

        if (!a.isEmpty()) {

            this.value_a = Double.valueOf(a);

        } else if (a.isEmpty()) {

            this.value_a = 0;

        }

    }

    protected void setValueB(String b) {

        if (!b.isEmpty()) {

            this.value_b = Double.valueOf(b);

        } else if (b.isEmpty()) {

            this.value_b = 0;

        }

    }
    
    /* Metodo para receber o operador */

    protected void setOperator(String op) {

        if (op == "+" || op == "-" || op == "*" || op == "/") {

            this.operator = op;

        } else {

            this.operator = null;

        }

    }
    
    /* Metodos para pegar as variáveis */

    protected String getValueA() {

        return String.valueOf(this.value_a);

    }

    protected String getValueB() {

        return String.valueOf(this.value_b);

    }

    protected String getOperator() {

        return this.operator;

    }

    protected String getResult() {

        this.result = calc();
        return String.valueOf(this.result);

    }
    
    /* Metodo que faz o calculo */

    private double calc() {

        if (this.value_a != 0 && this.value_b != 0 && this.operator != null) {

            switch (this.operator) {

                case "+":

                    result = value_a + value_b;
                    break;

                case "-":

                    result = value_a - value_b;
                    break;

                case "*":

                    result = value_a * value_b;
                    break;

                case "/":

                    result = value_a / value_b;
                    break;

            }

            return result;

        } else {

            return 0;

        }

    }

}
