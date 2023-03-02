package br.ada.americadas.struts.helloworldstruts.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDAO {

    private static final Map<Long, Customer> CUSTOMERS = new HashMap<>();

    public Customer save(Customer customer) {
        if (customer.getIdentifier() == null || customer.getIdentifier() == 0) {
            customer.setIdentifier(System.currentTimeMillis());
        }
        CUSTOMERS.put(customer.getIdentifier(), customer);
        return customer;
    }

    public List<Customer> findAll() {
        return new ArrayList<>(CUSTOMERS.values());
    }

}
