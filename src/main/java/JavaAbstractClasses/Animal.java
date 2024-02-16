package JavaAbstractClasses;


// Write a Java program to create an abstract class Animal with an abstract method called sound().
// Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
// Create subclasses Lion that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

abstract class Animal {
      public abstract void sound();
      public abstract void eat();
      public  abstract void sleep();

    }

      class Lion extends Animal {
          @Override
          public void sound() {
              System.out.println("Lion roars!");
          }

          @Override
          public void eat() {
              System.out.println("Lion eats meat.");
          }

          @Override
          public void sleep() {
              System.out.println("Lion sleeps on grassland.");
          }
      }

        class Tiger extends Animal {
            @Override
            public void sound() {
                System.out.println("Tiger growls!");
            }
            @Override
            public void eat() {
                System.out.println("Tiger eats meat and occasionally hunts in water.");
            }

            @Override
            public void sleep() {
                System.out.println("Tiger sleeps in a hidden spot.");
            }
        }


            class Main {
                public static void main(String[] args) {
                    Animal lion = new Lion();
                    lion.sound(); // Output: Lion roars!
                    Animal tiger = new Tiger();
                    tiger.sound(); // Output: Tiger growls!
                    lion.eat();
                    lion.sleep();
                    System.out.println();
                    tiger.eat();
                    tiger.sleep();

                    System.out.println();
                }
            }





