package com.hs.deckView.service;

import com.hs.deckView.exceptions.BusinessException;
import com.hs.deckView.exceptions.NotFoundException;
import com.hs.deckView.mapper.CardMapper;
import com.hs.deckView.model.Card;
import com.hs.deckView.model.dto.CardDTO;
import com.hs.deckView.repository.CardRepository;
import com.hs.deckView.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private CardMapper cardMapper;

    @Transactional
    public CardDTO save(CardDTO dto){
        Optional<Card> optionalCard = cardRepository.findByIdAndName(dto.getId(), dto.getName());
        if(optionalCard.isPresent()){
            throw new BusinessException(MessageUtils.CARD_ALREADY_EXISTS);
        }
        Card card = cardMapper.toEntity(dto);
        cardRepository.save(card);
        return cardMapper.toDto(card);
    }

    @Transactional
    public List<CardDTO> save(List<CardDTO> listDto){
        listDto.stream().forEach(x->save(x));

        return listDto;
    }

    @Transactional
    public CardDTO update(CardDTO dto){
        Optional<Card> optionalCard = cardRepository.findByCardUpdate(dto.getId(), dto.getName());

        if(optionalCard.isPresent()){
            throw new BusinessException(MessageUtils.NO_RECORDS_FOUND);
        }

        Card card = cardMapper.toEntity(dto);
        cardRepository.save(card);
        return cardMapper.toDto(card);

    }

    @Transactional
    public CardDTO delete(Long cdLocal) {
        CardDTO dto = this.findById(cdLocal);

        cardRepository.deleteById(dto.getId());
        return dto;
    }

    @Transactional
    public List<CardDTO> deleteAll(List<CardDTO> listDto) {
        listDto.stream().forEach(x->delete(x.getId()));
        return listDto;
    }

    @Transactional(readOnly = true)
    public List<CardDTO> findAll() {
        return cardMapper.toDto(cardRepository.findAll());
    }

    @Transactional(readOnly = true)
    public CardDTO findById(Long id){
        return cardRepository.findById(id).map(cardMapper::toDto).orElseThrow(NotFoundException::new);
    }



}
