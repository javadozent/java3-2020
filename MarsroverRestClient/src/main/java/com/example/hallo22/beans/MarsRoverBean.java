package com.example.hallo22.beans;


import com.example.hallo22.client.RestClient;
import com.example.hallo22.model.Result;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.el.MethodExpression;
import javax.inject.Named;
import java.time.LocalDate;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
public class MarsRoverBean {


    private LocalDate minDate = LocalDate.of(2012,8,6);
    private LocalDate selectedDate;


    private final RestClient client = new RestClient();
    private Result result = new Result();

    @PostConstruct
    public void init(){
        result = client.createResult(minDate);
    }


    public Result getResult() {
        return result;
    }

    public void setSelectedDate(LocalDate selectedDate) {
        this.selectedDate = selectedDate;
    }

    public LocalDate getSelectedDate() {
        return selectedDate;
    }

    public void onSelect() {
        result = client.createResult(selectedDate);
    }

    public LocalDate getMinDate() {
        return minDate;
    }

    public void setMinDate(LocalDate minDate) {
        this.minDate = minDate;
    }
}
