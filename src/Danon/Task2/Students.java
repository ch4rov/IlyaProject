package Danon.Task2;

import java.util.ArrayList;

public class Students {
    private String firstName;
    private String secondName;
    private long UUID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getUUID() {
        return UUID;
    }

    public void setUUID(long UUID) {
        this.UUID = UUID;
    }

    ArrayList<String> list = new ArrayList<>() {};
}