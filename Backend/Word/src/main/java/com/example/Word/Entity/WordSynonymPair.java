package com.example.Word.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ws_table")
public class WordSynonymPair {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int sw_id;
    @Column(name="word")
    private String word;
    @Column(name="synonyms")
    private String hasSynonym;
//    @EmbeddedId
//    private WSId wsid;
//
//    public WSId getWsid() {
//        return wsid;
//    }
//
//    public void setWsid(WSId wsid) {
//        this.wsid = wsid;
//    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getHasSynonym() {
        return hasSynonym;
    }

    public void setHasSynonym(String hasSynonym) {
        this.hasSynonym = hasSynonym;
    }

    public WordSynonymPair() {
    }

    public int getSw_id() {
        return sw_id;
    }

    public void setSw_id(int sw_id) {
        this.sw_id = sw_id;
    }

    public WordSynonymPair(String word, String hasSynonym) {
        this.word = word;
        this.hasSynonym = hasSynonym;
    }


    @Override
    public String toString() {
        return "WordSynonym{" +
                "word='" + word + '\'' +
                ", hasSynonym=" + hasSynonym +
                '}';
    }
}
