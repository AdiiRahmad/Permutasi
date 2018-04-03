/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutasi.dan.kombinasi;

/**
 *
 * @author AdiRahmad
 */
public class Permutasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Permutasi mutasi = new Permutasi();
        System.out.println("Hasil Permutasi " + mutasi.Permutasi(7, 4));

    }

    public double Permutasi(double bilanganN, double bilanganR) {

        if (bilanganN < bilanganR) {
            System.err.println("Bilangan N tidak Boleh lebih kecil dari R");
        }
        double bilanganC = bilanganN - bilanganR;

        double hasilS1 = 1;
        double hasilS2 = 1;
        double hasilS3 = 1;

        for (int i = 1; i <= bilanganN; i++) {
            hasilS1 = hasilS1 * i;
        }

        for (int i = 1; i <= bilanganC; i++) {
            hasilS3 = hasilS3 * i;
        }
        double hasilpermutasi = hasilS1/hasilS3;

        return hasilpermutasi;

    }
}
