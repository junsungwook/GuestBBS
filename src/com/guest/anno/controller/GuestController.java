package com.guest.anno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.guest.anno.model.GuestDAOImpl;
import com.guest.anno.model.GuestVO;

@Controller
public class GuestController {

	@Autowired
	private GuestDAOImpl dao;
	
	//insert-form
	@RequestMapping("/insert.go")
	public ModelAndView insert() {
		return new ModelAndView("guestInsert");
	}
	//insert
	@RequestMapping(value="/insert.go",method=RequestMethod.POST)
	public ModelAndView insert(GuestVO user) {
		dao.insert(user);
		return new ModelAndView("redirect:list.go");
	}
	//list
	@RequestMapping("/list.go")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		List<GuestVO> list = dao.getGuestList();
		mv.addObject("list",list);
		mv.setViewName("list");
		return mv;
	}
	//detail
	@RequestMapping("/detail.go")
	public ModelAndView detail(int num) {
		ModelAndView mv = new ModelAndView();
		GuestVO user = dao.findById(num);
		mv.addObject("user",user);
		mv.setViewName("detail");
		return mv;
	}
	//update
	@RequestMapping(value="/update.go",method=RequestMethod.POST)
	public ModelAndView update(GuestVO user) {
		dao.update(user);
		return new ModelAndView("redirect:list.go");
	}
	
	//delete
	@RequestMapping("/delete.go")
	public ModelAndView delete(int num) {
		dao.delete(num);
		return new ModelAndView("redirect:list.go");
	}
}
