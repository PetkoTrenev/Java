package home.petkopc.assignment2.human;

import java.util.Date;

/**
 * Created by Petko-PC on 2/22/2017.
 */
public abstract class Person {
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getSex();
    public abstract void setSex(String sex);
    public abstract Date getDate();
    public abstract void setDate(Date birthday);

    @Override
    public String toString() {
        return "Name: " + getName() + " Sex: " + getSex() + "\n";
    }
}
