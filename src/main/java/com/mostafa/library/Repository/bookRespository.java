package com.mostafa.library.Repository;

import org.springframework.data.repository.CrudRepository;

import com.mostafa.library.model.Book;

public interface bookRespository extends CrudRepository<Book, Integer> {

}
