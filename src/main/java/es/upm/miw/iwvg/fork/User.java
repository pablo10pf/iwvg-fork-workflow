package es.upm.miw.iwvg.fork;

public class User {
    private int code;
    private String name;
    private String fullname;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String deleteUser(){
        return "User deleted correctly";
    }
}
