package com.nest.Libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @PostMapping("/")
    public String Adminlogin(){
        return "Admin login page";
    }
}
