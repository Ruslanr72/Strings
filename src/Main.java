public class Main {
    public static void main(String[] args) {
        //Задача 1
        String firstName  = ("Ivanov");
        String middleName = ("Semyon");
        String lastName = ("Semyonovich");
        String fullName = (firstName + " " + middleName + " " + lastName);
        System.out.println("Full name of the employee: " + fullName);
        //Задача 2

        String capitalLetters = fullName.toUpperCase();
        System.out.println("Full name of the employee to fill out the report: " + capitalLetters);

        //задача 3
String notMistakeYo = fullName.replace("yo", "e");
        System.out.println(notMistakeYo);

    }
}