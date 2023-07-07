import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Ucak Bileti Hesaplama
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        //Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        int age, amount = 0, type;
        double discountY ,discountT, discountF, ticketF,endF;

        Scanner scanner= new Scanner(System.in);

        System.out.println("gidilen yerin uzakligi:km cinsinden : ");
        amount=scanner.nextInt();

        System.out.println("Lutfen yasinizi giriniz : ");
        age=scanner.nextInt();

        System.out.println("Lütfen Bilet Türünüzü Gidiş-Dönüş İse 1'e \n Biletiniz Sadece Gidiş İse 2'ye Basınız \n Lütfen Bilet Türünüzü Giriniz ");
        type=scanner.nextInt();

        if (age < 0 || amount < 0 ||type <=0 ||type > 3){
            System.out.println("Hatali veri girisi yaptiniz!!!");
        }
        if (age<12){
            if (type==1){
                ticketF =(amount * 0.10);
                discountT =(ticketF*0.20);
                discountF =(ticketF-discountT);
                discountY =(discountF*0.50);
                System.out.println("bilet fiyatiniz : "+discountY);
            }else {
                ticketF = (amount *0.10);
                discountT=(ticketF*0.50);
                discountF=(ticketF-discountT);
                System.out.println("BIlet fiyatiniz : "+discountF);
            }
        } else if (age>=12 && age < 24) {
            if(type == 1) {
                ticketF = (amount * 0.10);
                discountT = (ticketF * 0.20);
                discountF = (ticketF - discountT);
                discountY = (discountF * 0.10);
                endF = (discountF - discountY);
                System.out.println("Bilet Fiyatınız : " + endF);
            }else {
                ticketF = (amount * 0.10);
                discountY = (ticketF * 0.10);
                discountF =(ticketF - discountY);
                System.out.println("Bilet Fiyatınız : " + discountF);
            }
        }else if(age > 65){
            if(type == 1){
                ticketF = (amount * 0.10);
                discountT = (ticketF * 0.20);
                discountF = (ticketF - discountT);
                discountY = (discountF * 0.30);
                endF = (discountF - discountY);
                System.out.println("Bilet Fiyatınız : " + endF);
            }else {
                ticketF = (amount * 0.10);
                discountY = (ticketF * 0.30);
                discountF =(ticketF - discountY);
                System.out.println("Bilet Fiyatınız : " + discountF);
            }
        }else{
            System.out.println("Program Bitti.....");
        }

    }

}
