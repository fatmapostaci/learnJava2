package dersler.gun31.Task03;

public class Runner {
     /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */


    public static void main(String[] args) {

        Lesson calculus = new Lesson("Calculus", 6);
        Lesson physics = new Lesson("Physics", 4);
        Lesson biology = new Lesson("Biology", 3);

        Student student1 = new Student("Fatma", 10);

        if (student1.sumOfCredits() > 0)
            student1.listOfLesson.add(calculus);
        System.out.println(student1);

        if (student1.sumOfCredits() > 0)
            student1.listOfLesson.add(physics);

        System.out.println(student1);

        if (student1.sumOfCredits() > 0)
            student1.listOfLesson.add(biology);

        System.out.println(student1);


    }
}
