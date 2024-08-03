package DesignPatterns.StructuralDesignPatterns.Adapter.UPIBanks;

public class ICICIBankImpl implements UPIBanks{
    @Override
    public String changePin(String upiId, int curPin, int newPin) {
        return null;
    }

    @Override
    public double checkBalance(String upiId, int pin) {
        return 0;
    }

    @Override
    public String transferMoney(String senderUpi, int pin, String recipientUpi, double amount) {
        return null;
    }
}
