package home.petkopc.assignment2.human;

import home.petkopc.assignment2.organisation.Organisation;

import java.util.Calendar;
import java.util.Date;

public class Employee extends Person {
    private String name;
    private String sex;
    private Date birthday;
    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    private Organisation organisation;

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation (Organisation organisation) {
        this.organisation = organisation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.equals("")){
            throw new IllegalArgumentException("This is not a valid name");
        } else {
        this.name = name;
        }
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        if (sex.equalsIgnoreCase("male") || sex.equalsIgnoreCase("female")) {
            this.sex = sex;
        } else {
            throw new IllegalArgumentException("This is not a valid sex.");
        }
    }

    @Override
    public Date getDate() {
        return birthday;
    }

    @Override
    public void setDate(Date birthday) {
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        cal.setTime(birthday);
        try {
            cal.getTime();
        }
        catch (Exception e) {
            System.out.println("Invalid date");
        }
        if (birthday == null) {
            throw new IllegalArgumentException("This is not a valid date.");
        }
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        String message = "birthdate: " + birthday + " organisation: " + getOrganisation() + " as a: " + jobTitle;
        return super.toString() + message;
    }
}
