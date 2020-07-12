package com.example.Word.Entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="word")
public class Word {

    //@GeneratedValue( strategy =GenerationType.AUTO )
    //private int wid;
    //I am using the word as ID so that no word repeats in the table. Also I had removed the word_id so as to simplify the testing procedure
    @Id
    private String word;

    @ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.ALL)
    @JoinTable(
            name = "ws_table",
            joinColumns = @JoinColumn(name = "word"),
            inverseJoinColumns = @JoinColumn(name = "synonym"))
    private Set<Word> hasSynonyms;

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
