package com.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class UserId implements Serializable{
	String firstname;
	String lastname;
}
