package com.example.proga2_laba.Service.educationmanager;

import com.example.proga2_laba.Service.staff.Staff;
import com.example.proga2_laba.model.Person;

import java.util.Comparator;

public class Manager implements IAction{
    @Override
    public Staff createGroup(Staff someCourse, int maxStudent, int maxListener, String filePath) {
        return null;
    }

    @Override
    public int sumRanges(Staff anyCourse) {
        int sum = 0;
        for (Person person:
             anyCourse.getStudList()) {
             sum += person.getMark();
        }
        return sum;
    }

    @Override
    public void sortByYear(Staff anyCourse) {
        Comparator<Person> comparatorByYear = new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.compare(person.getAge(), t1.getAge());
            }
        };
        anyCourse.getStudList().sort(comparatorByYear);
    }

    @Override
    public void sortByRating(Staff anyCourse) {
        Comparator<Person> comparatorByYear = new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.compare(person.getAge(), t1.getAge());
            }
        };
        anyCourse.getStudList().sort(comparatorByYear);
    }

    @Override
    public void sortByLastName(Staff anyCourse) {
        Comparator<Person> comparatorByYear = new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.compare(person.getAge(), t1.getAge());
            }
        };
        anyCourse.getStudList().sort(comparatorByYear);
    }
}
