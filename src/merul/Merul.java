
package merul;
    import java.util.*;

public class Merul {
    public static void main(String[] args) {
        String Ulasan = null;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nama anda: ");
    String  nama=input.next();
    System.out.print("Taipkan warna kegemaran anda\n merah/biru/kuning/hijau/hitam/putih: ");
    String warna=input.next();
    switch(warna){
        case"merah" :{
            Ulasan=("membawa maksud kekuatan, kemarahan dan semangat");
            break;
        }case"biru" :{
            Ulasan=("membawa maksud ketenangan, keikhlasan dan harapan");
            break;
        }case"kuning" :{
            Ulasan=("melambangkan kegembiraan, penuh semangat dan riang");
            break;
        }case"hijau" :{
            Ulasan=("menggambarkan kehidupan, kestabialn dan ketulenan");
            break;
        }case"hitam" :{
            Ulasan=("dikaitkan dengan kejahatan dan kerahsiaan");
            break;
        }case"putih" :{
            Ulasan=("adalah keberanian tetapi tidak suka tunjukkan keberanian");
            break;
        }
    }
    System.out.println(Ulasan);
       
    }
    
}
