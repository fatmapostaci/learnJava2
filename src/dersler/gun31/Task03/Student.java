package dersler.gun31.Task03;

import java.util.ArrayList;
import java.util.List;

public class Student {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
    private String name;
    private int maxCredit = 10;
    public List<Lesson> listOfLesson;

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
        this.listOfLesson =new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", maxCredit=" + maxCredit +
                ", listOfLesson=" + listOfLesson +
                '}';
    }

    public int sumOfCredits(){
        int sumOfCredits=0;
        for (Lesson l : listOfLesson)
            sumOfCredits+=l.getCredit();

        if( sumOfCredits < getMaxCredit() )
            return 1;
        else
            return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(int maxCredit) {
        this.maxCredit = maxCredit;
    }

}
