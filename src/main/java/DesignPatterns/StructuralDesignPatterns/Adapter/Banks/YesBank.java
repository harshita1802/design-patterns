package DesignPatterns.StructuralDesignPatterns.Adapter.Banks;

public class YesBank {

    public StatusType changePin(String token,int newPin){
        return StatusType.SUCCESS;
    }

    public Float checkBalance(String token){
        return 10000f;
    }

    public StatusType transferMoney(String token,String recipientUpi,double amount){
        if(checkBalance(token) >= amount){
            return StatusType.SUCCESS;
        }
        else {
            return StatusType.FAILURE;
        }
    }
}
