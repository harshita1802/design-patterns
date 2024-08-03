package DesignPatterns.StructuralDesignPatterns.Adapter.UPIBanks;

public interface UPIBanks {

    String changePin(String upiId,int curPin,int newPin);

    double checkBalance(String upiId,int pin);

    String transferMoney(String senderUpi,int pin,String recipientUpi,double amount);

}
