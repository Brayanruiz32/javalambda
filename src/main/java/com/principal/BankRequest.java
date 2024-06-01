package com.principal;

import java.math.BigDecimal;

public class BankRequest {

    private BigDecimal amount; //monto en bigdecimal por la alta precision

    private Integer term;//plazo

    private BigDecimal rate;//tasa

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    

}
