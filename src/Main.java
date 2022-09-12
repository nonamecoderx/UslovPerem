public class Main {
    public static void main(String[] args) {
        //задание 7
        int age = 99;
        boolean goToGarden = age >= 2 && age <=6;
        if (goToGarden) {
            System.out.println("Если возраст равен " + age + " , то нужно ходить в детский сад");
        }
        boolean goToSchool = age >=7 && age <= 18;
        if (goToSchool) {
            System.out.println("Если возраст равен " + age + " , то нужно ходить в школу");
        }
        boolean goToUniverse = age >18 && age < 24;
        if (goToUniverse) {
            System.out.println("Если возраст равен " + age + " , то нужно ходить в университет");
        }
        boolean goToWork = age >=24;
        if (goToWork) {
            System.out.println("Если возраст равен " + age + " , то нужно ходить на работу");
        }
    }
}