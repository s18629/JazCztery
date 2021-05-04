package com.example.JazCztery;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class SomeController {

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> returnSomeValue(@PathVariable("someValue")  String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> returnReqParam(@RequestParam String reqParam){
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/model")
    public ResponseEntity<Model> returnModel(@RequestBody Model model){
        return ResponseEntity.ok(model);
    }


}
