package com.iesebre.dam2.alexbonavila.strippapp.interfaces;


public interface PaymentForm {
    public String getCardNumber();
    public String getCvc();
    public Integer getExpMonth();
    public Integer getExpYear();
    public String getCurrency();
}
