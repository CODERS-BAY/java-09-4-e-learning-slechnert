package codersbay.lechner;

import java.util.ArrayList;

public class Student {

    private String name;
    private Integer id;
    private ArrayList<Lecture> assignedLectures = new ArrayList<>();

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }



    public void enroll(Lecture lectureToAdd){
        assignedLectures.add(lectureToAdd);
    }

    public void getSchoolReport(){
        for(Lecture l : assignedLectures){
            if(l.getGrade() == 5){
                System.out.println(l.getName()+".....VERI GUD");
            } else if(l.getGrade() == 4){
                System.out.println(l.getName()+".....GUD");
            } else if(l.getGrade() == 3){
                System.out.println(l.getName()+".....OKAY");
            } else if(l.getGrade() == 2){
                System.out.println(l.getName()+"..... NOT OKAY");
            } else if(l.getGrade() == 1){
                System.out.println(l.getName()+".....DAFUQ ARE YOU DOING?! /%$&");
            } else {
                System.out.println("OOOPS, something went wrong");
            }
        }

        }


//Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Lecture> getAssignedLectures() {
        return assignedLectures;
    }

    public void setAssignedLectures(ArrayList<Lecture> assignedLectures) {
        this.assignedLectures = assignedLectures;
    }
}
