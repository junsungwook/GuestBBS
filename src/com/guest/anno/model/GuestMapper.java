package com.guest.anno.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GuestMapper implements RowMapper<GuestVO>{

	@Override
	public GuestVO mapRow(ResultSet rs, int arg1) throws SQLException {
		GuestVO user = new GuestVO();
		user.setNum(rs.getInt("num"));
		user.setName(rs.getString("name"));
		user.setContent(rs.getString("content"));
		user.setGrade(rs.getString("grade"));
		user.setCreated(rs.getString("created"));
		user.setIpaddr(rs.getString("ipaddr"));
		return user;
	}

}
