package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    // Thuộc tính
    public String name;
    public String id;
    public String dob;
    public String province;
    public String group;

    // Constructor
    public Student(String name, String id, String dob, String province, String group) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.province = province;
        this.group = group;
    }

    // Phương thức
    public void getInfo() {
        System.out.println("Sinh viên: " + this.name + "-" + id + " - " + group);
    }

    public void getAge() {
        SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY", Locale.ENGLISH);
        try {
            Date date = formatter.parse(this.dob);
            date.getYear();
            int year = new Date().getYear();
            System.out.println(year - date.getYear());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
