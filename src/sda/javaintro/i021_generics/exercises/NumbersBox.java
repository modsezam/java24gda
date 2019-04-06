package sda.javaintro.i021_generics.exercises;

import java.util.List;

public class NumbersBox<T> {

    private List<T> items;

    public NumbersBox(List<T> items1) {
        this.items = items1;
    }

    private boolean isEmpty(){
        return items.isEmpty();
    }

//    public T getFirstElement(){
//        if (!isEmpty()){
//            return items.get(0);
//        }
//        return null;
//    }


//    public int getFirstElementInt(){
//
//    }



}
