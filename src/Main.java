import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        String sayi= scanner.next();
        int basamak = sayi.length()-1;
        int deger=Integer.parseInt(sayi);
        int toplam=0,kalan=0;
        for(int i =0;i<=basamak;i++){
            kalan= (int) (deger/Math.pow(10,basamak-i));
            toplam+=kalan;
            deger-=kalan*Math.pow(10,basamak-i);
        }
        System.out.println("Girilen sayı : "+sayi+" rakamların toplamı :"+toplam);
    }
}
