package Day1;

// Encapsulation
abstract class Animal{
    abstract void setColor(String color);
}

//Abstraction
class Dog extends Animal{
    String color;

    public void setColor(String color){
        this.color = color;
    }
}

//Inheritance
class GermanShepherd extends Dog{

    //Polymorphism - Method Overriding
    public void setColor(String color){
        this.color = color;
    }
}
class Oops{
public static void main(String[] args) {

    Dog dog = new Dog();
    dog.setColor("black");

    GermanShepherd g = new GermanShepherd();
    g.setColor("brown");

    System.out.println("parent " + dog.color);
    System.out.println("child " + g.color);  
}
}