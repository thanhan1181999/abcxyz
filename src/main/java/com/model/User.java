package com.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class User {
	@EmbeddedId UserId id;
	Integer age;
}
