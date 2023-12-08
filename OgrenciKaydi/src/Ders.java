import java.io.Serializable;

public class Ders implements Serializable {
    private String dersKodu;
    private String dersAd;
    private String dersDonem;

    // Getters and setters

    public Ders(String dersKodu, String dersAd, String dersDonem) {
        this.dersKodu = dersKodu;
        this.dersAd = dersAd;
        this.dersDonem = dersDonem;
    }

    // Dosyaya yazma metodunu ekle
    public void dosyayaYaz(String dosyaAdi) {
        // Burada ders nesnesini dosyaya yazma işlemleri gerçekleştirilebilir
        // Örnek olarak ObjectOutputStream kullanılabilir
    }

    public String getDersAd() {
        return null;
    }

    public String getDersKodu() {
        return null;
    }

    public String getDersDonem() {
        return null;
    }
}