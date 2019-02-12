package com.guest.anno.model;

import java.util.List;

public interface GuestDAO {

	List<GuestVO> getGuestList();
	GuestVO findById(int num);
	void insert(GuestVO user);
	void update(GuestVO user);
	void delete(int num);
	
}
