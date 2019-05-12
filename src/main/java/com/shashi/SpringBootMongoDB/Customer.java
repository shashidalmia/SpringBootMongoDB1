package com.shashi.SpringBootMongoDB;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Customer")
public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public Date dataOfBorth;

	public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public Date getDataOfBorth() {
		return dataOfBorth;
	}

	public void setDataOfBorth(Date dataOfBorth) {
		this.dataOfBorth = dataOfBorth;
	}

   
    
    
}