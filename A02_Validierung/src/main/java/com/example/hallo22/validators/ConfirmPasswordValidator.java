package com.example.hallo22.validators;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
eigen Validatoren können z.B. für DB-Abfragen oder Webservice genutzt werden
 */
@FacesValidator("com.example.hello22.validators.ConfirmPasswordValidator")// Validator registrieren
public class ConfirmPasswordValidator implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

        //context.getViewRoot()

        HtmlInputText pwdIn = (HtmlInputText) component.getParent().findComponent("pwd");

        System.out.println(">>>>"+pwdIn.getValue());
        System.out.println(">>>>"+value);
        if(!pwdIn.getValue().equals(value.toString())){

            throw new ValidatorException(new FacesMessage("Passwörter stimmen nicht überein!"));

        }
    }
}
