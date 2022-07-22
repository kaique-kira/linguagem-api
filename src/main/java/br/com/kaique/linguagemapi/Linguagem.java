package br.com.kaique.linguagemapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor 
@Document(collection = "PrincipaisLinguagens")
public class Linguagem {

    @Id
    private String id;

    private String title;

    private String image;
    
    private int ranking;
    
}
