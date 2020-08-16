package com.company;

import java.util.ArrayList;

public class Contacts {

    private String name;
    private ArrayList<Class1> v_a_contacts ;

    public Contacts(String name) {
        this.name = name;
        this.v_a_contacts = new ArrayList<Class1>();;
    }

    public  void listcontacts(){
        for (int i = 0; i < this.v_a_contacts.size(); i++) {
            System.out.println( "Name : "+ this.v_a_contacts.get(i).getName()
            +"   Contact : "+ this.v_a_contacts.get(i).getNumber());
        }
        //System.out.println("");
    }


    public void addcontacts(Class1 obj1){
        v_a_contacts.add(obj1);
    }

    public int findcontact(String oldname) {
        for (int i = 0; i < v_a_contacts.size(); i++) {
            if (v_a_contacts.get(i).getName().equals(oldname)) {
                return i;
            }

        }

        return -1;
    }

    public Class1 searchcontacts(String oldname){
            int posoldname = findcontact(oldname);
            if(posoldname >= 0) {
                return this.v_a_contacts.get(posoldname);
            }
        return null;
    }

    public boolean updatecontacts(Class1 oldcontact,Class1 newcontact){
        int posoldcontact = v_a_contacts.indexOf(oldcontact);

        if (posoldcontact < 0) {
            return false;
        }

        if ( findcontact(newcontact.getName()) != -1) {
            System.out.println("Contacts already Exist");
            return false;
        }

        v_a_contacts.set(posoldcontact, newcontact);
        return true;
    }

    public void removecontacts(Class1 obj1){
        this.v_a_contacts.remove(obj1);
    }

}
