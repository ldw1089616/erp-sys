package com.mini.mapper;


import com.mini.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
	/* 全部用户查询 */
	public List<User> allSearch();

	/* 条件查询 */
	public List<User> getCondition(Map<String, Object> map);

	/* 删除用户 */
	public void deleteUser(User user);

	/* 插入用户 */
	public int insertUser(User user);

	/* 更新用户 */
	public void updateUser(User user);

	/* 获取用户id */
	public User getUserById(Map<String, Object> map);

	/* 获取用户员工号 */
	public User getUserByENo(Map<String, Object> map);
	
	/* 获取用户登陆信息 */
	public User userLogin(Map<String, Object> map);

	/* 通过Username获取用户信息 */
	public User getUserByOpenId(Map<String, Object> map);
}
