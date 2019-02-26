package com.enjoybt.common.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class CommonDAO extends DaoSupport {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

    protected void checkDaoConfig() {
        Assert.notNull(this.sqlSessionTemplate, "Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required");
    }
    
    
    public Object selectObject(String mapperId) throws SQLException {
		return this.sqlSessionTemplate.selectOne(mapperId);
	}
	
	public Object selectObject(String mapperId, Object parameter) throws SQLException {
		return this.sqlSessionTemplate.selectOne(mapperId, parameter);
	}

	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectMap(String mapperId) throws SQLException {
		return (Map<String, Object>)this.sqlSessionTemplate.selectOne(mapperId);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectMap(String mapperId, Object parameter) throws SQLException {
		return (Map<String, Object>)this.sqlSessionTemplate.selectOne(mapperId, parameter);
	}
	
	
	@SuppressWarnings("rawtypes")
	public List selectList(String mapperId) throws SQLException {
		return this.sqlSessionTemplate.selectList(mapperId);
	}
	
	@SuppressWarnings("rawtypes")
	public List selectList(String mapperId, Object parameter) throws SQLException {
		return this.sqlSessionTemplate.selectList(mapperId, parameter);
	}
	
	public Object selectOne(String statement, Object parameter) throws SQLException{
		return this.sqlSessionTemplate.selectOne(statement, parameter);
	}
	
	public Object selectOne(String statement) throws SQLException{
		return this.sqlSessionTemplate.selectOne(statement);
	}
	
	
	
	public int insert(String mapperId) throws SQLException {
		return this.sqlSessionTemplate.insert(mapperId);
	}
	
	public int insert(String mapperId, Object parameter) throws SQLException {
		return this.sqlSessionTemplate.insert(mapperId, parameter);
	}
	
	
	
	public int update(String mapperId) throws SQLException {
		return this.sqlSessionTemplate.update(mapperId);
	}
	
	public int update(String mapperId, Object parameter) throws SQLException {
		return this.sqlSessionTemplate.update(mapperId, parameter);
	}
	
	
	
	public int delete(String mapperId) throws SQLException {
		return this.sqlSessionTemplate.delete(mapperId);
	}
	
	public int delete(String mapperId, Object parameter) throws SQLException {
		return this.sqlSessionTemplate.delete(mapperId, parameter);
	}
	

	
	
}
