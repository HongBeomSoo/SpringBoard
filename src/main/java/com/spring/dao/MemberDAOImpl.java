package com.spring.dao;

import com.spring.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Inject
    SqlSession sqlSession;

    private static final String NAMESPACE = "com.spring.mappers.MemberMapper";

    @Override
    public String getTime() {
        return sqlSession.selectOne(NAMESPACE + ".getTime");
    }

    @Override
    public void insertMember(MemberVO memberVO) {
        sqlSession.insert(NAMESPACE + ".insertMember", memberVO);
    }

    @Override
    public MemberVO readMember(String userid) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".selectMember", userid);
    }

    @Override
    public MemberVO readWithPW(String userid, String userpw) throws Exception {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userid", userid);
        paramMap.put("userpw", userpw);
        return sqlSession.selectOne(NAMESPACE + ".readWithPW", paramMap);
    }

}

