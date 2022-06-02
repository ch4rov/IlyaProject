package Danon.Task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Students {
    private String firstName;
    private String secondName;
    private int UUID;

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

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    HashMap<Integer, String> MapList = new HashMap<>();
}