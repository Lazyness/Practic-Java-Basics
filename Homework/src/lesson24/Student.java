package lesson24;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder copyName = new StringBuilder(name);
        return copyName;
    }

    public void setName(StringBuilder name) {
        if (name.length() < 3) {
            System.out.println("Name less 3");
        } else {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 10) {
            this.course = course;
        } else {
            System.out.println("Number course not in interval 1..10");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 4) {
            this.grade = grade;
        } else {
            System.out.println("Number grade not in interval 1..4");
        }
    }

    public void showInfo(){
        System.out.println("About student:\n"+
                "Name: "+getName()+"\nCourse: "+
                getCourse()+"\nGrade: "+
                getGrade());
    }

}
