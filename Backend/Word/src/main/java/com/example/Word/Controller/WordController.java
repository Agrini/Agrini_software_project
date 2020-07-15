package com.example.Word.Controller;

import com.example.Word.Entity.WSIPFormat;
import com.example.Word.Entity.Word;
import com.example.Word.Service.WordService;
import com.example.Word.Service.WordSynonymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/words")
public class WordController {


    @Autowired
    private WordService wordService;


    @GetMapping
    public List<Word> showWords()
    {
        return wordService.showWords();
    }
}
