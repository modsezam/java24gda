package sda.javaintro.i010_enum;

public class EnumTest {

    public static void main(String[] args) {

        System.out.println("Operacja:");

        System.out.println(Operation.PLUS.getOperations());

        System.out.println(Operation.PLUS.calculate(2,3));


        System.out.println("Przeliczenie PLN na:");
        System.out.println(Currency.DOLAR.getCurrency());
        System.out.println(Currency.DOLAR.calculatePLN(45));


    }

    private static void getEnum (String text){

       // if (Operation.)

    }
}
