package lesson11;

public class Student {
    private String name;
    private int course;
    private String maleOrFemale;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getMaleOrFemale() {
        return maleOrFemale;
    }

    public Student(String name, int course, String maleOrFemale){
        this.name = name;
        this.course = course;
        this.maleOrFemale = maleOrFemale;
    }
}
