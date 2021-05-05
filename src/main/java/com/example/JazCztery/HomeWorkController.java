package com.example.JazCztery;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeWorkController {


    @GetMapping("/getpath/{id}/{title}")
    public ResponseEntity<Homework> returnGetMappingPath(@PathVariable("id") String id,
                                                         @PathVariable("title") String title, Homework homework) {
        return ResponseEntity.ok(homework);
    }

    @GetMapping("/getRequest")
    public ResponseEntity<Homework> returnGetMappingRequest(@RequestParam("id") String id,
                                                            @RequestParam("title") String title, Homework homework) {
        return ResponseEntity.ok(homework);
    }

    @PutMapping("/putmapping")
    public ResponseEntity<Homework> putMapping(@RequestBody Homework homework){
        return ResponseEntity.ok(homework);
    }

    @PostMapping("/postmapping")
    public ResponseEntity<Homework> postMapping(@RequestBody Homework homework){
        return ResponseEntity.ok(homework);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteMapping(){
        return ResponseEntity.ok("entity deleted");
    }


}
