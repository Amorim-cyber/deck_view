package com.hs.deckView.controller;

import com.hs.deckView.model.dto.CardDTO;
import com.hs.deckView.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CardDTO> save(@Valid @RequestBody CardDTO dto){
        return ResponseEntity.ok(cardService.save(dto));
    }

    @PostMapping(value = "/createAll",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CardDTO>> save(@Valid @RequestBody List<CardDTO> list){
        return ResponseEntity.ok(cardService.save(list));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CardDTO> update(@RequestBody CardDTO dto){
        return ResponseEntity.ok(cardService.update(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CardDTO>> findAll(){

        return ResponseEntity.ok(cardService.findAll());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public  ResponseEntity<CardDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(cardService.findById(id));

    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CardDTO> delete(@PathVariable Long id){
        return ResponseEntity.ok(cardService.delete(id));
    }

    @DeleteMapping(value = "/deleteAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CardDTO>> deleteAll(@RequestBody List<CardDTO> list){
        return ResponseEntity.ok(cardService.deleteAll(list));
    }
    
    
}
