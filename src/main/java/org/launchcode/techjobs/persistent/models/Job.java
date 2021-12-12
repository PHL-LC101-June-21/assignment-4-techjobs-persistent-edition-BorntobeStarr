package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Job extends AbstractEntity{
    @ManyToOne
    private Employer employer;

    @ManyToMany
    @NotEmpty(message = "Must select at least one skill!")
    private List<Skill> skills = new ArrayList<> ();
//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;
//
//    private String employer;
//    private String skills;
//
    public Job() {
    }

    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
