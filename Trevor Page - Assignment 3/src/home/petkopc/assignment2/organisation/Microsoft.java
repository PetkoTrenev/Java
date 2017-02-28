package home.petkopc.assignment2.organisation;

/**
 * Created by Petko-PC on 2/22/2017.
 */
public class Microsoft implements Organisation {
    private Integer numberOfEmployees;
    private String nameOfOrganisation;

    public Microsoft(String nameOfOrganisation) {
        this.nameOfOrganisation = nameOfOrganisation;
    }

    @Override
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String getNameOfOrganisation() {
        return nameOfOrganisation;
    }

    @Override
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public void setNameOfOrganisation(String nameOfOrganisation) {
        this.nameOfOrganisation = nameOfOrganisation;
    }
}
