package com.mostafa.library.Controller;



import java.io.IOException;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mostafa.library.Services.service;
import com.mostafa.library.model.Book;

@Controller
public class maincontroller {
	@Autowired
	service s;
	
	@RequestMapping("/home")
	public ModelAndView init()
	{
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("books",s.findallbooks());

		return mv;
	}
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("edit");
		mv.addObject("book",s.findBook(id));
		return mv;	
	}
	@RequestMapping("/save")
	public ModelAndView save(Book book)
	{
      s.add(book);
   return init();
	}
	@RequestMapping(value ="/save" ,method=RequestMethod.POST)
	public ModelAndView add(Book book)
	{
      s.add(book);
   return init();
	}
	@RequestMapping("/addnewbook")
	public String newBook()
	{
		return "addbook";
	}

	@RequestMapping(value="/delete")
	public String delete(@RequestParam("id") int id,HttpServletRequest request) throws IOException
	{
		s.remove(id);
		request.setAttribute("books",s.findallbooks());
		return  "index";
	}

}
