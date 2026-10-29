package TugasPBO;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        int pilih;
        Scanner input=new Scanner(System.in);
        do{
        System.out.println("Bergerak maju(1)");
        System.out.println("Bergerak mundur(2)");
        System.out.println("Berhenti(3)");
        System.out.println("Exit(0)");
        System.out.print("Menu:");
        pilih=input.nextInt();
       
         if(pilih==1){
             s.m=10;
            System.out.println("bergerak maju "+s.m+"KM");
             System.out.println("Objek sepeda polygon, jarak tempuh "+s.hitung()+"KM");
            } else if(pilih==2){
                s.m=5;
            System.out.println("bergerak mundur "+s.m+"KM");
             System.out.println("Objek sepeda polygon, jarak tempuh "+s.hitung()+"KM");
            } else if(pilih==3){
            System.out.println("Sepeda berhenti");
             System.out.println("Objek sepeda polygon, jarak tempuh "+s.hitung()+"KM");
            }else  if(pilih==0){
            System.out.println("keluar program...");
             System.out.println("Terimakasih sudah menggunakan program ini");
            }else{
                System.out.println("tidak ada");
            }
        }while(pilih!=0);        
    }
}
class Sepeda{
    int m,tot=0;
    int hitung(){
        tot+=m;
        return tot;
    }
}
