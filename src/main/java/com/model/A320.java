package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A320")
public class A320 extends Plane {
	
	public A320(String name_plane, Integer num_plane, String descript) {
		super(name_plane, num_plane);
		this.descript = descript;
	}

	String descript;
}  