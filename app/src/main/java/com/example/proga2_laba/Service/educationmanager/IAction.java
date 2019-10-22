package com.example.proga2_laba.Service.educationmanager;

import com.example.proga2_laba.Service.staff.Staff;

public interface IAction {

    Staff createGroup(Staff someCourse, int maxStudent, int maxListener, String filePath);
    int sumRanges(Staff anyCourse);
    void sortByYear(Staff anyCourse);
    void sortByRating(Staff anyCourse);
    void sortByLastName(Staff anyCourse);
}
