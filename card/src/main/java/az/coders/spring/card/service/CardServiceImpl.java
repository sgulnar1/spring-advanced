package az.coders.spring.card.service;

import az.coders.spring.card.client.UserClient;
import az.coders.spring.card.model.CardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{
   @Autowired
    UserClient userClient;

    @Override
    public CardResponse getCard() {
        CardResponse cardResponse = new CardResponse();
        cardResponse.setCardNumber("475626666");
        cardResponse.setUserId(1);
        cardResponse.setUserName(userClient.getName(cardResponse.getUserId()));
        return cardResponse;
    }
}
