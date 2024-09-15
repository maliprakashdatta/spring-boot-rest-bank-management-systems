package com.swsa.service;
import com.swsa.domain.Card;
import com.swsa.repository.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class CardService {

        private static final Logger logger = LoggerFactory.getLogger(CardService.class);

        @Autowired
        private CardRepository repo;

        public List<Card> retrieveCards() {
            logger.info("/inside the CardService.retrieveCards()");
            return repo.retrieve();
        }

        public String storeCard(Card card) {
            logger.info("/inside the CardService.addCard()");
            return repo.store(card);
        }

        public String deleteCard(int cardId) {
            logger.info("/inside the CardService.removeCard()");
            return repo.delete(cardId);
        }

        public String search(int cardId) {
            logger.info("/inside the CardService.search()");
            return repo.search(cardId);
        }

        public String updateCard(int cardId, Card card) {
            logger.info("/inside the CardService.updateCard()");
            card.setCardId(cardId);
            return repo.update(card);
        }
    }

