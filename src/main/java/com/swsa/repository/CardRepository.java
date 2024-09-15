package com.swsa.repository;
import com.swsa.domain.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
    public class CardRepository implements CardEntryRepository<Card>
{
        private static final Logger logger = LoggerFactory.getLogger(CardRepository.class);
        private List<Card> cardList= new ArrayList<>();
        private int index = -1;

        public String store(Card card) {
            logger.info("/inside the CardRepository.store()");
            card.setCardId(++index);
            cardList.add(index, card);
            return card.toString();
        }

        @Override
        public String delete(int CardId) {
            logger.info("/inside the CardRepository.delete()");
            cardList.remove(CardId);
            return "card removed";
        }

        @Override
        public List<Card> retrieve() {
            logger.info("/inside the CardRepository.retrieve()");
            return cardList;
        }

        @Override
        public String search(int index) {
            logger.info("/inside the CardRepository.search()");
            return this.cardList.get(index).toString();
        }

        @Override
        public String update(Card card) {
            logger.info("/inside the CardRepository.search()");
            if (!(card.getAccountHolderName().isBlank() ||card.getAccountHolderName().isEmpty())) {
                this.cardList.get(card.getCardId()).setAccountHolderName(card.getAccountHolderName());
            }
            if (card.getCvv() > 0) {
                this.cardList.get(card.getCvv()).setCvv(card.getCvv());
            }
            return this.cardList.get(card.getCardId()).toString();
        }
    }

