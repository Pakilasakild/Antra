import java.util.Scanner;

public class Main {
    public static boolean isSmiling(boolean aSmile, boolean bSmile){
        if (aSmile == bSmile){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean aSmile, bSmile;
        Scanner sc = new Scanner(System.in);
        aSmile = sc.nextBoolean();
        bSmile = sc.nextBoolean();
        if (isSmiling(aSmile, bSmile)){
            System.out.println("We are in trouble");
        }
        else{
            System.out.println("We are not in trouble");
        }
    }
}