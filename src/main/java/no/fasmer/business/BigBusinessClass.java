package no.fasmer.business;

import no.fasmer.validation.BigBusinessClassRules;

/**
 *
 * @author erlend321
 */
public class BigBusinessClass {

    public void hugeBusinessMethod(BusinessInput input) {
        BigBusinessClassRules.rules().stream().forEach(rule -> rule.validate(input));
        
        System.out.println("Doing all the work.");
    }
    
}
