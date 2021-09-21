import java.util.Scanner;

public class ucakbileti{
    public static void main(String[] args) {
        
        // değişkenleri tanımlayalım
        double mesafe,yas,ucret;
        int yolculuktipi;

        //import sınıfını tanımlayalım
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan input alalım
        System.out.println("Mesafeyi km cinsinden giriniz");
        mesafe = inp.nextDouble();
        System.out.println("Yasinizi giriniz");
        yas = inp.nextDouble();
        System.out.println("Yolculuk tipini giriniz (gidiş ise 1,gidiş dönüş ise 2)");
        yolculuktipi = inp.nextInt();

        // islemleri yapalım
        
        if(mesafe<0){
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            ucret = mesafe*0.10;
        if(yas<=12){
            ucret = ucret/2;
        }else if(yas>12 && yas <= 24){
            ucret = ucret - (ucret/10);
        }else if(yas>=65){
            ucret = ucret - (ucret*0.30);
        }

        if(yolculuktipi==2){
            ucret = (ucret - (ucret*0.20))*2;
            
        }
        System.out.println("ucretiniz " + ucret);
        }
        
        
        
    }
}