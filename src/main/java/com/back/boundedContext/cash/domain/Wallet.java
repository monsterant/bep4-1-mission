package com.back.boundedContext.cash.domain;

import com.back.global.jpa.entity.BaseManualIdAndTime;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "CASH_WALLET")
@NoArgsConstructor
@Getter
public class Wallet extends BaseManualIdAndTime {

    @ManyToOne(fetch = LAZY)
    private CashMember holder;

    public Wallet(CashMember holder) {
        super(holder.getId());
        this.holder = holder;
    }
}
