package com.java.zumair.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="TODO")
public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    private String description;
    private Date completionDate;
    private boolean isDone;
    
    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    public ToDo(){
    	
    }
	public ToDo(String name, String description, Date completionDate, boolean isDone) {
		super();
		this.name = name;
		this.description = description;
		this.completionDate = completionDate;
		this.isDone = isDone;
	}
    
    
}
