package OOPS;

import Branching.SwitchStatement;

public class User {
    //String first_name,last_name; //before encapsulation
    private String first_name;

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException{
        if(age<0){
            /*System.out.println("Error: age cannot be negative");
            return;*/
            throw new RuntimeException("Age cannot be negative");
        }
        this.age = age;
    }

    /*public char getGender() {
        return gender;
    }*/
    public String getGender() {
        switch (this.gender){
            case 'M':
                return "Male";
                //break;
            case 'F':
                return "Female";
                //break;
            case 'O':
                return "Others";
                //break;
            default:
                return "Invalid gender";
        }
    }

    public void setGender(char gender) {
        if( gender != 'M' && gender != 'F' && gender != 'O'){
            System.out.println("Error: Invalid gender.");
            return;
        }
        this.gender = gender;
    }

    private String last_name; //after encapsulation
    private int age;
    private char gender;

    //non-parameterised constructor
    /*public User(){
        first_name="abcd";
        last_name="efgh";
        age=0;
        gender='M';
    }

    //parameterized constructor
    public User(String first_name,String last_name,int age,char gender){
        //this is a keyword which references to the current object
        this.first_name=first_name;
        this.last_name=last_name;
        this.age=age;
        this.gender=gender;
    }*/

    public String getFirst_name(){
        return first_name;
    }

    public void setFirst_name(String newName){
        first_name = newName;
    }

    public String getAgeGroup(){
        String ageGroup;
        if(age<12){
            ageGroup="child";
        } else if (age>=12 && age<20) {
            ageGroup="teenager";
        }
        else {
            ageGroup="adult";
        }
        return ageGroup;
    }

    public void display(){
        System.out.printf("my name is %s %s. I am a %c of age %d \n", first_name,last_name,gender,age);
    }
}
