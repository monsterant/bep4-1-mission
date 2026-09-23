package com.back.boundedContext.payout.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
@Configuration
public class PayoutPolicy {
    public static int PAYOUT_READY_WAITING_DAYS;

    @Value("${custom.payout.readyWaitingDays:}")
    public void setPayoutReadyWaitingDays(int payoutReadyWaitingDays) {
        PAYOUT_READY_WAITING_DAYS = payoutReadyWaitingDays;
    }
}
