package com.example.dynamicJsonRead.dynamicJsonRead.Controller;

import com.example.dynamicJsonRead.dynamicJsonRead.Service.OutputMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getMapping {
String test;
    public void pass(String jsonStringRootdto) {
        test=jsonStringRootdto;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        String message =test;
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }


}





