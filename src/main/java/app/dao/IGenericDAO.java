package app.dao;

import java.io.Serializable;

public interface IGenericDAO<PK extends Serializable, T> extends java.io.Serializable {
	void delete(T entity);

	void saveOrUpdate(T entity);
	
	T getFindById(PK key);
}
