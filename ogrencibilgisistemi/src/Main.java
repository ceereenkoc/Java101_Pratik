public class Main {
    public static void main(String[] args) {


        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut A.", "123456789", "MAT");
        Teacher t2 = new Teacher("Ayşe B.", "456789123", "FZK");
        Teacher t3 = new Teacher("Hasan C.", "789123456", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ayça A.", 1, "123456789", mat, fizik, kimya);
        s1.addBulkExamNote(50, 70, 40, 40, 80, 20);
        s1.isPass();

        Student s2 = new Student("Buse B.", 2, "456789123", mat, fizik, kimya);
        s2.addBulkExamNote(80,100, 40, 60, 80, 80);
        s2.isPass();

        Student s3 = new Student("Ceren C.", 3, "789123456", mat, fizik, kimya);
        s3.addBulkExamNote(40,50,50,60,70,80);
        s3.isPass();
    }
}