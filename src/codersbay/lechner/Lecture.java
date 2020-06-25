package codersbay.lechner;

import java.util.ArrayList;

public class Lecture {
    private String name;
    private ArrayList<Assignment> assignedAssignments = new ArrayList<>();

    //Contructors
    public Lecture(String name) {
        this.name = name;
    }

    public Lecture(String name, ArrayList<Assignment> assignedAssignments) {
        this.name = name;
        this.assignedAssignments = assignedAssignments;
    }

    //Methods
    public Integer getGrade(){
        Double gradeTotal = 0.00;
        Double gradeCount = 0.00;
        for(Assignment a : assignedAssignments){
            if(a.isGraded()){
                gradeTotal += a.getGrade();
                gradeCount++;
            } else {
                System.out.println(a.getName()+"is yet to be graded!");
            }
        }
        return (Math.toIntExact(Math.round(gradeTotal / gradeCount)));
    }


    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Assignment> getAssignedAssignments() {
        return assignedAssignments;
    }

    public void setAssignedAssignments(ArrayList<Assignment> assignedAssignments) {
        this.assignedAssignments = assignedAssignments;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", assignedAssignments=" + assignedAssignments +
                '}';
    }
}
