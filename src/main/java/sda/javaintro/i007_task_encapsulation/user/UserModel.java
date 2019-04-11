package sda.javaintro.i007_task_encapsulation.user;

public class UserModel {

    private String firstName;
    private String lastName;
    private int age;

    protected UserModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public UserModel (){}

//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }

    @Override
    public String toString() {
        return "- " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }
}
