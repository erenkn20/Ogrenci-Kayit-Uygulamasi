import java.io.Serializable;
import java.util.List;

public class Ogrenci implements Serializable {
    private int ogrenciNo;
    private String ogrenciAd;
    private String ogrenciSoyad;
    private String ogrenciBolum;
    private List<Ders> ogrenciDersler;

    // Getters and setters

    public Ogrenci(int ogrenciNo, String ogrenciAd, String ogrenciSoyad, String ogrenciBolum, List<Ders> ogrenciDersler) {
        this.ogrenciNo = ogrenciNo;
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciBolum = ogrenciBolum;
        this.ogrenciDersler = ogrenciDersler;
    }

    // Dosyaya yazma metodunu ekle
    public void dosyayaYaz(String dosyaAdi) {
        // Burada öğrenci nesnesini dosyaya yazma işlemleri gerçekleştirilebilir
        // Örnek olarak ObjectOutputStream kullanılabilir
    }
}
