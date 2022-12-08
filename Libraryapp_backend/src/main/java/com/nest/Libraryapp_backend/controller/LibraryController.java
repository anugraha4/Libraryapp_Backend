package com.nest.Libraryapp_backend.controller;

import com.nest.Libraryapp_backend.dao.LibraryDao;
import com.nest.Libraryapp_backend.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String Adminlogin(){
        return "Admin login page";
    }


    @CrossOrigin(origins = "*")
    @PostMapping("/register")
    public String Register(){
        return "register the user";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/entry",consumes = "application/json",produces = "application/json")
    public String BookEntry(@RequestBody Library l){
        System.out.println(l.getBooktitle().toString());
        System.out.println(l.getAuthor().toString());
        System.out.println(l.getDescription().toString());
        System.out.println(l.getPublisher().toString());
        System.out.println(l.getDistributor().toString());
        System.out.println(l.getPrice().toString());
        System.out.println(l.getImage().toString());
        dao.save(l);
        return "book entry succcessful";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Library> ViewAll(){
        return (List<Library>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Library> BookSearch(@RequestBody Library l)
    {
        System.out.println(l.getBooktitle());

        return (List<Library>)dao.Searchbook(l.getBooktitle());
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String DeleteBook(){
        return "delete book";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String EditBook(){
        return "edit books";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/issue")
    public String Issue(){
        return "issue book";
    }
}
