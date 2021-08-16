package app.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public abstract class GenericDAO<PK extends Serializable, T> extends HibernateDaoSupport {

	@Autowired
	private SessionFactory sessionFactory;

	public T getFindById(PK key) {
		// way 1
		// return (T) getSession().get(getPersistentClass(), key);
		return (T) getSession().load(getPersistentClass(), key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	public void saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
	}

	private Class<T> persistentClass;

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public GenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
