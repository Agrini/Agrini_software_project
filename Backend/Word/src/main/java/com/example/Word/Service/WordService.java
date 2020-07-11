package com.example.Word.Service;


import com.example.Word.Entity.Word;
import com.example.Word.Repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    @Autowired
    private WordRepository wordrepo;

    public Word addValue(Word w)
    {
        return wordrepo.save(w);
    }
    public List<Word> showValue()
    {
        return (List<Word>) wordrepo.findAll();
    }
}
