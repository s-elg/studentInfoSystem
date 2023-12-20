package StudentInfoSystem;

class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if(note1 <= 100 && note2 >= 0){
            this.c1.note = note1;
        }
        if(note2 <= 100 && note2 >= 0){
            this.c2.note = note2;
        }
        if(note3 <= 100 && note3 >= 0){
            this.c3.note = note3;
        }
    }

    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        printNote();
        System.out.println();
        if (this.avarage >= 55) {
            System.out.println("hababam sınıfı uyanıyor!!!! :)");
            this.isPass = true;
        } else {
            System.out.println("hababam sınıfı sınıfta kaldı :(");
            this.isPass = false;
        }
        System.out.println("#####################");
    }

    void printNote() {
        System.out.println(this.c1.name + " dersinin notu: " + this.c1.note);
        System.out.println(this.c2.name + " dersinin notu: " + this.c2.note);
        System.out.println(this.c3.name + " dersinin notu: " + this.c3.note);
        System.out.println("ortalamanız: " + this.avarage);
    }
}
