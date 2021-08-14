package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
//@TypeDef(
//		   name = "test_type_def",
//		   defaultForType = TypeDefs.class,
//		   typeClass = TestTypeDef.class
//		)
public class Customer {
	@Id 
	@GeneratedValue(
	    strategy=GenerationType.TABLE, 
	    generator="TABLE_GEN")
	@TableGenerator(
	    name="TABLE_GEN",
	    table ="customer_table_sequence",
	    pkColumnName = "customer_id",
	    valueColumnName = "gen_value",
	    allocationSize=20
	)
	Integer id;
	
//	@Id 
//	@GeneratedValue(generator="system-uuid")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")
//	String id;
	
	@JoinColumns({
		@JoinColumn(name="userfirstname_fk",referencedColumnName = "firstName"),
		@JoinColumn(name="userlastname_fk", referencedColumnName="lastName")
	})
	@OneToOne User user;
	
	@Column
	String descript;
	
	@Version
	@Column
	Integer version;
	
	@Column
	@Temporal(TemporalType.DATE)
	Date ngay_sinh;
	
	@Column(name = "created_datetime")
	@CreationTimestamp
	private Date createdDatetime;
	  
	@Column(name = "updated_datetime")
	@UpdateTimestamp
	private Date updatedDatetime;
	
	@Column(name = "position")
	@Enumerated(EnumType.STRING)
	PositionEnum position;
	
	@Formula("id*10")
	private Integer getNextVersion;
	
//	@Type(type="test_type_def")
//	private TypeDefs typedef;
//	public TypeDefs getTypedef() {
//		return typedef;
//	}
//	public void setTypedef(TypeDefs typedef) {
//		this.typedef = typedef;
//	}
	
	public Integer getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public String getDescript() {
		return descript;
	}
	public Integer getVersion() {
		return version;
	}
	public Date getNgay_sinh() {
		return ngay_sinh;
	}
	public Date getCreatedDatetime() {
		return createdDatetime;
	}
	public Date getUpdatedDatetime() {
		return updatedDatetime;
	}
	public Integer getGetNextVersion() {
		return getNextVersion;
	}
	public void setGetNextVersion(Integer getNextVersion) {
		this.getNextVersion = getNextVersion;
	}
	public Date getDate() {
		return ngay_sinh;
	}
	public void setDate(Date date) {
		ngay_sinh = date;
	}
	
	public Customer(String descript) {
		super();
		this.descript = descript;
	}
	public PositionEnum getPosition() {
		return position;
	}
	public void setPosition(PositionEnum position) {
		this.position = position;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
