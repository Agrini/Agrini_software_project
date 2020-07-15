package com.example.Word.Controller;

import com.example.Word.Entity.WSIPFormat;
import com.example.Word.Entity.Word;
import com.example.Word.Service.WordService;
import com.example.Word.Service.WordSynonymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/wordsynonym")
public class WordSynonymController {
    @Autowired
    private WordService wordService;
    @Autowired
    private WordSynonymService wordSynonymService;

    @PostMapping
    public void addWordSynonyms(@RequestBody WSIPFormat wsipFormat)
    {
        wordService.addWord(wsipFormat);
        wordSynonymService.addWordSynonyms(wsipFormat);
    }

    @GetMapping(value="/{str}")
    public WSIPFormat showWords(@PathVariable("str") String str)
    {
        return  wordSynonymService.showWSByWord(str);
    }

}
