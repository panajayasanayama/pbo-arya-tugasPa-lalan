package pakages;

import java.util.Scanner;

public class kelas {

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("      SISTEM PENGOLAHAN NILAI MAHASISWA        ");
        System.out.println("================================================");

        Scanner input = new Scanner(System.in);
        int jum;
        System.out.print("Input jumlah mahasiswa: ");
        jum = Integer.parseInt(input.nextLine().trim());

        String[] nama  = new String[jum];
        String[] npm   = new String[jum];
        float[] nt     = new float[jum];
        float[] nut    = new float[jum];
        float[] nua    = new float[jum];
        float[] na     = new float[jum];
        char[]   huruf = new char[jum];
        String[] status = new String[jum];

        for (int i = 0; i < jum; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("NPM \t\t: ");
            npm[i] = input.nextLine();

            System.out.print("Nama \t\t: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai tugas \t: ");
            nt[i] = Float.parseFloat(input.nextLine().trim());

            System.out.print("Nilai uts \t: ");
            nut[i] = Float.parseFloat(input.nextLine().trim());

            System.out.print("Nilai uas \t: ");
            nua[i] = Float.parseFloat(input.nextLine().trim());

            System.out.println();
        }

        for (int i = 0; i < jum; i++) {
            na[i] = (0.30f * nt[i]) + (0.30f * nut[i]) + (0.40f * nua[i]);

            if (na[i] >= 85)      huruf[i] = 'A';
            else if (na[i] >= 75) huruf[i] = 'B';
            else if (na[i] >= 65) huruf[i] = 'C';
            else if (na[i] >= 50) huruf[i] = 'D';
            else                  huruf[i] = 'E';

            status[i] = (na[i] >= 65) ? "LULUS" : "TIDAK LULUS";
        }

        System.out.println("=================================================================================");
        System.out.println("                            DAFTAR NILAI MAHASISWA");
        System.out.println("=================================================================================");
        System.out.println("No  NPM          Nama            Tugas  UTS    UAS    Akhir  Huruf  Status");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < jum; i++) {
            System.out.println((i + 1) + "   " + npm[i] + "   " + nama[i] + "   " + nt[i] + "   " + nut[i] + "   " + nua[i] + "   " + na[i] + "   " + huruf[i] + "   " + status[i]);
        }
        System.out.println("=================================================================================");

        int lulus = 0, tidakLulus = 0;
        float tertinggi = na[0];
        float terendah  = na[0];
        float total     = 0;

        for (int i = 0; i < jum; i++) {
            if (na[i] >= 65) lulus++;
            else             tidakLulus++;

            if (na[i] > tertinggi) tertinggi = na[i];
            if (na[i] < terendah)  terendah  = na[i];

            total += na[i];
        }

        float rataRata = total / jum;

        System.out.println("==============================");
        System.out.println("       STATISTIK NILAI        ");
        System.out.println("==============================");
        System.out.println("Jumlah mahasiswa    : " + jum);
        System.out.println("Jumlah lulus        : " + lulus);
        System.out.println("Jumlah tidak lulus  : " + tidakLulus);
        System.out.println("Nilai tertinggi     : " + tertinggi);
        System.out.println("Nilai terendah      : " + terendah);
        System.out.println("Rata-rata kelas     : " + rataRata);
        System.out.println("==============================");

        input.close();
    }
}