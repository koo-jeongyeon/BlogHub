package com.plent.plantrow.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.plent.plantrow.dto.UserDto;
import com.plent.plantrow.entity.User;

@Repository
public class UserMapperImpl implements UserMapper{

    private final SqlSession sqlSession;

    public UserMapperImpl(@Qualifier("SqlSessionTemplate") SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUserList(UserDto userDto) {

        return sqlSession.selectList("UserMapper.selectUserList", userDto);
    
    }

    @Override
    public Integer addUserObject(User entity) {

        return sqlSession.insert("UserMapper.addUserObject", entity);
    }

    @Override
    public User getUserObject(User entity) {

        return sqlSession.selectOne("UserMapper.getUserObject", entity);
    }
    
}
