package StudentInfoSystem;



class Course {
    String name;
    String code;
    String prefix; //branchle aynı olmalı
    int note;
    Teacher teacher; //bir sınıfın niteliğini diğerine atayabiliriz.

    Course (String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void printTeacherInfo() {
        this.teacher.print();
    }

    void addTeacher(Teacher teacher) {
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("öğretmenin bölümü ile ders uyuşmuyor.");
        }
    }
}
