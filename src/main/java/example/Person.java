package example;

abstract class Person {
    public abstract void eat();

    public abstract void exercise();
}

class Athlete extends Person{
    @Override
    public void exercise(){
        System.out.println("athlete person is+");
    }
    @Override
    public void eat(){
        System.out.println("athlete is person is+");
    }
}
class LazyPerson extends Person{
    @Override
    public void eat(){
        System.out.println("lazy person is+");
    }
    @Override
    public void exercise(){
        System.out.println("athlete person is+");
    }
}

 class Main7 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();
        athlete.eat();
        athlete.exercise();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
