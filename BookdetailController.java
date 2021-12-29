package com.example.Bookdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Bookdetails.domain.Bookdetail;
import com.example.Bookdetails.service.BookdetailService;

@Controller
public class BookdetailController {
	
	@Autowired
	private BookdetailService service;
	
	 @GetMapping("/")
	    public String viewHomePage(Model model) {
	        List<Bookdetail> listbook = service.listAll();
	        model.addAttribute("listbook", listbook);
	        System.out.print("Get / ");
	        return "index";
	    }
	 
	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("book", new Bookdetail());
	        return "new";
	    }
	 
	   @RequestMapping(value = "/save", method = RequestMethod.POST)
	   // @PostMapping("/book/{id}")
	    public String saveBook(@ModelAttribute("book") Bookdetail book) {
	        service.save(book);
	        return "redirect:/";
	    }
	 
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditBookdetailPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("new");
	        Bookdetail book = service.get(id);
	        mav.addObject("book", book);
	        return mav;
	       
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteBookdetailPage(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/";
	    }
	
	 }
