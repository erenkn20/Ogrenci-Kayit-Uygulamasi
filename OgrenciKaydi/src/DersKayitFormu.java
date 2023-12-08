import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DersKayitFormu extends JFrame {
    private JTextField dersKoduField;
    private JTextField dersAdField;
    private JTextField dersDonemField;
    private JButton kaydetButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public DersKayitFormu() {
        setTitle("Ders Kayıt Formu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel dersKoduLabel = new JLabel("Ders Kodu:");
        JLabel dersAdLabel = new JLabel("Ders Adı:");
        JLabel dersDonemLabel = new JLabel("Ders Dönemi:");

        dersKoduField = new JTextField(10);
        dersAdField = new JTextField(10);
        dersDonemField = new JTextField(10);

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dersKodu = dersKoduField.getText();
                String dersAd = dersAdField.getText();
                String dersDonem = dersDonemField.getText();

                Ders ders = new Ders(dersKodu, dersAd, dersDonem);

                // Dersi istenilen dosya uzantısına kaydetme işlemleri burada yapılabilir
                kaydetDers(ders);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(dersKoduLabel)
                                        .addComponent(dersAdLabel)
                                        .addComponent(dersDonemLabel))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(dersKoduField)
                                        .addComponent(dersAdField)
                                        .addComponent(dersDonemField)))
                        .addComponent(kaydetButton)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(dersKoduLabel)
                                .addComponent(dersKoduField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(dersAdLabel)
                                .addComponent(dersAdField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(dersDonemLabel)
                                .addComponent(dersDonemField))
                        .addComponent(kaydetButton)
        );
    }

    private void kaydetDers(Ders ders) {
        // Ders bilgilerini dosyaya yazma işlemleri
        String dosyaAdi = "dersler.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dosyaAdi, true))) {
            bufferedWriter.write("Ders Kodu: " + ders.getDersKodu() + ", Ders Adı: " + ders.getDersAd() +
                    ", Ders Dönemi: " + ders.getDersDonem() + "\n");

            System.out.println("Ders başarıyla kaydedildi.");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
}
