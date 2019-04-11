package sda.javaintro.i006_family;

/*
#encapsulation
(Task 1-2 is done!)
1. Umieść klasy które utworzyłeś do tej pory w swoim projekcie w osobnych pakietach tak żeby rozgraniczyć
poszczególne bloki / zagadnienia nauki programowania
2. Dodaj do klas utworzonych w zadaniu na początku zajęć (drzewo genealogiczne) odpowiednie modyfikatory
dostępu na poziomie pól, konstruktorów i metod.

#strings
(Task 4,7 is done!)
4. Dodaj do klas reprezentujących osobę i rodzinę utworzonych w zadaniu na początku zajęć
metody toString(), które w czytelny sposób wyświetlą informacje o obiekcie.
7. * W ramach zadania nr 4 użyj StringBuildera do tworzenia wersji tekstowej obiektów.
 */

public class FamilyTest {


    public static void main(String[] args) {

        Person husband1 = new Person("Jan", "Kowalski", 34);
        Person wife1 = new Person("Ola", "Kowalska", 34);
        Person children1 = new Person("Jaek", "Kowalski", 34);


        Family family1 = new Family(husband1, wife1, children1, "Kowalscy");

        System.out.println(family1);




    }


}
