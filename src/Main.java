public class Main {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if(i % j != 0) {
                    break;
                }
                if(j == 20 && i % 20 == 0) {
                    result = i;
                }
            }
            if(result > 0) {
                break;
            }
        }

        System.out.println(result);
    }
}