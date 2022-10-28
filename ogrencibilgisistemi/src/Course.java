public class Course {
    //İlk önce Course sınıfında yer alan nitelikleri tanımladık.
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examnote;
    int note;

    //Daha sonrasında Course Constructor sınıfını tanımladık.
    //Böylece ders tanımlarken daha az kod kullanmış olacağız.
    //Alacağımız değerin değişkeniyle sınıftaki değişken karışmasın diye kod bloğunda this kullandık.
    public Course (String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examnote = 0;
        this.note = 0;
    }

    //Öğretmen eklemek için addTeacher() methodunu oluşturacağız.
    public void addTeacher(Teacher t) {
        if(this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı!");
        } else {
            System.out.print(t.name + "akademisyeni bu dersi veremez!");
        }
    }

    //Akademisyen bilgisini bastırmak için printTeacher() metodunu oluşturacağız.
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
