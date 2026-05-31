package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double boy;
    boolean evliMi;
    int kilo;
    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName,String lastName,int age,double boy,boolean evliMi,int kilo){
        this(firstName,lastName,age);
        this.boy=boy;
        this.evliMi=evliMi;
        this.kilo=kilo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        if(age<19 && age>=13){
            return true;
        }else{
            return false;
        }
    }

}


