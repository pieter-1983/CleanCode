import com.fasterxml.jackson.databind.util.ArrayBuilders;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import selfEvalutation.Customer;
import selfEvalutation.CustomerRepository;

import java.util.ArrayList;

/**
 * Created by pieterst on 23/02/2017.
 */
public class testCustomer {
    private Customer testCustomer;
    private CustomerRepository customerReposiory;

    @Before
    public void setUp(){
        testCustomer= new Customer("Pieter", "Sterckx");
        customerReposiory= new CustomerRepository();
    }

    @Test
    public void CheckIfCustomerGetsAddedToList(){
        Integer inititalCount= customerReposiory.getCustomerList().size();
        customerReposiory.addToList(testCustomer);
        Assertions.assertThat(customerReposiory.getCustomerList().size()).isEqualTo(inititalCount+1);

    }
    @Test
    public void TestIfCustomer
}
