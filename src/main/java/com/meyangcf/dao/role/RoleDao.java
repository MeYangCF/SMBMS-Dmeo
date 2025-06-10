package com.meyangcf.dao.role;

import java.sql.Connection;
import java.util.List;
import com.meyangcf.pojo.Role;

public interface RoleDao {
	
	public List<Role> getRoleList(Connection connection)throws Exception;

}
