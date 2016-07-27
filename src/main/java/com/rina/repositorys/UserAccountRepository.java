package com.rina.repositorys;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.neo4j.cypher.internal.compiler.v2_1.planner.logical.steps.selectCovered;
import org.springframework.stereotype.Repository;

import com.rina.model.UserAccount;

@Repository
public interface UserAccountRepository {
	
	@Results(value={
			    @Result(property="id",column="id"),
			    @Result(property="username",column="username"),
			    @Result(property="money",column="money")
	})
	@Select("select id,username,money from tbuseraccount")
	public ArrayList<UserAccount> viewAccount();
	
	@Insert("insert into tbuseraccount(id,username,money) values(#{id},#{username},#{money})")
	boolean newAccount(UserAccount useraccount);
	
	
	
}
