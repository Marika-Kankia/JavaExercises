package JavaAbstractClasses;

abstract class Bird {
    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird{
    @Override
    public void fly()
    {
        System.out.println("fly");
    }
    @Override
    public void makeSound()
    {
        System.out.println("fly");
    }
}
class Hawk extends Bird{
    @Override
    public void fly()
    {
        System.out.println("fly");
    }
    @Override
    public void makeSound()
    {
        System.out.println("fly");
    }
}
 class Main8 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        eagle.fly();
        eagle.makeSound();

        hawk.fly();
        hawk.makeSound();
    }
}
