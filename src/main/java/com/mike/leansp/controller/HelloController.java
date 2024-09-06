package com.mike.leansp.controller;




import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {
        

   
   
   @GetMapping("/")
    public String helloword(){


    
        return "Wello too Daily  Mike!! !! SALOME12 PAUL";
    }

}
