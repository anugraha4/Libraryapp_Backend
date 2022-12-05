package com.nest.Libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @PostMapping("/")
    public String Adminlogin(){
        return "Admin login page";
    }

    @PostMapping("/register")
    public String Register(){
        return "register the user";
    }

    @PostMapping("/entry")
    public String BookEntry(){
        return "book entry";
    }

    @PostMapping("/view")
    public String ViewAll(){
        return "View all books";
    }
}
