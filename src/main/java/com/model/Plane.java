package com.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="planetype",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue("Plane")
public class Plane {
	public Plane(String name_plane, Integer num_plane) {
		super();
		this.name_plane = name_plane;
		this.num_plane = num_plane;
	}
	String name_plane;
	Integer num_plane;
	
	@Id
	@GeneratedValue
	Integer id;
}
