import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OgrenciKayitFormu extends JFrame {
    private JTextField ogrenciNoField;
    private JTextField ogrenciAdField;
    private JTextField ogrenciSoyadField;
    private JTextField ogrenciBolumField;
    private JComboBox<String> ogrenciDerslerComboBox;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField ogrenciNumarasi;
    private JTextField textField4;
    private JButton button1;
    private JLabel ogrenciAdi;
    private JLabel ogrenciSoyadi;
    private JLabel ogrenciBolumu;
    private JLabel ogrenciDersleri;

    public OgrenciKayitFormu() {
        setTitle("Öğrenci Kayıt Formu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel ogrenciNoLabel = new JLabel("Öğrenci No:");
        JLabel ogrenciAdLabel = new JLabel("Öğrenci Adı:");
        JLabel ogrenciSoyadLabel = new JLabel("Öğrenci Soyadı:");
        JLabel ogrenciBolumLabel = new JLabel("Öğrenci Bölümü:");
        JLabel ogrenciDerslerLabel = new JLabel("Öğrenci Dersleri:");

        ogrenciNoField = new JTextField(10);
        ogrenciAdField = new JTextField(10);
        ogrenciSoyadField = new JTextField(10);
        ogrenciBolumField = new JTextField(10);

        // Öğrenci derslerini doldurmak için örnek dersler
        List<Ders> dersList = new ArrayList<>();
        dersList.add(new Ders("101", "Matematik", "2023-1"));
        dersList.add(new Ders("102", "Fizik", "2023-1"));
        dersList.add(new Ders("103", "Kimya", "2023-1"));

        ogrenciDerslerComboBox = new JComboBox<>();
        for (Ders ders : dersList) {
            ogrenciDerslerComboBox.addItem(ders.getDersAd());
        }

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ogrenciNo = Integer.parseInt(ogrenciNoField.getText());
                String ogrenciAd = ogrenciAdField.getText();
                String ogrenciSoyad = ogrenciSoyadField.getText();
                String ogrenciBolum = ogrenciBolumField.getText();
                String selectedDers = (String) ogrenciDerslerComboBox.getSelectedItem();

                // Öğrenci bilgileri ve seçilen dersi istenilen dosya uzantısına kaydetme işlemleri burada yapılabilir
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(ogrenciNoLabel)
                                        .addComponent(ogrenciAdLabel)
                                        .addComponent(ogrenciSoyadLabel)
                                        .addComponent(ogrenciBolumLabel)
                                        .addComponent(ogrenciDerslerLabel))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(ogrenciNoField)
                                        .addComponent(ogrenciAdField)
                                        .addComponent(ogrenciSoyadField)
                                        .addComponent(ogrenciBolumField)
                                        .addComponent(ogrenciDerslerComboBox)))
                        .addComponent(kaydetButton)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ogrenciNoLabel)
                                .addComponent(ogrenciNoField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ogrenciAdLabel)
                                .addComponent(ogrenciAdField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ogrenciSoyadLabel)
                                .addComponent(ogrenciSoyadField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ogrenciBolumLabel)
                                .addComponent(ogrenciBolumField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ogrenciDerslerLabel)
                                .addComponent(ogrenciDerslerComboBox))
                        .addComponent(kaydetButton)
        );
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
