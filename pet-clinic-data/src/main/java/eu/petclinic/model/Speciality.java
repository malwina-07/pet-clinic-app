package eu.petclinic.model;

/**
 * Created by @author malwina.k on 18.05.2021
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
