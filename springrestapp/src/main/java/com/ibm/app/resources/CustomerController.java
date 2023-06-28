package com.ibm.app.resources;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    //apis
    //readAll
    @GetMapping
    public String findAll() {
        return "Customers";
    }

    @PostMapping
    //save
    public String save() {
        return "Save";
    }

    @PutMapping
    //update
    public String update() {
        return "update";
    }

    @DeleteMapping
    //remove
    public String remove() {
        return "Delete";
    }
}
