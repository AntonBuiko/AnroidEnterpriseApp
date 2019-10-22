package com.example.proga2_laba.Service.staff;

import com.example.proga2_laba.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private ArrayList<Person> studList = new ArrayList<>();

    public Staff(){ studList = new ArrayList<Person>(); }
    public Staff(ArrayList<Person> persons){
        studList = persons;
    }

    public List<Person> getStudList(){ return studList;}

    public void setStudList(ArrayList<Person> studList){
        this.studList = studList;
    }

    public boolean add (Person item){
        return studList.add(item);
    }
    public boolean remove(Person item){
        return studList.remove(item);
    }

    public int compareByName(Person p1, Person p2){
        return p1.getName().compareTo(p2.getName());
    }

    public int compareByAge(Person p1, Person p2){
        return p1.getAge() > p2.getAge() ? p1.getAge() : p2.getAge();
    }
}
