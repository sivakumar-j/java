package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){

        this.firstName = firstName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public void setAge (int age){
        if(age<0 || age >100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getFirstName(){
        return this.firstName;
               // return firstName.isEmpty()?"":firstName;
    }
    public String getLastName(){
        return this.lastName;
        //return lastName.isEmpty()?"":lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getFullName(){
        if(getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        }else if(getFirstName().isEmpty() && !getLastName().isEmpty()){
            return getLastName();
        }else if(getLastName().isEmpty() && !getFirstName().isEmpty()){
            return getFirstName();
        }
        return getFirstName()+" "+getLastName();
        /*return getFirstName().isEmpty() ?
                getLastName()
                : getFirstName()
                .concat(getLastName().isEmpty() ? "" : " " + getLastName());*/

    }
    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }
        return false;
    }

}
