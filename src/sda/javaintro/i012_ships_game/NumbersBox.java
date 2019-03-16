package sda.javaintro.i012_ships_game;

import java.util.List;

public class NumbersBox<T> {

    private List<T> items;

    public NumbersBox(List<T> items) {
        this.items = this.items;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public T getFirstElement(){
        if (!isEmpty()){
            return items.get(0);
        }
        return null;
    }
//    public int getFirstElementInt(){
//
//    }



}
