package com.example.Word.Entity;


import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="word")
public class Word {

    @Column(name = "word_id")
    //@GeneratorType(type =GenerationType.AUTO, when = GenerationTime.INSERT)
    //, columnDefinition = "serial")
    //@Generated(GenerationTime.INSERT)
    private int wid;
    @Id
    private String word;



//    @ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.ALL)
//    @JoinTable(
//            name = "ws_table",
//            joinColumns = @JoinColumn(name = "word"),
//            inverseJoinColumns = @JoinColumn(name = "synonym"))
//    private Set<Word> hasSynonyms;

//    public Set<Word> getHasSynonyms() {
//        return hasSynonyms;
//    }
//    public void setHasSynonyms(Set<Word> hasSynonyms) {
//        this.hasSynonyms = hasSynonyms;
//    }
    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWord() {
        return word;
    }

    public Word(int wid, String word) {
        this.wid = wid;
        this.word = word;
    }

    public Word() {
    }

    @Override
    public String toString() {
        return "Word{" +
                "wid=" + wid +
                ", word='" + word + '\'' +
                '}';
    }
}
