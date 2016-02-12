package no.fasmer.validation;

import java.util.regex.Pattern;
import no.fasmer.business.BusinessInput;

/**
 *
 * @author erlend321
 */
public class EmailRule implements Rule {

    @Override
    public void validate(Input input) {
        if (input instanceof BusinessInput) {
            BusinessInput businessInput = (BusinessInput) input;

            String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);

            if (!pattern.matcher(businessInput.getEmail()).matches()) {
                throw new IllegalArgumentException("Email is not a valid email!");
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

}
