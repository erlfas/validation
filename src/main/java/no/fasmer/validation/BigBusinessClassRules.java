package no.fasmer.validation;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class BigBusinessClassRules {

    public static List<Rule> rules() {
        return Arrays.asList(new EmailRule(), new AddressRule());
    }
    
}
