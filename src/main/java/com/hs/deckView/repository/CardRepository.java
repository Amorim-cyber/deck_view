package com.hs.deckView.repository;

import com.hs.deckView.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findByName(String name);


    @Query("SELECT card "+
            "FROM Card card "+
            "WHERE card.id <> :id AND card.name = :name ")
    Optional<Card> findByCardUpdate(Long id, String name);


}
