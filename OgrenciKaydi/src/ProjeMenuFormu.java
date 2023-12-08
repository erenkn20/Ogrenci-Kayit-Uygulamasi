import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjeMenuFormu extends JFrame {
    private JButton dersKayıtFormuButton;
    private JButton öğrenciKayıtFormuButton;

    public ProjeMenuFormu() {
        setTitle("Proje Menü Formu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton dersKayitButton = new JButton("Ders Kayıt Formu");
        JButton ogrenciKayitButton = new JButton("Öğrenci Kayıt Formu");

        dersKayitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DersKayitFormu dersKayitFormu = new DersKayitFormu();
                dersKayitFormu.setVisible(true);
            }
        });

        ogrenciKayitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OgrenciKayitFormu ogrenciKayitFormu = new OgrenciKayitFormu();
                ogrenciKayitFormu.setVisible(true);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(dersKayitButton)
                        .addComponent(ogrenciKayitButton)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(dersKayitButton)
                        .addComponent(ogrenciKayitButton)
        );
        dersKayıtFormuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DersKayitFormu DersKayitFormu = new DersKayitFormu();
                DersKayitFormu.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProjeMenuFormu form = new ProjeMenuFormu();
                form.setVisible(true);
            }
        });
    }
}