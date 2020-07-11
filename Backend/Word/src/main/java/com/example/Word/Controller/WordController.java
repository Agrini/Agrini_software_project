//package com.example.Word.Controller;
//
//import com.example.Word.Entity.Word;
//import com.example.Word.Service.WordService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value="/word")
//public class WordController {
//
//
//    @Autowired
//    private WordService wordservice;
//
//    @PostMapping
//    public Word addWord(@RequestBody Word w)
//    {
//        return wordservice.addValue(w);
//    }
//
//    @GetMapping
//    public List<Word> showWords()
//    {
//        return wordservice.showValue();
//    }
//}
