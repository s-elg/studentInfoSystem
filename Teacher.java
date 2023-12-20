package StudentInfoSystem;

class Teacher {
    //nitelikler
    String name;
    String mpno; //telefon numarası
    String branch; //bölümü
    Teacher (String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("adı: " + name + ", telefon numarası: " + mpno + ", bölümü: " + branch);
    }


}
