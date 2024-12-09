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
    private int maxCredit;
    private List<Lesson> listOfLesson;

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
        this.listOfLesson =new ArrayList<>();
    }

    public int sumOfCredits(){
        for (Lesson l : listOfLesson)
            this.maxCredit+= l.getCredit();
        return maxCredit;
    }
    public  boolean addLesson(Lesson lesson){
        boolean accepted = false;
        int credit = lesson.getCredit();
        if ( (credit+maxCredit)<=10  ){
            maxCredit+=credit;
            accepted=true;
        }
        return accepted;
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

    public List<Lesson> getLesson() {
        return lesson;
    }

    public void setLesson(List<Lesson> lesson) {
        this.lesson = lesson;
    }
}
