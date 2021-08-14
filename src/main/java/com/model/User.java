package com.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@EmbeddedId 
	@GeneratedValue
	UserId id;
	Integer age;
	
//	@Id
//	Integer userCode;
}
