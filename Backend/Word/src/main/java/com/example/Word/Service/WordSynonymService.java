package com.example.Word.Service;

import com.example.Word.Entity.WSIPFormat;
import com.example.Word.Entity.WordSynonymPair;
import com.example.Word.Repository.WordSynonymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordSynonymService {

    @Autowired
    private WordSynonymRepository wordSynonymRepo;

    //--------------Adding word synonym pair into *ws_table* by disintegrating the input format "WSIPFormat"---------------
    private Boolean checkPairInExistingList(WordSynonymPair ws)
    {
        List<WordSynonymPair> existingList= (List<WordSynonymPair>) wordSynonymRepo.findAll();
        if(existingList.contains(ws))
        {
            return true;
        }
        else
            return false;
    }

    public void addWordSynonyms(WSIPFormat wslist)
    {
        int i= 0;   //temporary variable for iteration in obtained WSIPFormat
        while(i!=(wslist.getHasSynonyms().size()))
        {
            String word=wslist.getWord();
            String synonym=wslist.getHasSynonyms().get(i);
            WordSynonymPair obj=new WordSynonymPair(word,synonym);
            boolean chk=checkPairInExistingList(obj);
            if(chk==false)
            {
                wordSynonymRepo.save(obj);
            }
            else
            {
                System.out.println(obj +" this word-synonym pair already exists.");
            }
            i++;
        }
    }

    //------------------------showing the contents of *ws_table* by word -----------------------

    private List<WordSynonymPair> searchForWord(String str)
    {
        List<WordSynonymPair> matchedList=new ArrayList<WordSynonymPair>();
        List<WordSynonymPair> existingList= (List<WordSynonymPair>) wordSynonymRepo.findAll();
        int i=0;
        while(i!=existingList.size())
        {
            if((existingList.get(i).getWord().equals(str)))
            {
                matchedList.add(existingList.get(i));
            }
            i++;
        }
        if(matchedList.size() == 0)
        {
            return null;
        }
        else
            return matchedList;
    }

    public WSIPFormat showWSByWord(String str)
    {
        List<WordSynonymPair> matchedList= searchForWord(str);
        if(matchedList!=null)
        {
            List<String> matchedListOfSynonyms =new ArrayList<String>();
            int i=0;
            while(i!=matchedList.size())
            {
                matchedListOfSynonyms.add(matchedList.get(i).getHasSynonym());
                i++;
            }

            WSIPFormat obj=new WSIPFormat(str,matchedListOfSynonyms);
            return obj;
        }
        else
        {
            System.out.println("No word-synonym pair found for word "+ str);
            return null;
        }
    }
    //--------------------------x-------------------------x-------------------x---------------------


}
