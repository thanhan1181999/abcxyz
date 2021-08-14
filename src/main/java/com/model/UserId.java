package com.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserId implements Serializable{
	String firstname;
	String lastname;
}
