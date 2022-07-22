package br.com.kaique.linguagemapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
    
}
