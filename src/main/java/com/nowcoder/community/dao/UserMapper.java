package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    User selectByName(String username);
    User selectByEmail(String email);
    String selectNameById(Integer id);
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    int updateStatus(Integer id,int status);
    int updateHeader(Integer id,String headerUrl);
    int updatePassword(Integer id,String password);
}