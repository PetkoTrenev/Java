package home.petkopc.assignment2.tests;

import home.petkopc.assignment2.human.Employee;
import home.petkopc.assignment2.human.Person;
import home.petkopc.assignment2.organisation.Google;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Petko-PC on 2/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> employees = new ArrayList<Person>();

        Person anEmployee = new Employee();
        anEmployee.setName("Gosho Mihaylov");
        anEmployee.setSex("male");
        Calendar cal = Calendar.getInstance();
        cal.set(1992, 12, 12);
        anEmployee.setDate(cal.getTime());

        // instance of to find if the person is an employee specifically
        if (anEmployee instanceof Employee) {
            ((Employee) anEmployee).setJobTitle("Junior Developer");
            ((Employee) anEmployee).setOrganisation(new Google("Google") {
            });
        }
        // add to the ArrayList
        employees.add(anEmployee);
        System.out.println(anEmployee.toString());
    }
}
