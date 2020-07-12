package com.example.Word.Entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="word")
public class Word {

    @Id
    private String word;

    @ManyToMany
    @JoinTable(
            name = "ws_table",
            joinColumns = @JoinColumn(name = "word"),
            inverseJoinColumns = @JoinColumn(name = "synonym"))
    private Set<Word> hasSynonyms;
//    @ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.ALL,mappedBy ="synonyms")
//    private Set<Word> synonyms;

    public Set<Word> getHasSynonyms() {
        return hasSynonyms;
    }

    public void setHasSynonyms(Set<Word> hasSynonyms) {
        this.hasSynonyms = hasSynonyms;
    }
//    public int getWid() {
//        return wid;
//    }
//
//    public void setWid(int wid) {
//        this.wid = wid;
//    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

//    public Set<Word> getSynonyms() {
//        return synonyms;
//    }
//
//    public void setSynonyms(Set<Word> synonyms) {
//        this.synonyms = synonyms;
//    }

    public Word() {
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", hasSynonyms=" + hasSynonyms +
                '}';
    }
}
