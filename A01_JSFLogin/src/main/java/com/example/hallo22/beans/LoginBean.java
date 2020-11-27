package com.example.hallo22.beans;


import com.example.hallo22.model.User;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
public class LoginBean {

    private List<User> userlist = new ArrayList<>();
    private User currentUser = new User();
    private String tmpUsr;
    private String tmpPwd;
    public LoginBean(){

    }

    @PostConstruct // nach Constructor ausgeführt
    public void init(){
        // 3 User zu Liste hinzufügen
        userlist.add(new User("max","123","meier@web.de" ));
        userlist.add(new User("ina","111","ina@web.de" ));
        userlist.add(new User("otto","111","otto@web.de" ));
    }

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public String login(){
        currentUser = findUser(tmpUsr,tmpPwd);
        if(currentUser!=null){
            return "VALID_USER";
        }
        return "NOT_VALID_USER";
    }

    private User findUser(String username, String password) {

        Optional<User> user  = userlist.stream().filter(u-> u.getUsername().equals(username)&& u.getPassword().equals(password)  ).findAny();

        if (user.isEmpty()) { //user.isPresent()
            return null;
        }
        return user.get();
    }

    public String getTmpUsr() {
        return tmpUsr;
    }

    public void setTmpUsr(String tmpUsr) {
        this.tmpUsr = tmpUsr;
    }

    public String getTmpPwd() {
        return tmpPwd;
    }

    public void setTmpPwd(String tmpPwd) {
        this.tmpPwd = tmpPwd;
    }

    public static void main(String[] args) {
        LoginBean lb = new LoginBean();
        System.out.println(lb.findUser("max","123"));
    }

    public String logout() {
        setCurrentUser(new User());
        setTmpPwd("");
        setTmpUsr("");
        return "LOGOUT";
    }
}
