package ie.atu.week6;

public class Passenger {

    private String userTitle;
    private String userName;
    private String userID;
    private String Phone;
    private int Age;

    public Passenger(String title, String name, String id, String phone, int age) {
        userTitle = title;
        userName = name;
        userID = id;
        Phone = phone;
        Age = age;
    }

    public Passenger() {
    }


    public String getTitle(String title) {
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
}
