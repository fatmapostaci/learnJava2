package gun37.animals;

public class Cat extends Animal {

    void meow(){
        System.out.println("cat meows");

    }
    @Override
    int  eat(){
        System.out.println("cat eats salmon");
return  1;
    }


}
