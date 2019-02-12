package com.guest.anno.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("dao")
public class GuestDAOImpl implements GuestDAO{
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<GuestVO> getGuestList() {
		String sql="select * from guestbook";
		List<GuestVO> list = template.query(sql, new GuestMapper());
		return list;
	}

	@Override
	public GuestVO findById(int num) {
		String sql ="select * from guestbook where num=?";
		GuestVO user = template.queryForObject(sql,new Object[] {num},new GuestMapper());
		return user;
	}

	@Override
	public void insert(GuestVO user) {
		String sql = "insert into guestbook values(guestbook_seq.nextval,?,?,?,sysdate,'none')";
		Object[] param = new Object[] {
				user.getName(),user.getContent(),user.getGrade()
		};
		template.update(sql,param);
	}

	@Override
	public void update(GuestVO user) {
		System.out.println(user.getContent());
		System.out.println(user.getName());
		String sql ="update guestbook set name=?, content=?, grade=? where num=?";
		Object[] param = new Object[] {
			user.getName(),user.getContent(),user.getGrade(),user.getNum()
		};
		template.update(sql,param);
	}

	@Override
	public void delete(int num) {
		String sql ="delete from guestbook where num=?";
		template.update(sql,num);
	}


}
