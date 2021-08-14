package com.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TestTypeDef extends TypeDefs{
	public TestTypeDef(String name, String descript) {
		super(name, descript);
		// TODO Auto-generated constructor stub
	}
	String shoe = "my shoe";
	Boolean bra = true;
}
