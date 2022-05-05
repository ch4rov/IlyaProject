package Main;
import Interfaces.Info;

import java.lang.*;

public class Kyc8cQqm {
    public static void main(String [] args) {
        int count = 0;
        HumanTest h1 = new HumanTest("Dad", "Dad", 20, ++count);
        h1.showInfoHuman();
        HumanTest h2 = new HumanTest("Bob", "Bob", 30, ++count);
        h2.showInfoHuman();
        HumanTest h3 = new HumanTest("Con", "Con", 40, ++count);
        h3.showInfoHuman();
        // change last name everyone, age 1,3
        h1.setLastName("DadL");
        h2.setLastName("BobL");
        h3.setLastName("ConL");
        h1.setAge(25);
        h3.setAge(47);
        System.out.println();
        h1.showNewInfoHuman();
        h2.showNewInfoHuman();
        h3.showNewInfoHuman();
        System.out.println();
        h1.editAge(2);
        h1.showNewInfoHuman();
        // edit age from metods;
    }
}

class HumanTest {
    private String name;
    private int age;
    private String lastName;
    private int numberOfHuman;

    final String City = "London";

    public HumanTest (String name, String lastName, int age, int countOfPeople) {
        this.name = name;
        this.age = age;
        this.numberOfHuman = countOfPeople;
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public void showInfoHuman(){
        System.out.println("First name is "+name+", Last name is: "+lastName+", age "+age+". Total people: "+numberOfHuman);
    }

    public void showNewInfoHuman(){
        System.out.println("First name is "+name+", Last name is: "+lastName+", age "+age+". Years do pensii "+calculateYearsDoPensii()+". From " + City);
    }

    public void editAge(int plusAge){
        age = age + plusAge;
    }

    int calculateYearsDoPensii(){
        int years = 65-age;
        return years;
    }
}

