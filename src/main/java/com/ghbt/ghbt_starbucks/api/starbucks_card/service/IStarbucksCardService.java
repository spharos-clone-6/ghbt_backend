package com.ghbt.ghbt_starbucks.api.starbucks_card.service;

import com.ghbt.ghbt_starbucks.api.starbucks_card.dto.RequestEnrollStarbucksCard;
import com.ghbt.ghbt_starbucks.api.starbucks_card.dto.ResponseStarbucksCard;
import java.util.List;

public interface IStarbucksCardService {

    List<ResponseStarbucksCard> getAllMobileCard();

    ResponseStarbucksCard getOneMobileCard(Long mobileCardId);

    Long enrollMobileCard(RequestEnrollStarbucksCard requestEnrollStarbucksCard);
}
