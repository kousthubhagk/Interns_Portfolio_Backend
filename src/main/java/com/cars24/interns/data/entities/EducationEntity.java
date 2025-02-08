package com.cars24.interns.data.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;
import java.util.Date;

@Data
@Document(collection = "education")
@AllArgsConstructor
@NoArgsConstructor
public class EducationEntity {
    @Id
    private String id; // For MongoDB, the id is of type String by default

    private String institution;

//    private String duration; // Using String to represent the range (e.g., "2021 to 2025")
    private String startYear;

    private String endYear;

    private Float cgpa; // float for CGPA, with validation

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }
}
