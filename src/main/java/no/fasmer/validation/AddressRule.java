package no.fasmer.validation;

import no.fasmer.business.BusinessInput;

/**
 *
 */
public class AddressRule implements Rule {

    @Override
    public void validate(Input input) {
        if (input instanceof BusinessInput) {
            BusinessInput businessInput = (BusinessInput) input;
            if (businessInput.getAddress() == null || businessInput.getAddress().isEmpty()) {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
    
}
