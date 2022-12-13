import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListTask {
    public static void main(String[] args) {
        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */
        List<Integer> list = new ArrayList<>();
        calistir(list);
    }

    public static void calistir(List<Integer> list) {
        System.out.println("        Hoşgeldiniz" + "" +
                "\n Integer data girişi için 1 " +
                "\n Listeden eleman kaldırmak için 2 " +
                "\n Listedeki elemanı güncellemek için 3 " +
                "\n Çıkış için -1 girişi yapınız");
        Scanner scan = new Scanner(System.in);

        try {
            Integer secim = scan.nextInt();

            switch (secim) {

                case 1:
                    dataEkle(list);
                    break;
                case 2:
                    dataSil(list);
                    break;
                case 3:
                    dataGuncelle(list);
                    calistir(list);
                    break;
                case -1:
                    System.out.println("Programdan çıkılıyor");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız tekrar deneyiniz");
                    calistir(list);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Integer girişi yapınız!!");
            calistir(list);
        }
    }

    private static void dataEkle(List<Integer> l) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nListeye eklemek istediğiniz Integer değeri giriniz : ");
        Integer i = scan.nextInt();
        l.add(i);
        System.out.println(i + " değeri eklendi");
        System.out.println("\nListin yeni hali : ");
        l.stream().forEach(t -> System.out.print(t + " "));
        System.out.println();
        calistir(l);


    }

    private static void dataSil(List<Integer> l) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Silmek istediğiniz Integer değeri giriniz : ");
        Integer i = scan.nextInt();
        if (l.stream().anyMatch(t -> t == i)) {
            l.remove(l.indexOf(i));
            System.out.println(i + " Değeri silindi");
            System.out.println("\n  Listin yeni hali : ");
            l.stream().forEach(t -> System.out.print(t + " "));
            System.out.println();
            calistir(l);
        } else {
            System.out.println("\nGirdiğiniz değer Listte bulunamadı");
            calistir(l);
        }
    }

    private static void dataGuncelle(List<Integer> l) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Güncellemek istediğiniz Integer değeri giriniz : ");
        Integer i = scan.nextInt();
        System.out.println("Yeni değeri giriniz");
        Integer yenideger = scan.nextInt();
        if (l.stream().anyMatch(t -> t == i)) {
            l.stream().filter(t -> t == i).map(t -> yenideger);
            System.out.println("Güncelleme yapıldı");
            calistir(l);
        } else {
            System.out.println("değer bulunamadı");
            calistir(l);
        }
    }

}
