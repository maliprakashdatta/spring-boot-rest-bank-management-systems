package com.swsa.controller;
import com.swsa.domain.Card;
import com.swsa.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class CardController {

        @Autowired
        private CardService cardService;

        //@RequestMapping(path = "/training", method = RequestMethod.GET)
        @GetMapping("/card")
        public List<Card> retrieveCards() {
            return cardService.retrieveCards();
        }

        @GetMapping("/card/{cardId}")
        public String retrieveCardsForcardId(@PathVariable int cardId) {
            return cardService.search(cardId);
        }

        @DeleteMapping("/card/{cardId}")
        public String deleteCardForaccountNumber(@PathVariable int cardId) {
            return cardService.deleteCard(cardId);
        }

        @PostMapping("/card")
        public String addCard(@RequestBody Card card) {
            return cardService.storeCard(card);
        }

        @PutMapping("/card/{cardId}")
        public String updateCardForaccountNumber(@PathVariable int cardId, @RequestBody Card card) {

            return cardService.updateCard(cardId, card);
        }


    }



