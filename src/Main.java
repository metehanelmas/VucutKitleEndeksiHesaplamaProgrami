import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/

        Scanner inp = new Scanner(System.in);
        double boy,kilo;;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        //25 ile 30 fazla kilolu , 30 ile 35 obez 1.sınıf , 35 ile 40 aşırı obez 2.sınıf,hsgm.saglik.gov.tr
        double indeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

        System.out.println(indeks < 18 ? "Zayıf ! Boyunuza göre uygun ağırlıkta olmadığınızı, " +
                "zayıf olduğunuzu gösterir. Zayıflık, bazı hastalıklar için risk oluşturan ve istenmeyen bir durumdur. Boyunuza " +
                "uygun ağırlığa erişmeniz için yeterli ve dengeli beslenmeli, beslenme alışkanlıklarınızı " +
                "geliştirmeye özen göstermelisiniz." : (indeks >= 25 && indeks <=30 ? "Normal ! : Boyunuza göre uygun ağırlıkta " +
                "olduğunuzu gösterir. Yeterli ve dengeli beslenerek ve düzenli fiziksel aktivite " +
                "yaparak bu ağırlığınızı korumaya özen gösteriniz. " : (indeks >= 30 && indeks < 35  ? "Fazla Kilolu !  :  Boyunuza göre vücut ağırlığınızın " +
                "fazla olduğunu gösterir. Fazla kilolu olma durumu gerekli önlemler alınmadığı takdirde pek " +
                "çok hastalık için risk faktörü olan obeziteye (şişmanlık) yol açar. " : (indeks < 35 && indeks < 40 ? "Obez 1.sınıf : ! Boyunuza göre" +
                " vücut ağırlığınızın fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir." +
                " Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. kronik hastalıklar için risk faktörüdür. " +
                "Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak normal ağırlığa inmeniz sağlığınız " +
                "açısından çok önemlidir." +
                " Lütfen, sağlık kuruluşuna başvurunuz. " : (indeks < 40 && indeks < 45 ? "Şişman (Obez) - II. Sınıf : Boyunuza göre vücut ağırlığınızın" +
                " fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir. Şişmanlık, kalp-damar hastalıkları, diyabet," +
                " hipertansiyon v.b. kronik hastalıklar için risk faktörüdür. Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde " +
                "zayıflayarak normal ağırlığa inmeniz sağlığınız açısından çok önemlidir. Lütfen, sağlık kuruluşuna başvurunuz.  "
                : (indeks > 45 ? "Aşırı Şişman (Aşırı Obez) - III. Sınıf : Boyunuza göre vücut ağırlığınızın fazla olduğunu bir " +
                "başka deyişle şişman olduğunuzun bir göstergesidir. Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. " +
                "kronik hastalıklar için risk faktörüdür. Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak" +
                " normal ağırlığa inmeniz sağlığınız açısından çok önemlidir. Lütfen, sağlık kuruluşuna başvurunuz.": 0 ))))));

    }
}
