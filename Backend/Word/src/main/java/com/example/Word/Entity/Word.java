package com.example.Word.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="word")
public class Word {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int wid;
    @Id
    private String word;
    @ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.ALL,mappedBy ="synonyms")
    @JoinTable(name="word_synonyms", joinColumns = {@JoinColumn(name="word")}, inverseJoinColumns = {@JoinColumn(name="synonym")})
    private List<Word> synonyms;

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Word> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<Word> synonyms) {
        this.synonyms = synonyms;
    }

    public Word() {
    }

    @Override
    public String toString() {
        return "Word{" +
                "wid=" + wid +
                ", word='" + word + '\'' +
                ", synonyms=" + synonyms +
                '}';
    }
}
