package DesignPatterns.StructuralDesignPatterns.Adapter;

import DesignPatterns.StructuralDesignPatterns.Adapter.UPIBanks.UPIBanks;
import DesignPatterns.StructuralDesignPatterns.Adapter.UPIBanks.YesBankImpl;

public class PhonePe {

    private UPIBanks upiBanks;

    public PhonePe() {
        this.upiBanks = new YesBankImpl();
        //              or
        //this.upiBanks = new ICICIBankImpl();
    }

    public String changePin(String upiId,int curPin,int newPin){
        return upiBanks.changePin(upiId,curPin,newPin);
    }

    public double checkBalance(String upiId,int pin){
        return upiBanks.checkBalance(upiId,pin);
    }

    public String transferMoney(String senderUpi,int pin,String recipientUpi,double amount){
        return upiBanks.transferMoney(senderUpi,pin,recipientUpi,amount);
    }
}
