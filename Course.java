package StudentGrandingSystes;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note = 0 ;
    int verbalNote = 0;


    public Course(String name, String code, String prefix) {
        this.name =name;
        this.code = code;
        this.prefix = prefix;

    }



    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
