package com.mostafa.library.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mostafa.library.Services.service;
import com.mostafa.library.model.Book;

@RestController
public class mainRest {
@Autowired
service s;

	@RequestMapping("/books")
	public List<Book> getbooks()
	{	return s.findallbooks();	
	}
	@RequestMapping("/book/{id}")
	public void delete(@PathVariable("id") int id)
	{
	s.remove(id);
	}
	
}
