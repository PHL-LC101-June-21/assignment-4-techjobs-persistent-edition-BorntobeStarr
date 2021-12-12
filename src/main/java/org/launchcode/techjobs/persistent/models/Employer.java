package org.launchcode.techjobs.persistent.models;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    private String location;
    @NotBlank
    private String Location;

    @OneToMany(mappedBy = "employer")
    private List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank String location){
        this.location = location;
    }

    public Employer () {}

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
