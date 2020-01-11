package com.mostafa.library.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mostafa.library.Repository.bookRespository;
import com.mostafa.library.model.Book;

@Service
public class service {
	@Autowired
	bookRespository repo;
	public List<Book> findallbooks()
	{
		return (List<Book>)repo.findAll();
	}
	public void remove(int a)
	{
		repo.deleteById(a);
	}
	public Book findBook(int id)
	{
		return repo.findById(id).orElse(null);
	}

	public void add(Book b)
	{
		repo.save(b);
	}
}
