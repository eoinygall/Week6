package ie.atu.week6;

public class Passenger {

    private String userTitle;
    private String userName;
    private String userID;
    private String Phone;
    private int Age;

    /*public Passenger(String title, String name, String id, String phone, int age) {
        userTitle = title;
        userName = name;
        userID = id;
        Phone = phone;
        Age = age;
    }*/

    public Passenger() {
    }

    public String GetTitle(String title) {
        if(title.equals("Mr")||title.equals("Mrs")||title.equals("Ms"))
        {
            userTitle = title;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid Title");
        }
        return userTitle;
    }

    public String GetName(String name) {
        if (name.length() > 3) {
            userName = name;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid Name");
        }
        return userName;
    }
}
