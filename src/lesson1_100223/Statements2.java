import java.util.Scanner;

public class Statements2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>> Task 6 - #statements");
        System.out.println("Give an integer (from task1):");
        int a = scanner.nextInt();
        checkNumber1(a);

        System.out.println("\nGive a rating (intiger)(from task2):");
        int rating = scanner.nextInt();
        System.out.println("Rating " + rating + " in Polish is \"" + ratingOnString(rating) + "\"");

        System.out.println("\nGive a Arabic digit (intiger)(from task3):");
        int digit = scanner.nextInt();
        System.out.println(digit + " in Arabic is " + digitInArabic(digit));

        System.out.println("\nGive a char from range (0-9), (A-Z), (a-z) (from task4):");
        String unicodeSymbolString = scanner.next();
        char unicodeSymbol = unicodeSymbolString.charAt(0);
        System.out.println(isUnicodeSymbol(unicodeSymbol));

        System.out.println("\nGive a day of the week (intiger) (from task5):");
        int day = scanner.nextInt();
        System.out.println(dayOfTheWeek(day));

    }


    private static void checkNumber2(int a){
        if ( a < 0)
            System.out.println("Variable a " + a + " is lower then 0");
        if ( a >= 1 && a <= 10)
            System.out.println("Variable a " + a + " is from the range of numbers (1-10)");
        if ( a >= 11 && a <= 100)
            System.out.println("Variable a " + a + " is from the range of numbers (11-100)");
        if ( a >= 101 && a <= 1000)
            System.out.println("Variable a " + a + " is from the range of numbers (101-1000)");
        if ( a >= 1001 && a <= 10_000)
            System.out.println("Variable a " + a + " is from the range of numbers (1001-10000)");
        if ( a > 10_000)
            System.out.println("Variable a " + a + " is grater then 10000");
    }


    private static void checkNumber1(int a){
        if ( a < 0)
            System.out.println("Variable a " + a + " is lower then 0");
        else if ( a <= 10)
            System.out.println("Variable a " + a + " is from the range of numbers (1-10)");
        else if ( a <= 100)
            System.out.println("Variable a " + a + " is from the range of numbers (11-100)");
        else if ( a <= 1000)
            System.out.println("Variable a " + a + " is from the range of numbers (101-1000)");
        else if ( a <= 10_000)
            System.out.println("Variable a " + a + " is from the range of numbers (1001-10000)");
        else
            System.out.println("Variable a " + a + " is grater then 10000");
    }

    private static String ratingOnString (int a){
        switch(a){
            case 1: return "pała";
            case 2: return "mierny";
            case 3: return "trójka";
            case 4: return "czwórka";
            case 5: return "piątka";
            case 6: return "szustka";
        }
    return "error";
    }

    private static String digitInArabic (int a){
        switch(a){
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
        }
        return "!error!\ndigit is not from the range (1 -9)!";
    }


    private static String isUnicodeSymbol (char unicodeSymbol){
        // 0-9 -> 48-57, A-Z -> 65-90, a-z -> 97-122
        if ((int)unicodeSymbol >= 48 && (int)unicodeSymbol <=57){
            return ("Unicode char from range (0-9) ; " + unicodeSymbol);
        }
        else if ((int)unicodeSymbol >= 65 && (int)unicodeSymbol <=90){
            return ("Unicode char from range (A-Z) ; " + unicodeSymbol);
        }
        else if ((int)unicodeSymbol >= 97 && (int)unicodeSymbol <=122){
            return ("Unicode char from range (a-z) ; " + unicodeSymbol);
        }
        else {
            return ("Unicode \"" +  unicodeSymbol + "\" is not from range (0-9), (A-Z), (a-z)");
        }
    }

    private static String dayOfTheWeek (int a){
        switch(a){
            case 1: return "Monday" + ", to weekend is " + (6 - a) + " days" ;
            case 2: return "Tuesday" + ", to weekend is " + (6 - a) + " days" ;
            case 3: return "Wednesday" + ", to weekend is " + (6 - a) + " days" ;
            case 4: return "Thursday" + ", to weekend is " + (6 - a) + " days" ;
            case 5: return "Friday" + ", to weekend is " + (6 - a) + " day" ;
            case 6: return "Saturday" + ", weekend!";
            case 7: return "Sunday" + ", weekend!";
        }
        return a + " is not a day of the week!";
    }
}
