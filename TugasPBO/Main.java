package TugasPBO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih,m,tot=0;
        Scanner input=new Scanner(System.in);
        do{
        System.out.println("Bergerak maju(1)");
        System.out.println("Bergerak mundur(2)");
        System.out.println("Berhenti(3)");
        System.out.println("Exit(0)");
        System.out.print("Menu:");
        pilih=input.nextInt();
       
         if(pilih==1){
             m=10;
             tot+=m;
            System.out.println("bergerak maju "+m+"KM");
             System.out.println("Objek sepeda polygon, jarak tempuh "+tot+"KM");
            } else if(pilih==2){
             m=5;
             tot+=m;
            System.out.println("bergerak mundur "+m+"KM");
             System.out.println("Objek sepeda polygon, jarak tempuh "+tot+"KM");
            } else if(pilih==3){
            System.out.println("Sepeda berhenti");
             System.out.println("Objek sepeda polygon, jarak tempuh "+tot+"KM");
            }else  if(pilih==0){
            System.out.println("keluar program...");
             System.out.println("Terimakasih sudah menggunakan program ini");
            }else{
                System.out.println("tidak ada");
            }
        }while(pilih!=0);
    }   
}
