package com.company;

//Nama          : Lisa Amri Mubarokah
//Alamat Email  : lisaamrimubarokah22@gmail.com
//Waktu Mulai   : Selasa, 12 Juli 2022 pukul 10:00 WIB
//Waktu Selesai : Rabu, 13 Juli 2022 pukul 09:16 WIB


public class test_soal2 {

    public static void main(String[] args) {

        final Object[] data = new Object[]{1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1};
        final Object[] angka = new Object[] {1, 67, 7, 98};
        final Object[] angka2 = new Object[] {-1};
        final Object[] huruf = new Object[] {"ka", "wah", "1772", "edukasi"};
        String tipdat = "";

        for (int i=0; i< data.length; i++) {
            for (int j=0; j< angka.length;j++){
                if (data[i] == angka[j]) {
                    tipdat = "integer";
                }
                for (int k=0; k< huruf.length; k++){
                    if (data[i] == huruf[k]) {
                        tipdat = "string";
                    }
                    for (int l=0; l< angka2.length; l++){
                        if (data[i] == angka2[l]) {
                            tipdat = "no tipe data";
                        }
                    }
                }
            }

            if (tipdat == "integer"){
                System.out.println("Index ke "+ i +" adalah " +tipdat + " dengan data " +data[i]);
            } else if (tipdat == "string"){
                System.out.println("Index ke "+ i +" adalah " +tipdat + " dengan data " +data[i]);
            } else {
                System.out.println("Index ke "+ i +" Tidak bisa di validasi sistem ");
            }
        }
    }
}
