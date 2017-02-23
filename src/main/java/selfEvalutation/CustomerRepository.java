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

    public void addToList(Customer customer) {
        customerList.add(customer);

    }
}
