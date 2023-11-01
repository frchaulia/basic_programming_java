public class Jobsheet3 {
    public static void main (String args[]) { 
        String oneOfMyHobbiesIs = "Cooking"; 
        boolean isSmart = true;
        char gender = 'F';
        byte _age = 18;
        double gpa = 3.65, height = 1.62;
        System.out.println("I am Faricha Aulia");
        System.out.println("One of My Hobbies is " +oneOfMyHobbiesIs);
        System.out.println("Are you smart? " +isSmart);
        System.out.println("What is your gender? " +gender);
        System.out.println("How old are you? " +_age);
        System.out.println(String.format("I have GPA %s" + " and height %s", gpa, height));

        System.out.println("================================");
        int x1 = 10;
        int y1 = 12;
        int z1 = x1^y1;
        System.out.println("The result of x1 ^ y1 is " + z1);
        int x2 = 11;
        int y2 = 12;
        int z2 = x2^y2;
        System.out.println("The result of x1 ^ y1 is " + z2);

        System.out.println("================================");
        int grade = 1;
        int integer = 10;
        double fractionNumber = 3.33333;
        char Character = 'C';
        char clas = 'I';
        String campus = "Polinema";
        System.out.println(String.format("I am a %s, with class %s%s", campus, grade, clas)); 
        System.out.println("I am learning to display values: ");
        System.out.println("Integer" + integer);
        System.out.println(String.format("Fraction %.2f", fractionNumber));
        System.out.println("Character " + Character);
    }
}