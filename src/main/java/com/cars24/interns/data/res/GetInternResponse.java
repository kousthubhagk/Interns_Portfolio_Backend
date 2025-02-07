package com.cars24.interns.data.res;

import com.cars24.interns.data.entities.EducationEntity;
import com.cars24.interns.data.entities.ExperienceEntity;
import com.cars24.interns.data.entities.ProjectEntity;
import lombok.Data;

import java.util.List;

@Data
public class GetInternResponse {

    private String name;

    private String phone;

    private String email;

    private List<ProjectEntity> projects;

    private List<EducationEntity> education;

    private List<ExperienceEntity> experiences;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectEntity> projects) {
        this.projects = projects;
    }

    public List<EducationEntity> getEducation() {
        return education;
    }

    public void setEducation(List<EducationEntity> education) {
        this.education = education;
    }

    public List<ExperienceEntity> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<ExperienceEntity> experiences) {
        this.experiences = experiences;
    }
}
