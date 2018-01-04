/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kel1.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author user
 */
public class CreditFormBean {
    @NotNull @Min(0)
    private Integer creditDuration;
    @NotNull @Min(0)
    private Double creditBasePrice;
    @NotNull @Min(0)
    private Double creditInterestRate;
    @NotNull @Min(0)
    private Double creditDownPayment;
    @NotNull @Min(0)
    private Double creditTotal;
    @NotNull @Min(0)
    private Double creditMonthlyInstallment; 

    /**
     * @return the creditDuration
     */
    public Integer getCreditDuration() {
        return creditDuration;
    }

    /**
     * @param creditDuration the creditDuration to set
     */
    public void setCreditDuration(Integer creditDuration) {
        this.creditDuration = creditDuration;
    }

    /**
     * @return the creditBasePrice
     */
    public Double getCreditBasePrice() {
        return creditBasePrice;
    }

    /**
     * @param creditBasePrice the creditBasePrice to set
     */
    public void setCreditBasePrice(Double creditBasePrice) {
        this.creditBasePrice = creditBasePrice;
    }

    /**
     * @return the creditInterestRate
     */
    public Double getCreditInterestRate() {
        return creditInterestRate;
    }

    /**
     * @param creditInterestRate the creditInterestRate to set
     */
    public void setCreditInterestRate(Double creditInterestRate) {
        this.creditInterestRate = creditInterestRate;
    }

    /**
     * @return the creditDownPayment
     */
    public Double getCreditDownPayment() {
        return creditDownPayment;
    }

    /**
     * @param creditDownPayment the creditDownPayment to set
     */
    public void setCreditDownPayment(Double creditDownPayment) {
        this.creditDownPayment = creditDownPayment;
    }

    /**
     * @return the creditTotal
     */
    public Double getCreditTotal() {
        return creditTotal;
    }

    /**
     * @param creditTotal the creditTotal to set
     */
    public void setCreditTotal(Double creditTotal) {
        this.creditTotal = creditTotal;
    }

    /**
     * @return the creditMonthlyInstallment
     */
    public Double getCreditMonthlyInstallment() {
        return creditMonthlyInstallment;
    }

    /**
     * @param creditMonthlyInstallment the creditMonthlyInstallment to set
     */
    public void setCreditMonthlyInstallment(Double creditMonthlyInstallment) {
        this.creditMonthlyInstallment = creditMonthlyInstallment;
    }
}
