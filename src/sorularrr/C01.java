package sorularrr;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    // kullanicidan alan
    // ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki
    // farki gosteren
    // java programi yazin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kac elemanli bir array olusturmak istiyorsunuz? ");
        int size = scan.nextInt();
        int arr[]= new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Dizinin "+i+ ". indexinin degerini giriniz : ");
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Dizinin en buyuk ve en kucuk eleman arasindaki fark : "+ (arr[arr.length-1]-arr[0]));

    }
}










