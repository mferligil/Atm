import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int UserNumber, Password, right=3 , balance=1500 , price ;
        Scanner input = new Scanner(System.in);
        int select;
        while (right>0)
        {
            System.out.print(" Lütfen kullanıcı adınızı giriniz");
            UserNumber=input.nextInt();
            System.out.print("Lütfen şifrenizi giriniz");
            Password=input.nextInt();

            if( UserNumber== 12345 && Password==123456)
            {
                do {
                    System.out.print(" , Yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    select=input.nextInt();
                    switch (select)
                    {
                        case 1:
                            System.out.print(" Yatırmak istediğiniz miktar");
                            price=input.nextInt();
                            balance=balance+price;
                            System.out.print(" Yeni Bakiye : "+ balance);
                            break;
                        case 2:
                            System.out.print(" Çekmek istediğiniz miktarı giriniz");
                            price=input.nextInt();
                            if (balance>=price)
                            {
                                balance=balance-price;
                                System.out.print(" Yeni Bakiye : "+balance);
                            }
                            else
                                System.out.print(" Yetersiz Bakiye");
                            break;
                        case 3:
                            System.out.print(" Mevcut Bakiye: "+ balance);
                    }
                }while (select!=4);
                System.out.print(" İyi Günler Dileriz");



            }
            else {
                System.out.print(" Hatalı Şifre Tekrar Deneyiniz");
                right--;
                if (right==0)
                    System.out.print(" Kartınız Bloke olmuştur lütfen banka ile iletişime geçiniz");
                else
                    System.out.print(" Kalan hakkınız "+right);
            }
        }
    }
}