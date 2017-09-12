package com.dbc.dao.impl;
import java.io.Serializable;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.dbc.dao.MultiQueryDAO;
import com.dbc.entity.TbComand;;


public class MultiQueryDAOImpl extends HibernateDaoSupport implements MultiQueryDAO {
	
	/**查询*/
	@SuppressWarnings("unchecked")
	public List<TbComand> getObjects(String queryString){
		List<TbComand> ls = null;
		try 
		{
			ls = (List<TbComand>)this.getHibernateTemplate().find(queryString);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	
	/**查询所有*/
	public List<TbComand> getAllObjects(Class<TbComand> clazz){
		return this.getHibernateTemplate().loadAll(clazz);
	}
	/**通过zzbm获取*/
	public <T> T getObject(Class<T> clazz,Serializable zzbm){
		return this.getHibernateTemplate().get(clazz, zzbm);
	}
}
