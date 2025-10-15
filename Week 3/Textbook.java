//Name: Garrett Radtke
//Date: 10/7/25

public class Textbook extends Book {
    private int gradeLevel;

    public Textbook(int pages, String title, int gradeLevel) {
        super(pages, title);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
