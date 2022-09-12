public class Main {
    public static void main(String[] args) {
        //задание 8
        int age = 15;
        boolean no = age < 5;
        if (no) {
            System.out.println("Если ребенку " + age + " , то запрещено кататься на аттракционах.");
        }
        boolean yes = age >=5 && age < 14;
        if (yes) {
            System.out.println("Если ребенку " + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        boolean yesSolo = age >=14;
        if (yesSolo) {
            System.out.println("Если ребенку " + age + " , то он может кататься без сопровождения взрослого.");
        }

    }
}