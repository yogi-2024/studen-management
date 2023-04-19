package com.BikkadIt.ControllerToUI.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIt.ControllerToUI.Model.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public ModelAndView getbookData() {
		
		Book book= new Book();
		book.setBookId(111);
		book.setBookName("java");
		book.setBookPrice(555.00);
		
		 ModelAndView mav= new  ModelAndView();
		 mav.addObject("Book", book);
		 mav.setViewName("book");
		 
		return mav;
		
	}
	
	@GetMapping("/getBooks")
	public String getBooks(Model model) {
		
		Book book= new Book();
		book.setBookId(111);
		book.setBookName("java");
		book.setBookPrice(550.00);
		
		Book book1= new Book();
		book1.setBookId(112);
		book1.setBookName("python");
		book1.setBookPrice(580.00);
		
		Book book2= new Book();
		book2.setBookId(113);
		book2.setBookName("DataScience");
		book2.setBookPrice(555.00);
		
		List<Book> list= new ArrayList();
		list.add(book);
		list.add(book1);
		list.add(book2);
		
		
		model.addAttribute("books", list);
		
		
		return "books";
		
		
		
	}
	
	
	
}
