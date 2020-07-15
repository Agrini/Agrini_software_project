package com.example.Word.Service;


import com.example.Word.Entity.WSIPFormat;
import com.example.Word.Entity.Word;
import com.example.Word.Repository.WordRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WordService {

    @Autowired
    private WordRepository wordrepo;
    private int wid;

    //------------------------For adding elements into *word* table------------------------------------
    public Boolean exists(String w)
    {
        if(wordrepo.existsById(w)) return true;
        else
            return false;
    }
    public void checkAndAddWord(String w1)
    {
        List<Word> existingListWord= (List<Word>) wordrepo.findAll();
        int wid=existingListWord.size()+1;

        Word wordset =new Word(wid, w1 );
        if(!exists(w1))
        {
            wordrepo.save(wordset);
            return;
        }
        else
        {
            System.out.println(w1+" already exists in *word* table.");
            return;
        }

    }
    public void addWord(@NotNull WSIPFormat wslist)
    {
        //add the word into *word* table
        checkAndAddWord(wslist.getWord());
        //add the synonyms into *word* table
        int i=0;
        System.out.println("**********"+wslist.getHasSynonyms().size());
        while(i != (wslist.getHasSynonyms().size()))
        {
            checkAndAddWord(wslist.getHasSynonyms().get(i));
            i++;
        }
    }
    //-------------------x-------------------x------------------------x--------------

    //--------------------For showing contents of *word* table-----------------------
    public List<Word> showWords()
    {
        return (List<Word>) wordrepo.findAll();
    }
    //-------------------x-------------------x------------------------x--------------

}
