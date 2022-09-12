public class Main {
    public static void main(String[] args) {
        //задание 9
        int one = 5;
        int two = 7;
        int three = 3;
        boolean maxOne = one > two && one > three;
        boolean maxTwo = two > one && two > three;
        boolean maxThree = three > one && three > two;
        if (maxOne) {
            System.out.println(one);
        } else {
            if (maxTwo) {
                System.out.println(two);
            } else {
                if (maxThree) {
                    System.out.println(three);
                }
            }
        }
    }
}