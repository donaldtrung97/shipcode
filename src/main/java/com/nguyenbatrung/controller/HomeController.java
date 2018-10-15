package com.nguyenbatrung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		
		
		return "abc";
	} 
	
	@RequestMapping("/trangchu")

	public ModelAndView Trangchu() {
		
		ModelAndView mv = new ModelAndView("trangchu");
		return mv;
	} 
	
	
//	@RequestMapping("/test")
//
//	public ModelAndView Test() {
//		
//		ModelAndView mv = new ModelAndView("NewFile");
//		return mv;
//	} 
	
	@RequestMapping("/chuyenhangngay")

	public ModelAndView ChuyenHangNgay() {
		
		ModelAndView mv = new ModelAndView("chuyenhangngay");
		return mv;
	}
	
	@RequestMapping("/nhandon")

	public ModelAndView NhanDon() {
		
		ModelAndView mv = new ModelAndView("nhandon");
		return mv;
	} 
}
