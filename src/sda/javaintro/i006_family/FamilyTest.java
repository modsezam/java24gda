package sda.javaintro.i006_family;

public class FamilyTest {


    public static void main(String[] args) {

        Person husband1 = new Person("Jan", "Kowalski", 34);
        Person wife1 = new Person("Ola", "Kowalska", 34);
        Person children1 = new Person("Jaek", "Kowalski", 34);


        Family family1 = new Family(husband1, wife1, children1, "Kowalscy");

        System.out.println(family1);




    }


}
