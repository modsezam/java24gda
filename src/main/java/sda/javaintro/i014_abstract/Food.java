package sda.javaintro.i014_abstract;

public abstract class Food {

    private String name;

    public String getName() {
        return name;
    }

    public Food(String name) {
        this.name = name;
    }

    public abstract void getTaste();

    public abstract String getType();


}
