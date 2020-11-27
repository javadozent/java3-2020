package com.example.hallo22.beans;


import org.primefaces.event.SelectEvent;

import javax.annotation.PostConstruct;
import javax.el.MethodExpression;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class AutocompleteBean {
    private List<String> namen = new ArrayList<>();// Datenquelle
    private String selected;

    @PostConstruct
    public void init(){
        namen.add("Max");
        namen.add("Marta");
        namen.add("Anton");
        namen.add("Anna");
        namen.add("Otto");
        namen.add("Oleg");
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public List<String> resultList(String query){
        System.out.println(query);
        List<String> resultlist = new ArrayList<>();
        for (String name: namen) {
            if(name.toLowerCase().startsWith(query.toLowerCase())){
                resultlist.add(name);
            }
        }


        return resultlist;
    }

    public void onSelect(SelectEvent e) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(selected));
    }
}
