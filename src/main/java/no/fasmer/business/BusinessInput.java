package no.fasmer.business;

import no.fasmer.validation.Input;

/**
 *
 */
public class BusinessInput implements Input {
    
    private final String address;
    private final String email;
    
    public BusinessInput(String address, String email) {
        this.address = address;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
    
}
