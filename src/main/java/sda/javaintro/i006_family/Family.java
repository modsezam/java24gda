package sda.javaintro.i006_family;

public class Family {

    private Person husband;
    private Person wife;
    private Person children;
    private String familyName;

    public Family(Person husband, Person wife, Person children, String famillyname) {
        this.husband = husband;
        this.wife = wife;
        this.children = children;
        this.familyName = famillyname;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    public Person getChildren() {
        return children;
    }

    public String getFamillyname() {
        return familyName;
    }

    @Override
    public String toString() {
        return "Family{" +
                "husband=" + husband +
                ", wife=" + wife +
                ", children=" + children +
                ", famillyname='" + familyName + '\'' +
                '}';
    }
}
