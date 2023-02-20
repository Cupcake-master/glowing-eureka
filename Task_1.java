public class Task_1 {
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        System.out.println(leapYearCount(arg1));
    }

    public static int leapYearCount(int year) {
        int result = 0;
        for (int i = 1; i <= year; i++ ){
            if (i % 400 == 0 ) {
                result++;
            } else if (i % 4 == 0 && i % 100 != 0 ) {
                result++;
            }
        }
        return result;
    }
}