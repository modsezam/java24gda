package sda.test.interfaces;

import java.util.*;

public class Zoo {

    public static void main(String[] args) {

        Mammal pies = new Mammal("Pieseł", "hałhał!", 10, false);
        Mammal pies2 = new Mammal("Pieseł2", "hałhał!", 10, false);
        Insect mucha = new Insect("Musza", "bzzbzz", 1, true);
        Insect mucha2 = new Insect("Musza2", "bzzbzz", 1, true);
        Bird wróbel = new Bird("Wródbel", "ćwirćwir!", 3, true);
        Bird wróbel2 = new Bird("Wródbel2", "ćwirćwir!", 3, true);
        Reptile wąż = new Reptile("wążasty", "ssssss....", 5, false);
        Reptile wąż2 = new Reptile("wążasty2", "ssssss....", 5, false);
        Fish sum = new Fish ("summiasty", "bulbulbul", 5, true);
        Fish sum2 = new Fish ("summiasty2", "bulbulbul", 5, true);

//        System.out.println(pies.isAlive());
//        System.out.println(pies.speak());
//        System.out.println("Pływa? " + pies.isSwimming());
//        System.out.println("Pływa? " + pies.isNotSwimming());

        List<Integer> listToRemove = new ArrayList<>();

        List<Animal> listOfAnimals = new ArrayList();
        listOfAnimals.add(pies);
        listOfAnimals.add(pies2);
        listOfAnimals.add(mucha);
        listOfAnimals.add(mucha2);
        listOfAnimals.add(wróbel);
        listOfAnimals.add(wróbel2);
        listOfAnimals.add(wąż);
        listOfAnimals.add(wąż2);
        listOfAnimals.add(sum);
        listOfAnimals.add(sum2);

        List<Animal> listOfAnimals2 = Arrays.asList(sum, sum2, wąż, wróbel);

        System.out.println("\nZwierzęta listy 1. : ");
        for (Animal animal : listOfAnimals){
            System.out.print(animal.getName() + " ");
        }

        System.out.println("\nZwierzęta listy 2. :");
        for (Animal animal : listOfAnimals2){
            System.out.print(animal.getName() + " ");
        }

        System.out.println("\nListy są takie same? " + listOfAnimals.equals(listOfAnimals2));


//        for (int i = listOfAnimals.size() - 1; i >= 0; i--) { // chcę usunąć obiekty które nie występują w listOfAnimals2
//            if (!listOfAnimals2.contains(listOfAnimals.get(i))) {
//                System.out.println("usunięcie z listy: " + i);
//                listOfAnimals.remove(listOfAnimals.get(i)); //Dlaczego nie usuwa wszystkich obiektów spełniających warunek?
//            }
//        }

//        System.out.println("\nLista do usunięcia:");
//        for (int i = listToRemove.size() - 1; i >= 0; i--){
//            System.out.println(listToRemove.get(i) + " ");
//            listOfAnimals.remove(listOfAnimals.get(i));
//        }

        System.out.println("\nZwierzęta listy 1. : ");
        for (Animal animal : listOfAnimals){
            System.out.print(animal.getName() + " ");
        }

        System.out.println("\nZwierzęta listy 2. :");
        for (Animal animal : listOfAnimals2){
            System.out.print(animal.getName() + " ");
        }

        System.out.println("\nListy są takie same? " + listOfAnimals.equals(listOfAnimals2));



//        Iterator<Animal> i1 = listOfAnimals.iterator();
//        while (i1.hasNext()) {
//            String next = i1.next().getName();
//            System.out.println(next);
//        }
//
//        Iterator<Animal> i2 = listOfAnimals.iterator();
//        int sumAge = 0;
//        while (i2.hasNext()) {
//            sumAge  +=  i2.next().getAge();
//        }
//        System.out.println("Wiek łącznie: " + sumAge);
//
//        for (Animal animal : listOfAnimals) {
//            System.out.println(animal.getName() + " mówi: " + animal.speak() + " i jest w wieku: " + animal.getAge() + ".");
//        }
//
//        int sumAge2 = 0;
//        for (Animal animal : listOfAnimals) {
//            sumAge2 += animal.getAge();
//        }
//        System.out.println("Wiek łącznie pętla foreach: " + sumAge2);


    }

}
