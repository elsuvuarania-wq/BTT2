import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> Create_al(int n, Scanner sc) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri:  ");
            int x = sc.nextInt();
            a.add(x);
        }
        return a;
    }

    static void in(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a = Create_al(n, sc);
        sc.close();
        in(a);
    }

}