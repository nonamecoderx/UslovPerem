public class Main {
    public static void main(String[] args) {
        //задание 6
        int all = 102;
        int sit = 60;
        int mesto = 33; //текущее место
        if (mesto <= sit) {
            System.out.println("Ваше место сидячее");
        } else if (mesto <= all) {
            System.out.println("Ваше место стоячее");
        } else if (mesto > all) {
            System.out.println("Мест нет, вагон полный");
        }
    }
}