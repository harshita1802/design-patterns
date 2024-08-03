package DesignPatterns.StructuralDesignPatterns.Facade.HelperClasses;

import DesignPatterns.StructuralDesignPatterns.Facade.Exceptions.PaymentFailedException;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.PaymentManagement;

public class PaymentManagementHelper {

    private PaymentManagement paymentManagement;

    public PaymentManagementHelper(PaymentManagement paymentManagement) {
        this.paymentManagement = paymentManagement;
    }

    public void initializePayment() {
        paymentManagement.initializePayment();

        if(!paymentManagement.verifyPayment()){
            throw new PaymentFailedException();
        }
    }
}
