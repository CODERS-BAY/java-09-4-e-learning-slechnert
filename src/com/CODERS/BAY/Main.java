package com.CODERS.BAY;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //God, do I look forward to hashmaps


//Creating students, lectures and assignments
        Student s1 = new Student("Rex Racoon", 1);
        Student s2 = new Student("Lulu Lama", 2);
        Student s3 = new Student("Foxxy Fox", 3);
        Student s4 = new Student("Ursulua Unicornia", 4);

        Lecture l1s1 = new Lecture("Sleepology");
        Lecture l1s4 = new Lecture("Sleepology");

        Lecture l2s1 = new Lecture("Workology");
        Lecture l2s2 = new Lecture("Workology");

        Lecture l3s2 = new Lecture("Feastology");
        Lecture l3s3 = new Lecture("Feastology");

        Lecture l4s3 = new Lecture("Fuckology");
        Lecture l4s4 = new Lecture("Fuckology");


        Assignment a1l11 = new Assignment("How to sleep properly", 100d);
        Assignment a1l12 = new Assignment("How to sleep properly", 100d);

        Assignment a2l11 = new Assignment("When to sleep properly", 100d);
        Assignment a2l12 = new Assignment("When to sleep properly", 100d);

        Assignment a3l21 = new Assignment("How not to work properly", 99d);
        Assignment a3l22 = new Assignment("How not to work properly", 99d);

        Assignment a4l21 = new Assignment("What to do instead of working", 7d);
        Assignment a4l22 = new Assignment("What to do instead of working", 7d);

        Assignment a5l31 = new Assignment("How to cook balanced", 55d);
        Assignment a5l32 = new Assignment("How to cook balanced", 55d);

        Assignment a6l31 = new Assignment("How to hunt, Now and Then", 7000d);
        Assignment a6l32 = new Assignment("How to hunt, Now and Then", 7000d);

        Assignment a7l41 = new Assignment("Bäääh means Bäääh, fundamental social sexual constructs",44d);
        Assignment a7l42 = new Assignment("Bäääh means Bäääh, fundamental social sexual constructs",44d);

        Assignment a8l41 = new Assignment("Why you suck at sucking", 40d);
        Assignment a8l42 = new Assignment("Why you suck at sucking", 40d);


//        Adding assignments to lectures
        ArrayList<Assignment> lecture11 = new ArrayList<>();
        lecture11.add(a1l11);
        lecture11.add(a2l11);
        l1s1.setAssignedAssignments(lecture11);

        ArrayList<Assignment> lecture12 = new ArrayList<>();
        lecture12.add(a1l12);
        lecture12.add(a2l12);
        l1s4.setAssignedAssignments(lecture12);


        ArrayList<Assignment> lecture21 = new ArrayList<>();
        lecture21.add(a3l21);
        lecture21.add(a4l21);
        l2s1.setAssignedAssignments(lecture21);

        ArrayList<Assignment> lecture22 = new ArrayList<>();
        lecture22.add(a3l22);
        lecture22.add(a4l22);
        l2s2.setAssignedAssignments(lecture22);


        ArrayList<Assignment> lecture31 = new ArrayList<>();
        lecture31.add(a5l31);
        lecture31.add(a6l31);
        l3s2.setAssignedAssignments(lecture31);

        ArrayList<Assignment> lecture32 = new ArrayList<>();
        lecture32.add(a5l32);
        lecture32.add(a6l32);
        l3s3.setAssignedAssignments(lecture32);


        ArrayList<Assignment> lecture41 = new ArrayList<>();
        lecture41.add(a7l41);
        lecture41.add(a8l41);
        l4s3.setAssignedAssignments(lecture41);

        ArrayList<Assignment> lecture42 = new ArrayList<>();
        lecture42.add(a7l42);
        lecture42.add(a8l42);
        l4s4.setAssignedAssignments(lecture42);

//        Adding lectures to students
        s1.enroll(l1s1);
        s1.enroll(l2s1);

        s2.enroll(l2s2);
        s2.enroll(l3s2);

        s3.enroll(l3s3);
        s3.enroll(l4s3);

        s4.enroll(l1s4);
        s4.enroll(l4s4);

//        grading
        a1l11.grade(29d);
        a1l12.grade(99d);

        a2l11.grade(53d);
        a2l12.grade(75d);

        a3l21.grade(68d);
        a3l22.grade(51d);

        a4l21.grade(8d);
        a4l22.grade(9d);

        a5l31.grade(55d);
        a5l32.grade(35d);

        a6l31.grade(1d);
        a6l32.grade(6372d);

        a7l41.grade(22d);
        a7l42.grade(37d);

        a8l41.grade(38d);
        a8l42.grade(12d);

        System.out.println("Student 1 Report:");
        s1.getSchoolReport();

        System.out.println("Student 2 Report:");
        s2.getSchoolReport();

        System.out.println("Student 3 Report:");
        s3.getSchoolReport();

        System.out.println("Student 4 Report:");
        s4.getSchoolReport();
    }
}
