package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Job extends AbstractEntity{


//    private String employer;
    //Many jobs have one Employer
    @ManyToOne
    private Employer employer;


//    private String skills;
    @ManyToMany
    private List<Skill> skills;


    public Job() {
    }

    // Initialize the id and value fields.
//    public Job(String anEmployer, String someSkills) {
    //public Job(Employer anEmployer, String someSkills) {
    public Job(Employer anEmployer, List<Skill> someSkills) {

        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.


    //public String getEmployer() {
    public Employer getEmployer() {
        return employer;
    }

//    public void setEmployer(String employer) {
    public void setEmployer(Employer employer){
      this.employer = employer;
  }


//    public String getSkills() {
public List<Skill> getSkills() {
    return skills;
    }

//    public void setSkills(String skills) {
public void setSkills(List<Skill> skills) {
    this.skills = skills;
    }

}
