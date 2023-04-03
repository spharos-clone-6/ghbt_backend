package com.ghbt.ghbt_starbucks.api.purchase.model;

import com.ghbt.ghbt_starbucks.api.purchase.dto.RequestPurchase;
import com.ghbt.ghbt_starbucks.global.error.ServiceException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum PurchaseType {
    KAKAO_PAY("kakao-pay", "카카오페이"),
    STARBUCKS_CARD("starbucks-card", "스타벅스카드"),
    ;
    private String key;
    private String value;

    public static Boolean isKakaoPay(RequestPurchase requestPurchase) {
        return KAKAO_PAY.key.equals(requestPurchase.getPaymentType());
    }

    public static Boolean isStarbucksCard(RequestPurchase requestPurchase) {
        return STARBUCKS_CARD.key.equals(requestPurchase.getPaymentType());
    }

    public static PurchaseType findPurchaseType(RequestPurchase requestPurchase) {
        return Arrays.stream(PurchaseType.values())
                .filter(t -> requestPurchase.getPaymentType().equals(t.getKey()))
                .findFirst()
                .orElseThrow(() -> new ServiceException("잘못된 결제 타입 입력 오류", HttpStatus.BAD_REQUEST));
    }
}
