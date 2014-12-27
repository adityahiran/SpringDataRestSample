package edu.csus.ecs.careers.cpt.domains;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Table;


@Entity(name="careerskillsandoptions")
public class CareerSkillsAndOptions {
	
	@Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)	
	private int id;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String skills;
		
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public CareerSkillsAndOptions() {}
	
	public CareerSkillsAndOptions(String skills) {
		this.skills = skills;
		System.out.println(skills);
	}

}
