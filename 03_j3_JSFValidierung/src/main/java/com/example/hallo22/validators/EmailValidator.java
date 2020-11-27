package com.example.hallo22.validators;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
eigen Validatoren können z.B. für DB-Abfragen oder Webservice genutzt werden
 */
@FacesValidator("com.example.hallo22.validators.EmailValidator")// Validator registrieren
public class EmailValidator  implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Pattern p = Pattern.compile(".+@.+\\..+");
        Matcher m = p.matcher(String.valueOf(value));
        if(!m.matches()){

            FacesMessage msg = new FacesMessage("E-Mail nicht korrekt!");
            throw new ValidatorException(msg);
        }
    }
}
