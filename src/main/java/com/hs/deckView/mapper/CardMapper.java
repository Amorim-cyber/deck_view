package com.hs.deckView.mapper;

import com.hs.deckView.model.Card;
import com.hs.deckView.model.dto.CardDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardMapper {

    public Card toEntity(CardDTO dto){
        Card card = new Card();

        card.setId(dto.getId());
        card.setArtist(dto.getArtist());
        card.setAttack(dto.getAttack());
        card.setClas(dto.getClas());
        card.setDescription(dto.getDescription());
        card.setCropImage(dto.getCropImage());
        card.setDustCreation(dto.getDustCreation());
        card.setDustDestruction(dto.getDustDestruction());
        card.setEffect(dto.getEffect());
        card.setHealth(dto.getHealth());
        card.setImage(dto.getImage());
        card.setType(dto.getType());
        card.setKeyWord(dto.getKeyWord());
        card.setMana(dto.getMana());
        card.setMinion(dto.getMinion());
        card.setName(dto.getName());
        card.setSchool(dto.getSchool());
        card.setRarity(dto.getRarity());
        card.setSet(dto.getSet());

        return card;
    }

    public CardDTO toDto(Card card){
        CardDTO dto = new CardDTO();

        dto.setId(card.getId());
        dto.setArtist(card.getArtist());
        dto.setAttack(card.getAttack());
        dto.setClas(card.getClas());
        dto.setDescription(card.getDescription());
        dto.setCropImage(card.getCropImage());
        dto.setDustCreation(card.getDustCreation());
        dto.setDustDestruction(card.getDustDestruction());
        dto.setEffect(card.getEffect());
        dto.setHealth(card.getHealth());
        dto.setImage(card.getImage());
        dto.setType(card.getType());
        dto.setKeyWord(card.getKeyWord());
        dto.setMana(card.getMana());
        dto.setMinion(card.getMinion());
        dto.setName(card.getName());
        dto.setSchool(card.getSchool());
        dto.setRarity(card.getRarity());
        dto.setSet(card.getSet());

        return dto;
    }

    public List<CardDTO> toDto(List<Card> list){
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

}
