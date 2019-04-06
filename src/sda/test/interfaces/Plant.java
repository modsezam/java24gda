package sda.test.interfaces;

public interface Plant extends Being {


    @Override
    default boolean isAlive (){
        return getAge() < 1000;
    }
}
