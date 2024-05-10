package org.launchcode.techjobs.oo;

import java.util.Objects;
import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCompetency;
    }

    public Job() {
        this.id = nextId;
        nextId++;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (!(o instanceof Job job)) { return false; }
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        String outputString = lineSeparator() + "ID: " + this.id + lineSeparator();
        if (this.name == null || this.name.isEmpty()) {
            outputString += "Name: Data not available";
        }
        else {
            outputString += "Name: " + this.name;
        }
        outputString += lineSeparator();
        if (this.employer.toString() == null || this.employer.toString().isEmpty()) {
            outputString += "Employer: Data not available";
        }
        else {
            outputString += "Employer: " + this.employer;
        }
        outputString += lineSeparator();
        if (this.location.toString() == null || this.location.toString().isEmpty()) {
            outputString += "Location: Data not available";
        }
        else {
            outputString += "Location: " + this.location;
        }
        outputString += lineSeparator();
        if (this.positionType.toString() == null || this.positionType.toString().isEmpty()) {
            outputString += "Position Type: Data not available";
        }
        else {
            outputString += "Position Type: " + this.positionType;
        }
        outputString += lineSeparator();
        if (this.coreCompetency.toString() == null || this.coreCompetency.toString().isEmpty()) {
            outputString += "Core Competency: Data not available";
        }
        else {
            outputString += "Core Competency: " + this.coreCompetency;
        }
        outputString += lineSeparator();

        return outputString;
    }
}
