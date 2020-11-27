package com.example.todo.beans;


import com.example.todo.model.Prio;
import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
@SessionScoped
public class TodoBean implements Serializable {

    static Logger log = LogManager.getLogger() ;

    private DataTable table;


    @Autowired
    private TodoService service;

    private Todo tmpTodo = new Todo();
    private List<Todo> todolist = new ArrayList<>();


    @PostConstruct
    public void init() {
        setTodolist(service.list());

    }

    public Prio[] getPrios() {
        return Prio.values();
    }

    public Todo getTmpTodo() {
        return tmpTodo;
    }

    public void setTmpTodo(Todo tmpTodo) {
        this.tmpTodo = tmpTodo;
    }

    public List<Todo> getTodolist() {
        return todolist;
    }

    public void setTodolist(List<Todo> todolist) {
        this.todolist = todolist;
    }


    public void save() {// ActionListener
        System.out.println("TodoBean.save...");

        // um nicht nur Referenzen zu speichern, neue Objete erzeugen
        Todo t = new Todo(tmpTodo.getEntry(), tmpTodo.isDone(), tmpTodo.getDeadline(), tmpTodo.getPriority());
        if (service.save(t) != null) {
            System.out.println(t);
            todolist.add(t);

            //PrimeFaces.current().ajax().update("foo:bar");


        }

    }

    private void message(String msg){

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
    }

    public void onSelect(AjaxBehaviorEvent event) {
        Todo t = (Todo) event.getComponent().getAttributes().get("t");

        Todo updatedTodo =service.updateDone(t.getId());
        System.out.println(updatedTodo);
        message("Update done: "+t.isDone());

    }



    public void setTable(DataTable table) {
        this.table = table;
    }

    public DataTable getTable() {
        return table;
    }


}
