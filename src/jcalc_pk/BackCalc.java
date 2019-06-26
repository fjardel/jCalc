package jcalc_pk;

public class BackCalc {

	private double a = 0;
	private double b = 0;
	private String op = "";

	// ++++++++++++++++++++++++++++++++ GET and SET ++++++++++++++++++++++++++++++++
	
	protected void setValueA(String input) {

		this.a = Double.valueOf(input);

	}

	protected String getValueA() {

		return String.valueOf(a);

	}

	protected void setValueB(String input) {

		this.b = Double.valueOf(input);

	}

	protected String getValueB() {

		return String.valueOf(b);

	}

	protected void setOp(String input) {

		this.op = String.valueOf(input);

	}

	protected String getOp() {

		return this.op;

	}
	
	// ++++++++++++++++++++++++++++++++ Case Operator ++++++++++++++++++++++++++++++++

	protected String result() {

		if (!op.equals("")) {

			switch (this.op) {

			case "+":

				return String.valueOf(a + b);

			case "-":

				return String.valueOf(a - b);

			case "*":

				return String.valueOf(a * b);

			case "/":

				return String.valueOf(a / b);

			}

		} else {

			return "0";

		}

		return "0";

	}

	protected boolean invalidOperation() { //Operation invalid

		if ((this.b == 0) && (this.op.equals("/"))) {

			return true;

		} else {

			return false;

		}

	}

	protected void cleanValues() { //Clear all values input

		this.a = 0;
		this.b = 0;
		this.op = "";

	}

}
