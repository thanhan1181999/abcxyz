package com.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@EmbeddedId CustomerId id;
	
	@MapsId("userId")
	@JoinColumns({
		@JoinColumn(name="userfirstname_fk",referencedColumnName = "firstName"),
		@JoinColumn(name="userlastname_fk", referencedColumnName="lastName")
	})
	@OneToOne User user;
}
