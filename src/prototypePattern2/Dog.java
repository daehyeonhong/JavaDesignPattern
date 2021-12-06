package prototypePattern2;

public class Dog implements Cloneable {

    private String name;

    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Dog copy() throws CloneNotSupportedException {
        Dog clone = (Dog) this.clone();
        clone.setAge(new Age(this.age.getYear(), this.age.getValue()));
        return clone;
    }

}
