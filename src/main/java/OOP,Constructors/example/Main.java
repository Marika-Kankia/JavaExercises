package org.example;
//Classes and objects

//1 Create a class called Employee that includes three pieces of information as instance variables—a first name (type String), a last name (type String) and a monthly salary (double). Your
//class should have a constructor that initializes the three instance variables. Provide a set and a get
//method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test
//application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again
public class Main {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // constructor to initialize first name, last name and monthly salary
    public Main(String first, String last, double salary) {
        firstName = first;
        lastName = last;

        if (salary >= 0.0) // determine whether salary is positive
            monthlySalary = salary;
    } // end three-argument Employee constructor
    // set Employee's first name
    public void setFirstName( String first )
    {
        firstName = first;
    } // end method setFirstName
    // get Employee's first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName
    // set Employee's last name
    public void setLastName( String last )
    {
        lastName = last;
    } // end method setLastName
    // get Employee's last name
    public String getLastName()
    {
        return lastName;

    } // end method getLastName44 // set Employee's monthly salary
    public void setMonthlySalary( double salary )
    {
        if ( salary >= 0.0 ) // determine whether salary is positive
            monthlySalary = salary;
    } // end method setMonthlySalary
    // get Employee's monthly salary
    public double getMonthlySalary()
    {
        return monthlySalary;
    } // end method getMonthlySalary

//    public static void main(String[] args) {
//        JavaObjects person1 = new JavaObjects("Ean Craig", 11);
//        JavaObjects person2 = new JavaObjects("Evan Ross", 12);
//        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
//        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
//
//   }

    public static void main(String[] args) {
//        JavaObjects dog1 = new JavaObjects("Buddy", "Golden Retriever");
//        JavaObjects dog2 = new JavaObjects("Charlie", "Bulldog");
//
//        System.out.println(dog1.getName2() + " is a " + dog1.getBreed() + ".");
//        System.out.println(dog2.getName2() + " is a " + dog2.getBreed() + ".");
//
//        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
//        dog1.setBreed("Labrador Retriever");
//        dog2.setName("Daisy");
//
//        System.out.println(dog1.getName2() + " is now a " + dog1.getBreed() + ".");
//        System.out.println(dog2.getName2() + " is now a " + dog2.getBreed() + ".");
//    }
    }
}






