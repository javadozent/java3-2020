package com.example.todo.beans;


import com.example.todo.model.Prio;
import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
@ViewScoped
public class TodoBean {

    static Logger log = LogManager.getLogger() ;

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

    public void onSelect(Todo t) {
        if(t == null){
            log.error("onSelect Todo null ");
        }
        Todo updatedTodo =service.updateDone(t.getId());
        System.out.println(updatedTodo);
        message("Update done: "+t.isDone());

    }
}
