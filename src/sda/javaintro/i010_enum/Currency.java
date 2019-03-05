package sda.javaintro.i010_enum;

/*

1. Utwórz enum Currency, który ma reprezentować walutę. Ograniczmy się do 5 walut: polski złoty, dolar, euro,
jen, funt brytyjski.
2. Utwórz enum Operation, dla którego występować będą wartości: PLUS, MINUS, MULTIPLY, DIVIDE.
3. Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp., a do Operation reprezentację
tekstową: "+", "-" itp
4. Dodaj do enum Operation metodę calculate(double a, double b), która dla dwóch podanych liczb wykona
odpowiednią operację matematyczną oraz wyświetli jej wywołanie w "ładny" sposób na konsoli. Zadbaj o
przykład użycia i wykonanie kilku operacji matematycznych.
5. Do enum Currency dodaj pole oznaczające kurs waluty (w stosunku do polskiego złotego) oraz metodę która
wyliczy wartość podanej kwoty w obcej walucie (np.: 100 zł -> 30 euro)
6. * Zadbaj by można było na bazie reprezentacji tekstowej ("PLN", "+" itp) znaleźć odpowiednią wartość enum
Currency i Operation.
7. * Stwórz klasę Money zawierającą dwa pola: currency i value. Nadpisz metodę do tworzenia wartości
tekstowej (toString()) tak żeby wyświetlała wartość z symbolem waluty, np. 40 EURO. Dodaj metodę
exchange(Currency currency), która zwróci nowy obiekt Money w nowej walucie dla aktualnej wartości.

 */




public enum Currency {

    PLN ("PLN", 0),
    DOLAR ("DOLAR", 3.8),
    EURO ("EURO", 4.4),
    JEN ("JEN", 2.0),
    GBP ("GBP", 5.1);


    private String currency;
    private double course;

    Currency(String currency, double course) {
        this.currency = currency;
        this.course = course;
    }

    public String getCurrency() {
        return currency;
    }

    public double calculatePLN (double currency){
        double result = 0;
        if (this.currency == "DOLAR"){
            result = currency / this.course;
        }
        if (this.currency == "EURO"){
            result = currency / this.course;
        }
        if (this.currency == "JEN"){
            result = currency / this.course;
        }
        if (this.currency == "GBP"){
            result = currency / this.course;
        }

        return result;




    }



}
