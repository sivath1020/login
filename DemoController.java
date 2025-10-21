package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("api")

public class DemoController {
   
    @Autowired
    private Demorepository form;
    
    @PostMapping("{/submit}")
    public String menu(@RequestBody DemoModel FormData ,@PathVariable String demo) {
        form.save(FormData);
        return  "Thank  you for Submitting";
    }
    
    @GetMapping("/all")
    public List<DemoModel> getAllform(){
        return form.findAll();
    }
    
    
    




