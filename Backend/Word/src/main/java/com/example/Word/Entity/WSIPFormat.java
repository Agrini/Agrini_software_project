package com.example.Word.Entity;


import java.util.List;

public class WSIPFormat {

    private String word;
    private List<String> hasSynonyms;


    public String getWord() {
        return word;
    }

    public List<String> getHasSynonyms() {
        return hasSynonyms;
    }

    public WSIPFormat() {
    }

    public WSIPFormat(String word, List<String> hasSynonyms) {
        this.word = word;
        this.hasSynonyms = hasSynonyms;
    }
    @Override
    public String toString() {
        return "WSIPFormat{" +
                "word='" + word + '\'' +
                ", hasSynonyms=" + hasSynonyms +
                '}';
    }
}
