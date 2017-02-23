import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import selfEvalutation.Customer;
import selfEvalutation.CustomerRepository;
import selfEvalutation.LoyaltyCard;

/**
 * Created by pieterst on 23/02/2017.
 */
public class testCustomer {
    private Customer testCustomer;
    private CustomerRepository customercustomerRepository;
    private Customer testCustomer1;
    private Customer testCustomer2;
    private Customer testCustomer3;

    @Before
    public void setUp(){
        testCustomer= new Customer("Pieter", "Sterckx");

        customercustomerRepository = new CustomerRepository();

        testCustomer1 = new Customer("Elise", "Lodewyckx", new LoyaltyCard("123", 6) );
        testCustomer2 = new Customer("Stijn", "Liekens", new LoyaltyCard("456", 2));
        testCustomer3 = new Customer("Paulien", "Lemay", new LoyaltyCard("789", 3));
    }

    @Test
    public void CheckIfCustomerGetsAddedToList(){
        Integer inititalCount= customercustomerRepository.getCustomerList().size();
        customercustomerRepository.addCustomerToList(testCustomer);
        Assertions.assertThat(customercustomerRepository.getCustomerList().size()).isEqualTo(inititalCount+1);
    }

    @Test
    public void findCustomerByUsingTheBarCodeTest(){
        customercustomerRepository.addCustomerToList(testCustomer1);
        customercustomerRepository.addCustomerToList(testCustomer2);
        customercustomerRepository.addCustomerToList(testCustomer3);

        Assertions.assertThat(customercustomerRepository.findCustomerByBarcode("789")).isEqualTo(testCustomer3);
    }
}
