package com.model;

import java.io.Serializable;

public class TypeDefs{
	String name;
	String descript;
	
	public TypeDefs(String name, String descript) {
		super();
		this.name = name;
		this.descript = descript;
	}
	public String getName() {
		return name;
	}
	public String getDescript() {
		return descript;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
}
