package selfEvalutation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieterst on 23/02/2017.
 */
public class CustomerRepository {


    private List<Customer> customerList= new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomerToList(Customer customer) {
        customerList.add(customer);

    }

    public Customer findCustomerByBarcode(String barcode) {
        Customer customerToReturn = null;

        for (Customer cus: customerList) {
            String customerBarcode = cus.getLoyaltyCard().getBarCode();
            if (customerBarcode.equals(barcode)) {
                customerToReturn = cus;
            }
        }
        return customerToReturn;
    }
}
