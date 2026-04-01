package Pertemuan7;

import java.util.Random;

public class ProgramUji{
    public static void main(String[] args){
        final int SIZE=100000;// menentukan jumlah data =100.000, final menandakan tidak dapat diubah

        int[] data=new int[SIZE];// membuat array untuk menyimpan 100.000 angka
        Random rand=new Random();// membuat objek random untuk menghasilkan angka acak

        for(int i=0;i<SIZE;i++){
            data[i]=rand.nextInt(100000);
        }// mengisi arrauy dengan angka acak dan men loop 0 sampai 99.999

        Stopwatch myObj=new Stopwatch();// membuat objek daari class Stopwatch

        myObj.start();// memulai pengukuran waktu

        selectionSort(data);// memanggil method sorting 

        myObj.stop();// menghentikan stopwatch

        System.out.println("Waktu eksekusi selection sort: "+myObj.getElapsedTime()+" ms");// menampilkan hasil waktu
    }

    public static void selectionSort(int[] arr){// method ini berfungsi untuk mengurutkan arryay
        int n=arr.length;//menyimpan panjang array

        for(int i=0;i<n-1;i++){// sebagai looping menentukan posisi elemen yang akan diisi dari indeks 0 sampai n-2
            int minIndex=i;//variabel sebagai anggapan bahwa elemen saat ini adalah yang terkecil

            for(int j=i+1;j<n;j++){// loop untuk mencari nilai terkecil di sisa array
                if(arr[j]<arr[minIndex]){// kondisi jika ditemukan nilai yang lebih kecil dan mengupdate posisi mindex
                    minIndex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;// menukar nilai, nilai terkecil dipindahkan ke depan
        }
    }
}