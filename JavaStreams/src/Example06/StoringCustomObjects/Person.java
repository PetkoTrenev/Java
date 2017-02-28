package Example06.StoringCustomObjects;

/**
 * Created by Petko on 17.3.2016 г..
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() + "Age: " + this.getAge());
    }
}
