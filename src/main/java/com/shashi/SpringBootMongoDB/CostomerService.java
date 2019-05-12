package com.shashi.SpringBootMongoDB;

import java.util.List;

public interface CostomerService {

    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    public boolean saveNewCustomer(Customer customer);
	
}
