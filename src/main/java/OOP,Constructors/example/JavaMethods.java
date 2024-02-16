package org.example;

public class JavaMethods {

    //Exercise1 Write a Java method to find the smallest number among three numbers.
        //first version
// static void smallestnumber(){
//
//        System.out.println("Smallest number is"+min(12,13,14));
//    }
//
//
//    public static void main(String[] args) {
//        smallestnumber();
//
//    }


    //second version
//    static int smallestnumber(int smallestnumber1,int smallestnumber2){
//
//        return min(smallestnumber1,smallestnumber2);
//    }


//    public static void main(String[] args) {
//        System.out.println("smallest number is"+smallestnumber(12,14));
//
//    }


    //Exercise2   Write a Java method to compute the average of three numbers.

    //first version

//     static int average(int a,int b) {
//         return ((a + b) / 2);
//     }
//
//
//    public static void main(String[] args) {
//        System.out.println(average(12,22));
//
//    }
        //second version
//static int average(int a,int b){
//    return average(a,b);
//}
//
//
//    public static void main(String[] args) {
//        int value=(12+22)/2;
//        System.out.println(value);
//
//    }

    //third version

//    static void average(){
//        System.out.println((13+13)/2);
//    }
//
//
//    public static void main(String[] args) {
//        average();
//    }


    //Exercise3

   // Write a Java method to display the middle character of a string.

//    static String middle(String str){
//       int position;
//       int length;
//        if (str.length() % 2 == 0)  //a) If the length of the string is odd there will be two middle characters.
//        {
//            position = str.length() / 2 - 1;  //b) If the length of the string is even there will be one middle character.
//            length = 2;
//        }
//        else
//        {
//            position = str.length() / 2;
//            length = 1;
//        }
//
//        return str.substring(position,position+length);
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(middle("names"));
//    }

//Exercise 4
    //Write a Java method to count all vowels in a string.

//    static int count_vowels(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
//                count++;
//            }
//        }
//        return count;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(count_vowels("looser"));
//    }

    //Exercise 5
    //Write a Java method to count all the words in a string.

//    static int countwords(String str){
//        int count=0;
//        for (int i=0;i<str.length();i++){
//            count++;
//        }
//        return count;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(countwords("marika"));
//
//    }

        //Exercise 6
//Write a Java method to compute the sum of digits in an integer.

//    static int sumofdigits(long n){
//        int result=0;
//        while(n > 0) {
//            result += n % 10;
//            n /= 10;
//        }
//
//        return result;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(sumofdigits(12345));
//
//    }

//Exercise 10 Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

//    public static boolean is_LeapYear(int y)
//    {
//        boolean a = (y % 4) == 0;
//        boolean b = (y % 100) != 0;
//        boolean c = ((y % 100 == 0) && (y % 400 == 0));
//
//        return a && (b || c);
//    }
//    public static void main(String[] args) {
//       System.out.println(is_LeapYear(2021));
//
//   }


    //Exercise 11   Write a Java method to check whether a string is a valid password.
//    public static final int PASSWORD_LENGTH = 8;
//
//    public static boolean is_Valid_Password(String password) {
//
//        if (password.length() < PASSWORD_LENGTH) return false;
//
//        int charCount = 0;
//        int numCount = 0;
//        for (int i = 0; i < password.length(); i++) {
//
//            char ch = password.charAt(i);
//
//            if (is_Numeric(ch)) numCount++;
//            else if (is_Letter(ch)) charCount++;
//            else return false;
//        }
//        return (charCount >= 2 && numCount >= 2);
//    }
//
//    public static boolean is_Letter(char ch) {
//        ch = Character.toUpperCase(ch);
//        return (ch >= 'A' && ch <= 'Z');
//    }
//
//
//    public static boolean is_Numeric(char ch) {
//
//        return (ch >= '0' && ch <= '9');
//    }
//
//    public static void main(String[] args) {
//        String str="abcd1234";
//        if (is_Valid_Password(str)) {
//            System.out.println("Password is valid: " + str);
//        } else {
//            System.out.println("Not a valid password: " + str);
//        }
//
//    }

    //Exercise 12  matrix

//    public static void printMatrix(int n) {
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                System.out.print((int)(Math.random() * 2) + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        printMatrix(10);
//    }

//Exercise 13  Write Java methods to calculate triangle area.
//
//    public static boolean is_Valid(double side1, double side2, double side3) {
//        if( side1 + side2 > side3 &&
//                side2 + side3 > side1 &&
//                side1 + side3 > side2) return true;
//        else return false;
//    }
//    public static double area_triangle(double side1, double side2, double side3) {
//        double area = 0;
//        double s = (side1 + side2 + side3)/2;
//        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
//        return area;
//    }
//
//    public static void main(String[] args) {
//        double side1 = 12;
//        double side2=13;
//        double side3=2;
//        System.out.println( is_Valid(side1, side2,side3) ?
//                "The area of the triangle is " + area_triangle(side1, side2, side3) : "Invalid triangle" );
//    }

    //Exercise 15 Write a Java method to display the current date and time.

//    public static void main(String[] args) {
//
//        // Obtain the total milliseconds since midnight, Jan 1, 1970
//        long totalMilliseconds = System.currentTimeMillis();
//
//        // Obtain the total seconds since midnight, Jan 1, 1970
//        long totalSeconds = totalMilliseconds / 1000;
//
//        // Compute the current second in the minute in the hour
//        long currentSecond = (int)(totalSeconds % 60);
//
//        // Obtain the total minutes
//        long totalMinutes = totalSeconds / 60;
//
//        // Compute the current minute in the hour
//        long currentMinute = (int)(totalMinutes % 60);
//
//        // Obtain the total hours
//        long totalHours = totalMinutes / 60;
//
//        // Compute the current hour
//        long currentHour = (int)(totalHours % 24);
//
//        long totalDays = totalHours / 24;
//
//        // current year
//        int currentYear = (int)(totalDays / 365) + 1970;
//
//
//        long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;
//        if (currentHour > 0) daysInCurrentYear++; // add today
//
//        // get current month number
//        int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);
//
//        // getting current month name
//        String month = getMonthName(currentMonthNum);
//
//        // getting day of current month
//        int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);
//
//        int startDay = getStartDay(currentYear, currentMonthNum);
//        int today = (int) daysInCurrentYear - daysTillCurrentMonth;
//        String dayOfWeek = dayNameOfWeek( ((startDay + today) % 7));
//
//        // Display results
//        System.out.println("Current date and time: " + dayOfWeek + " " + month + " " + today +", " + currentYear
//                +" " + currentHour + ":"
//                + currentMinute + ":" + currentSecond );
//
//    }
//
//    public static String dayNameOfWeek(int dayOfWeek) {
//
//        switch (dayOfWeek) {
//            case 2: return "Monday";
//            case 3: return "Tuesday";
//            case 4: return "Wednesday";
//            case 5: return "Thursday";
//            case 6: return "Friday";
//            case 7: return "Saturday";
//            case 1: return "Sunday";
//            default: return null;
//        }
//    }
//
//    public static int numberOfLeapYearsSince1970(long year) {
//
//        int count = 0;
//        for (int i = 1970; i <= year; i++) {
//            if (isLeapYear(i))count++;
//        }
//        return count;
//    }
//
//
//    public static int getMonthFromDays(int year, int days) {
//        int dayTracker = 0;
//        for (int i = 1; i <= 12; i++) {
//
//            dayTracker += getNumberOfDaysInMonth(year, i);
//
//            if (dayTracker > days) return i;
//        }
//        return 12;
//    }
//
//    public static int getNumOfDaysToReachThatMonth(int year, int month) {
//        int dayTracker = 0;
//        for (int i = 1; i < month; i++) {
//
//            dayTracker += getNumberOfDaysInMonth(year, i);
//
//
//        }
//        return dayTracker;
//    }
//
//    /** Get the start day of month/1/year */
//    public static int getStartDay(int year, int month) {
//        final int START_DAY_FOR_JAN_1_1800 = 3;
//        // Get total number of days from 1/1/1800 to month/1/year
//        int totalNumberOfDays = getTotalNumberOfDays(year, month);
//
//        // Return the start day for month/1/year
//        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
//    }
//
//    /** Get the total number of days since January 1, 1800 */
//    public static int getTotalNumberOfDays(int year, int month) {
//        int total = 0;
//
//        // Get the total days from 1800 to 1/1/year
//        for (int i = 1800; i < year; i++)
//            if (isLeapYear(i))
//                total = total + 366;
//            else
//                total = total + 365;
//
//        // Add days from Jan to the month prior to the calendar month
//        for (int i = 1; i < month; i++)
//            total = total + getNumberOfDaysInMonth(year, i);
//
//        return total;
//    }
//
//    /** Get the number of days in a month */
//    public static int getNumberOfDaysInMonth(int year, int month) {
//
//        if (month == 1 || month == 3 || month == 5 || month == 7 ||
//                month == 8 || month == 10 || month == 12)
//            return 31;
//
//        if (month == 4 || month == 6 || month == 9 || month == 11)
//            return 30;
//
//        if (month == 2) return isLeapYear(year) ? 29 : 28;
//
//        return 0; // If month is incorrect
//    }
//
//    /** Determine if it is a leap year */
//    public static boolean isLeapYear(int year) {
//        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
//    }
//
//
//    /** Get the English name for the month 1-12 */
//    public static String getMonthName(int month) {
//        String monthName = "";
//        switch (month) {
//            case 1: monthName = "January"; break;
//            case 2: monthName = "February"; break;
//            case 3: monthName = "March"; break;
//            case 4: monthName = "April"; break;
//            case 5: monthName = "May"; break;
//            case 6: monthName = "June"; break;
//            case 7: monthName = "July"; break;
//            case 8: monthName = "August"; break;
//            case 9: monthName = "September"; break;
//            case 10: monthName = "October"; break;
//            case 11: monthName = "November"; break;
//            case 12: monthName = "December";
//        }
//
//        return monthName;
//    }


    //Exercise 16  Write a Java method to find all twin prime numbers less than 100.

//    public static boolean is_Prime(long n) {
//
//        if (n < 2) return false;
//
//        for (int i = 2; i <= n / 2; i++) {
//
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        for (int i = 2; i < 100; i++) {
//
//            if (is_Prime(i) && is_Prime(i + 2)) {
//                System.out.printf("(%d, %d)\n", i, i + 2);
//            }
//        }
//    }

    //Exercise 18   Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.

    public static boolean test(int x, int y, int z){
        int max_num = Math.max(x, Math.max(y, z));
        int min_num = Math.min(x, Math.min(y, z));
        int middle_num = x+y+z - max_num - min_num;
        return (max_num - middle_num) == 1 && (middle_num - min_num == 1);
    }

        public static  int getTotal(int a, int b){
            return a+b;
        }
        public static  boolean isEven(int a) {
            if (a % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

    public static void main(String[] args)
    {
//        System.out.println(getTotal(12,14));
//        if (isEven(13)){
//            System.out.println("number is even");
//        }
//        else {
//            System.out.println("number is not even");
//        }
        int x=10;
        int y=13;
        int z=18;
        System.out.println(test(x,y,z));
    }

    //Exercise 19



}

