package com.swsa.domain;

import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card
{

    int cardId;
    long cardNo;
    long accountNo;
    String accountHolderName;
    int cvv;
    String cardType;

}


