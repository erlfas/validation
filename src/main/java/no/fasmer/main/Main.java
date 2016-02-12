package no.fasmer.main;

import no.fasmer.business.BigBusinessClass;
import no.fasmer.business.BusinessInput;

/**
 *
 * @author erlend321
 */
public class Main {
    
    public static void main(String[] args) {
        BigBusinessClass bbc = new BigBusinessClass();
        BusinessInput input = new BusinessInput("Gateveien 123", "ola@nordmann.no");
        bbc.hugeBusinessMethod(input);
    }
    
}
