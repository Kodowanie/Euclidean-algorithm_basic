public class Main {
    public static void main(String[] args) {

//  Solution 1:
        int a = 100;
        int b = 60;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Solution 1: NWD = " + a);

//  Solution 2:
        int c = 30;
        int d = 20;
        while (c % d != 0){
            if (c > d){
                c -= d ;
            }else{
                d -= c;
            }
        }
        System.out.println("Solution 2: NWD = " + c);
    }
}