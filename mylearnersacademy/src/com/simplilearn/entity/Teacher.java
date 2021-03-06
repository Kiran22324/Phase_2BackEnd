package com.simplilearn.entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.security.auth.Subject;

@Entity
@Table(name="Teacher")

public class Teacher 
{
	@Id
	@GeneratedValue
	@Column(name="Teacher_id")
	private int Teacher_id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	
	@OneToMany(mappedBy="Teacher",cascade=CascadeType.ALL)
	List<Subject> Subjects;

	public int getTeacher_id() {
		return Teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		Teacher_id = teacher_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSubjects() {
		StringBuilder sb=new StringBuilder();
		if (Subjects!=null)
		{
			for (Subject p:Subjects)
			{
				sb.append(p.getSubject(null)+",");
			}
		}
		return sb.toString();
	}

	public void setSubjects(List<Subject> subjects) {
		Subjects = subjects;
	}
	
	
	
	
	

	
}
