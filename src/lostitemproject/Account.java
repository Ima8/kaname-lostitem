package lostitemproject;

public class Account {

    private int accId;
    private String name;
    private String surname;
    private String username;
    private String phone;
    private String line;
    private String email;
    private String password;

    //login >>> boolean
    //
    //getAccId return 10
    public Account() {

    }

    public Account(int accId,String name, String surname, String username,String password, String phone, String line, String email) {
        this.accId = accId;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.phone = phone;
        this.line = line;
        this.email = email;
        this.password = password;
    }

    public int getAccId() {
        return accId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public boolean login(String username,String password) {
        boolean result=true;
        if(password.equals(password/*passwordของ account นี้ใน database*/)){
            result = true;
        }    
        return result;
    }

}
