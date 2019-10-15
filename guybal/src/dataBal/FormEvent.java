<<<<<<< HEAD
package dataBal;

import java.util.EventObject;

public class FormEvent extends EventObject {

    private String name;
    private String occupation;
    private int ageCategory;
    private String empCat;
    private String taxId;
    private boolean dutchCitizen;
    private String gender;

    public FormEvent(Object source, String name, String occupation, int ageCat, String empCat, String taxId, boolean dutchCitizen, String gender)
    {
        super(source);

        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCat;
        this.empCat = empCat;
        this.taxId = taxId;
        this.dutchCitizen = dutchCitizen;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAgeCategory()
    {
        return ageCategory;
    }
    public String getEmploymentCategory()
    {
        return empCat;
    }
    public String getTaxId() {
        return taxId;
    }

    public boolean isDutchCitizen() {
        return dutchCitizen;
    }

    public String getGender() {
        return gender;
    }
}
=======
package dataBal;

import java.util.EventObject;

public class FormEvent extends EventObject {

    private String name;
    private String occupation;
    private int ageCategory;
    private String empCat;
    private String taxId;
    private boolean dutchCitizen;
    private String gender;

    public FormEvent(Object source, String name, String occupation, int ageCat, String empCat, String taxId, boolean dutchCitizen, String gender)
    {
        super(source);

        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCat;
        this.empCat = empCat;
        this.taxId = taxId;
        this.dutchCitizen = dutchCitizen;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAgeCategory()
    {
        return ageCategory;
    }
    public String getEmploymentCategory()
    {
        return empCat;
    }
    public String getTaxId() {
        return taxId;
    }

    public boolean isDutchCitizen() {
        return dutchCitizen;
    }

    public String getGender() {
        return gender;
    }
}
>>>>>>> first draft
