package com.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
class CustomerId implements Serializable {
	   UserId userId;
	   String customerNumber;

	   //implements equals and hashCode
}
