package testgroup.model;

public class User {

    public Integer id;
    public String name;
    public String surname;
    public String login;
    public String password;

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getLogin() {
        return this.login;
    }
    public String getPassword() {
        return this.password;
    }

}
