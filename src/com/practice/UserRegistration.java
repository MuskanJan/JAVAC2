package com.practice;

public class UserRegistration {
    public String firstName;
    public String lastName;
    public String userName;
    public String userPassword;
    public String userEmail;
    public String userAddress;
    public int usercellPhone;

    public UserRegistration(String firstName, String lastName, String userName, String userPassword, String userEmail, String userAddress, int usercellPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.usercellPhone = usercellPhone;
    }

    public String register() {
        return "Registration successful";
    }

    public static void main(String[] args) {
        UserRegistration nUser = new UserRegistration("Muskan", "Momini", "muskan201", "2052", "muskanmomini01@gmail.com", "B17", 3245);
        System.out.println(nUser.firstName);
        System.out.println(nUser.lastName);
        System.out.println(nUser.userName);
        System.out.println(nUser.userPassword);
        System.out.println(nUser.userEmail);
        System.out.println(nUser.userAddress);
        System.out.println(nUser.usercellPhone);

        System.out.println(nUser.register());
    }
}
