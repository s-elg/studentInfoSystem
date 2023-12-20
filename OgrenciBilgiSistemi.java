package StudentInfoSystem;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut hoca", "905555555555", "TRH");
        Teacher t2 = new Teacher("graham bell", "9055555555", "FZK") ;
        Teacher t3 = new Teacher("külyutmaz", "901593574141", "BIYO");

        Course tarih = new Course("tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("biyoloji", "103", "BIYO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("inek şaban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 87, 50);
        s1.isPass();

        Student s2 = new Student("güdük necmi", "456", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(14, 78, 36);
        s2.isPass();

        Student s3 = new Student("hayta ismail", "789", "4", tarih, fizik, biyoloji);
        s3.addBulkExamNote(65, 55, 95);
        s3.isPass();
    }
}
