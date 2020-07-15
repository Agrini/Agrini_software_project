package com.example.Word.Repository;


import com.example.Word.Entity.WordSynonymPair;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordSynonymRepository extends CrudRepository<WordSynonymPair, Integer> {

}
