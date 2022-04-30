package com.simplilearn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Subject")

public class Subject 
{
	@Id
	@GeneratedValue
	@Column(name="Subject1_Physics")
	private String Subject1_Physics;
	@Column(name="Subject2_Maths")
	private String Subject2_Maths;
	@Column(name="Subject3_Chemistry")
	private String Subject3_Chemistry;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Teacher_id")
	Teacher teacher;

	public String getSubject1_Physics() {
		return Subject1_Physics;
	}

	public void setSubject1_Physics(String subject1_Physics) {
		Subject1_Physics = subject1_Physics;
	}

	public String getSubject2_Maths() {
		return Subject2_Maths;
	}

	public void setSubject2_Maths(String subject2_Maths) {
		Subject2_Maths = subject2_Maths;
	}

	public String getSubject3_Chemistry() {
		return Subject3_Chemistry;
	}

	public void setSubject3_Chemistry(String subject3_Chemistry) {
		Subject3_Chemistry = subject3_Chemistry;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
	
}
