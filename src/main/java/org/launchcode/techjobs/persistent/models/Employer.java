package org.launchcode.techjobs.persistent.models;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

//    private String location;
//    @NotBlank
//    private String Location;

    @NotBlank(message = "Location is required.")
    @Size(min = 1, max = 100)
    public String location;

    //Set one to many
    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    //no arg consstructor
    public Employer() {}

    public Employer(String location) {
        super();
        this.location = location;
    }

        //Getters and setters:

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public List<Job> getJobs() {
            return jobs;
        }

        public void setJobs(List<Job> jobs) {
            this.jobs = jobs;
        }

//
//    public Employer(@NotBlank String location){
//        this.location = location;
//    }
//
//    public Employer () {}
//
//    public String getLocation(){
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
}
