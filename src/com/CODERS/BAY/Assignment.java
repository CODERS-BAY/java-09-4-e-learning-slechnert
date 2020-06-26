package com.CODERS.BAY;

public class Assignment {

    private String name;
    private Double maxPoints;
    private Double scoredPoints;
    private Integer grade;


//Constructors


    public Assignment(String name, Double maxPoints) {
        this.name = name;
        this.maxPoints = maxPoints;
    }

    public Assignment(String name, Double maxPoints, Double scoredPoints) {
        this.name = name;
        this.maxPoints = maxPoints;
        this.scoredPoints = scoredPoints;
    }

    //Methods
    public boolean isGraded(){
        return (grade != null);
    }

    public Integer grade(double points){
        scoredPoints = points;
        double percentResult = scoredPoints/maxPoints;
        if(percentResult >= 0.0 && percentResult <=0.49){
            grade = 5;
            return grade;
        } else if(percentResult >= 0.5 && percentResult <= 0.65 ){
            grade = 4;
            return grade;
        } else if(percentResult > 0.65 && percentResult <= 0.8 ){
            grade = 3;
            return grade;
        } else if(percentResult > 0.8 && percentResult <= 0.9 ){
            grade = 2;
            return grade;
        } else if(percentResult > 0.9){
            grade = 1;
            return grade;
        } else {
            return null;
        }
    }

//Getter & Setter

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Double maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Double getScoredPoints() {
        return scoredPoints;
    }

    public void setScoredPoints(Double scoredPoints) {
        this.scoredPoints = scoredPoints;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "name='" + name + '\'' +
                ", maxPoints=" + maxPoints +
                ", scoredPoints=" + scoredPoints +
                ", grade=" + grade +
                '}';
    }
}
