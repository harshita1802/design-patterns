package DesignPatterns.StructuralDesignPatterns.Facade.HelperClasses;

import DesignPatterns.StructuralDesignPatterns.Facade.Entity.Customer;
import DesignPatterns.StructuralDesignPatterns.Facade.Exceptions.InvalidAddressException;
import DesignPatterns.StructuralDesignPatterns.Facade.Exceptions.InvalidPhoneException;
import DesignPatterns.StructuralDesignPatterns.Facade.ServiceLayer.AddressManagement;

public class AddressManagementHelper {
    private AddressManagement addressManagement;

    public AddressManagementHelper(AddressManagement addressManagement) {
        this.addressManagement = addressManagement;
    }

    public void verifyAddress(Customer cus) {
        if(!addressManagement.verifyAddress(cus)){
            throw new InvalidAddressException();
        }
        if(!addressManagement.verifyPhone(cus)){
            throw new InvalidPhoneException();
        }
    }
}
