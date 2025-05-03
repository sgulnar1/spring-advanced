package az.coders.spring.card.controller;

import az.coders.spring.card.model.CardResponse;
import az.coders.spring.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @Autowired
    CardService cardService;
    @GetMapping
    public CardResponse getCard( ){
        return cardService.getCard();
    }
}
