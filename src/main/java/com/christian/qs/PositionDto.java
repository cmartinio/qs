package com.christian.qs;

import java.util.Objects;

class PositionDto {
    private final String underlyingSymbol;
    private final String optionType;
    private final String quantity;
    private final String expiration;
    private final String StrikePrice;
    private final String UnitCost; // TODO better term for this
    private final String totalCost;
    private final String CurrentOptionPrice;
    private final String CurrentTotalValue;
    private final String valueGain;

    public PositionDto(String underlyingSymbol, String optionType, String quantity, String expiration, String strikePrice, String unitCost, String totalCost, String currentOptionPrice, String currentTotalValue, String valueGain, String valuePercentage) {
        this.underlyingSymbol = underlyingSymbol;
        this.optionType = optionType;
        this.quantity = quantity;
        this.expiration = expiration;
        StrikePrice = strikePrice;
        UnitCost = unitCost;
        this.totalCost = totalCost;
        CurrentOptionPrice = currentOptionPrice;
        CurrentTotalValue = currentTotalValue;
        this.valueGain = valueGain;
        this.valuePercentage = valuePercentage;
    }

    String valuePercentage;


    public String getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    public String getOptionType() {
        return optionType;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getStrikePrice() {
        return StrikePrice;
    }

    public String getUnitCost() {
        return UnitCost;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public String getCurrentOptionPrice() {
        return CurrentOptionPrice;
    }

    public String getCurrentTotalValue() {
        return CurrentTotalValue;
    }

    public String getValueGain() {
        return valueGain;
    }

    public String getValuePercentage() {
        return valuePercentage;
    }

    @Override
    public String toString() {
        return "PositionDto{" +
                "underlyingSymbol='" + underlyingSymbol + '\'' +
                ", optionType='" + optionType + '\'' +
                ", quantity='" + quantity + '\'' +
                ", expiration='" + expiration + '\'' +
                ", StrikePrice='" + StrikePrice + '\'' +
                ", UnitCost='" + UnitCost + '\'' +
                ", totalCost='" + totalCost + '\'' +
                ", CurrentOptionPrice='" + CurrentOptionPrice + '\'' +
                ", CurrentTotalValue='" + CurrentTotalValue + '\'' +
                ", valueGain='" + valueGain + '\'' +
                ", valuePercentage='" + valuePercentage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionDto that = (PositionDto) o;
        return underlyingSymbol.equals(that.underlyingSymbol) &&
                optionType.equals(that.optionType) &&
                quantity.equals(that.quantity) &&
                expiration.equals(that.expiration) &&
                StrikePrice.equals(that.StrikePrice) &&
                UnitCost.equals(that.UnitCost) &&
                totalCost.equals(that.totalCost) &&
                CurrentOptionPrice.equals(that.CurrentOptionPrice) &&
                CurrentTotalValue.equals(that.CurrentTotalValue) &&
                valueGain.equals(that.valueGain) &&
                valuePercentage.equals(that.valuePercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(underlyingSymbol, optionType, quantity, expiration, StrikePrice, UnitCost, totalCost, CurrentOptionPrice, CurrentTotalValue, valueGain, valuePercentage);
    }
}
