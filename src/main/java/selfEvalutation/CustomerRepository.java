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

    public Customer findCustomerByBarcode(String barcode) throws Exception {

        for (Customer cus: customerList) {
            if (getBarCode(cus).equals(barcode)) {
                return cus;
            }
        }
        throw new Exception("No customer found with this barcode");
    }

    private String getBarCode(Customer cus) {
        return cus.getLoyaltyCard().getBarCode();
    }
}
