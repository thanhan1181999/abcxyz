package com.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cats")
public class Cat {
	
	@Id
	@GeneratedValue
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	private Integer id;
	
	@Column(name="name")
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	private String name;
	
	@Column(name="weight")
	public Integer getWeight() { return weight; }
	public void setWeight(Integer weight) { this.weight = weight; }
	private Integer weight;
	
	@Embedded
	@AttributeOverride(name = "color", column=@Column(name="shoe_color"))
	private Shoe shoe;
	public Shoe getShoe() {return shoe;}
	public void setShoe(Shoe shoe) {this.shoe = shoe;}
	
}
