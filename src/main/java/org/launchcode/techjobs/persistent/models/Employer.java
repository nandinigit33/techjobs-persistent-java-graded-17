package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotNull(message = "Location is required")
    @Size(min = 3, max =50, message = "Location should be between 3 and 50 characters")
    private String location;
//add a field jobs on Employer to list the jobs associated with each instance.

    //one Employer may contain several jobs.
    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

//the no-arg constructor required for Hibernate to create an object.
    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //getter is very important to get and display the data
    public List<Job> getJobs() {
        return jobs;
    }
}
