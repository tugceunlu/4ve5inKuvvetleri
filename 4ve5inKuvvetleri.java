import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısı giriniz: ");
        n = input.nextInt();
        System.out.print("4'ün katları: ");

        for (int i =1; i <= n; i*= 4) {
            System.out.print(i + ", ");
        }

        System.out.print("\n5'ün katları: ");

        for (int x = 1; x <= n; x *= 5){
            System.out.print(x + ", ");
        }



    }
}
