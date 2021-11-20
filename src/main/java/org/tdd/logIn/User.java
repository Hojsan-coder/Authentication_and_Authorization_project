package org.tdd.logIn;

public class User {


    String userName;
    String passWord;


    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}
