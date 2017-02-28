package home.petkopc.assignment2.organisation;

public class Google implements Organisation{
    private Integer numberOfEmployees;
    private String nameOfOrganisation;

    public Google(String nameOfOrganisation) {
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

    @Override
    public String toString() {
        return getNameOfOrganisation();
    }
}
