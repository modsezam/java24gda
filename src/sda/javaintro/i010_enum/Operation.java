package sda.javaintro.i010_enum;

public enum Operation {

    PLUS ("+"),
    MINUS ("-"),
    MULTIPY ("*"),
    DIVIDE ("/");

    private String operations;

    Operation(String operations) {
        this.operations = operations;
    }

    public String getOperations() {
        return operations;
    }

    public double calculate(double a, double b) {

        double c = 0;

        if (this.operations == "+"){
            c = a + b;
        }

        if (this.operations == "-"){
            c = a - b;
        }

        if (this.operations == "*"){
            c = a * b;
        }

        if (this.operations == "/"){
            c = a / b;
        }

        return c;
    }
}
