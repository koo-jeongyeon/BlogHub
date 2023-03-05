package com.plent.plantrow.mapper;

import java.util.List;

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
    public Integer addUserObject(UserDto dto) {

        return sqlSession.insert("UserMapper.addUserObject", dto);
    }
    @Override
    public User findByUsername(String username) {

        return sqlSession.selectOne("UserMapper.findByUsername", username);
    }

}
