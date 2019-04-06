/*

(Task 1-3 is done!)
1. Napisz klasę, która wykorzysta większość z metod dostępnych w klasie String.
2. Napisz metodę, która zwróci tekst: “Simon says: [{text}]”, gdzie {text} - to argument metody.
Użyj konkatenacji lub StringBuildera.
3. Napisz metodę, która jako argument otrzyma jedną zmienną typu String, usunie z niej białe
znaki z początku i końca tekstu oraz zamieni wszystkie litery na małe.

(Task 4 is done! The solution is in class FamilyTest)
4. Dodaj do klas reprezentujących osobę i rodzinę utworzonych w zadaniu na początku zajęć
metody toString(), które w czytelny sposób wyświetlą informacje o obiekcie.

(Task 5,6 is done!)
5. Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String i zwróci
true jeżeli oba teksty zaczynają się od tego samego znaku.
6. Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String i zwróci
true jeżeli 3 ostatnie znaki w obu tekstach są takie same.

(Task 7 is done! The solution is in class FamilyTest)
7. * W ramach zadania nr 4 użyj StringBuildera do tworzenia wersji tekstowej obiektów.

(Task 8 is done!)
8. * Napisz metodę sprawdzającą, czy dany łańcuch zawiera co najmniej trzy razy słowo “nie”.

 */

package sda.javaintro.i008_strings;

public class Strings {

    public static void main(String[] args) {


        //task 1
        System.out.println("\nlog> Task 1:");
        String test1 = "TEST h  ";
        System.out.println(test1.toLowerCase() + "\n" +
                test1.concat(" tt") + "\n" +
                test1.intern() + "\n" +
                test1.replace("T", "R") + "\n" +
                test1.trim());

        //task2
        System.out.println("\nlog> Task 2:");
        System.out.println(simonSayStringBuilder("Elo"));
        System.out.println(simonSayCon("Elo2"));

        //task3
        System.out.println("\nlog> Task 3:");
        System.out.println(trimStringAndLowerCase("  dasDSAKJ   "));

        //task5
        System.out.println("\nlog> Task 5:");
        System.out.println(compareTwoStrings("Ala", "Aga"));
        System.out.println(compareTwoStrings("Ala", "Ola"));

        System.out.println("\nlog> Task 6:");
        System.out.println(compareTwoStringsThreeLastChar("Marcin", "cin"));
        System.out.println(compareTwoStringsThreeLastChar("Marcin", "nic"));

        System.out.println("\nlog> Task 7:");
        System.out.println(checkWorldNo("nienieni"));
    }


    private static String simonSayStringBuilder(String addString) {
        StringBuilder string = new StringBuilder();
        string.append("Simon says: [").append(addString).append("]");
        return string.toString();
    }

    private static String simonSayCon(String addString) {
        return "Simon says: {" + addString + "]";
    }

    private static String trimStringAndLowerCase(String string) {
        return string.trim().toLowerCase();
    }

    private static boolean compareTwoStrings(String string1, String string2) {

        return string1.charAt(0) == string2.charAt(0);
    }

    private static Boolean compareTwoStringsThreeLastChar(String string1, String string2) {
        String compare1 = string1.substring(string1.length() - 3);
        String compare2 = string2.substring(string2.length() - 3);
        return compare1.compareTo(compare2) == 0;
    }

    public static Boolean checkWorldNo(String string) {

        int result = string.length();
        int resultReplace = string.replaceAll("nie", "").length();
        return (result - resultReplace) >= "nie".length() * 3;
    }


}
