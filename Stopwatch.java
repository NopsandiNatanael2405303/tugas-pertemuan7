package Pertemuan7;

public class Stopwatch{
    private long startTime;// variabel privat waktu mulai
    private long endTime; // variabel privat waktu selesai.
    //long digunakan karna nilai waktu besar(milidetik)
    public long getStartTime(){
        return startTime;
    }// method ini berfungsi untuk mengambil nilai starttime

    public long getEndTime(){
        return endTime;
    }// method ini berfungsi untuk mengambil nilai endtime

    public Stopwatch(){
        startTime=System.currentTimeMillis();
    }/* konstruktor yang dipanggi saat objek sibuat
        mengisi startime dengan waktu sekarang
        sistem currenttimemili() mengisi waktu dengan milidetik
     */

    public void start(){
        startTime=System.currentTimeMillis();
    }/* method untuk memulai/reset sropwatch
        mengganti waktu mulai dengan waktu sekarang
     */

    public void stop(){
        endTime=System.currentTimeMillis();
    }/* method untuk menghentikan stopwatch
        dan menyimpan waktu saat ini ke endtime
     */

    public long getElapsedTime(){
        return endTime-startTime;
    }/* method yang menghitung waktu yang berlaku
        dengan rumus waktu selesai-waktu mulai
     */ 
}