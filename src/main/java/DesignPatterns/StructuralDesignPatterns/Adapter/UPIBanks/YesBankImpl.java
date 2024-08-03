package DesignPatterns.StructuralDesignPatterns.Adapter.UPIBanks;

import DesignPatterns.StructuralDesignPatterns.Adapter.Banks.StatusType;
import DesignPatterns.StructuralDesignPatterns.Adapter.Banks.YesBank;

public class YesBankImpl implements UPIBanks{
    private YesBank yesBank = new YesBank();

    @Override
    public String changePin(String upiId, int curPin, int newPin) {
        StatusType statusType = yesBank.changePin(generateToken(upiId,curPin),newPin);
        switch (statusType){
            case SUCCESS -> {
                return "Pin set successfully!";
            }
            case FAILURE -> {
                return "Could not set Pin.";
            }
            default -> {
                return "Please wait, Pin is being set!";
            }
        }
    }

    @Override
    public double checkBalance(String upiId, int pin) {
        return yesBank.checkBalance(generateToken(upiId,pin));
    }

    @Override
    public String transferMoney(String senderUpi, int pin, String recipientUpi, double amount) {
        StatusType statusType = yesBank.transferMoney(generateToken(senderUpi,pin),recipientUpi,amount);
        switch (statusType){
            case SUCCESS -> {
                return "Money transferred successfully!";
            }
            case FAILURE -> {
                return "Money transfer failed.";
            }
            default -> {
                return "Please wait, while we transfer money!";
            }
        }
    }

    private String generateToken(String upiId,int curPin){
        return upiId+curPin;
    }
}
