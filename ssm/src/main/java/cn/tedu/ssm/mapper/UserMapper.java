package cn.tedu.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.ssm.pojo.User;

public interface UserMapper {
	public List<User> findAll();
	
	//查询一条记录
	@Select("select * from user where id=#{id}")
	public User get(@Param("id") Integer id);
	
	//新增
	@Insert("INSERT INTO USER (NAME,birthday,address) VALUES(#{name},#{birthday},#{address})")
	public void add(User user);
	
	@Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	public void update(User user);
	
	@Delete("delete from user where id=#{id}")
	public void delete(@Param("id") Integer id);
}
