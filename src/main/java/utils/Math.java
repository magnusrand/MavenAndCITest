package utils;

public class Math {

    public static int max(int a, int b){
        return a >= b ? a : b;
    }

    public static int min(int a, int b){
        return a <= b ? a : b;
    }

    public static int pow(int a, int b) {
        int result = 1;
        for(int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
