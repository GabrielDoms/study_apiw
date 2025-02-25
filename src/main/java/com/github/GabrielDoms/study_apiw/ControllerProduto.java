package com.github.GabrielDoms.study_apiw;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
@RequestMapping("produtos")
public class ControllerProduto {
 
    public ResponseEntity<String> demo(){
        return ResponseEntity.status(203).body("Mensagem teste");
    }
 
@PostMapping
    public ResponseEntity<String> create(){
        return ResponseEntity.status(201).body("Produto cadastrado:Maçã");
    }
@PutMapping  
    public ResponseEntity <String> uptade(){
        return ResponseEntity.status(200).body("Produto atualizado");
    }
@GetMapping
    public ResponseEntity<String> find(){
        return ResponseEntity.status(200).body("Maçã");
    }
@DeleteMapping
    public ResponseEntity<Void> delete(){
        return ResponseEntity.status(204).build();
    }
}