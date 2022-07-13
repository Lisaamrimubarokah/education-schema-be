package com.company;

//Nama          : Lisa Amri Mubarokah
//Alamat Email  : lisaamrimubarokah22@gmail.com
//Waktu Mulai   : Selasa, 12 Juli 2022 pukul 10:00 WIB
//Waktu Selesai : Selasa, 12 Juli 2022 pukul 10:30 WIB

public class test_soal1 {

    public static void main(String[] args) {
	    int[] data = {1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
	    int i;

	    for (i=0; i<data.length; i++){
	        if (data[i] == 5) {
                System.out.println("Fizz");
            } else if (data[i] == 11) {
                System.out.println("Buzz");
            } else if (data[i] == 5 && data[i] == 11){
                System.out.println("FizzBuzz");
            }
        }




    }
}
