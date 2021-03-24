package calisan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class form extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	boolean a=true;
	employee calisan;
	Boss patron1;
	private JTextField txtAd;
	private JTextField txtSoyad;
	private JTextField txtHaftalik;
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(32, 240, 337, 16);
		contentPane.add(lblNewLabel);
		
		patron1 = new Boss("Ahmet", "Paşa", 3000.0);
		calisan=patron1;
		lblNewLabel.setText(calisan.toString());
		
		JLabel lblNewLabel_1 = new JLabel("Ad");
		lblNewLabel_1.setBounds(32, 28, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setBounds(32, 56, 61, 16);
		contentPane.add(lblSoyad);
		
		JLabel lblHaftalk = new JLabel("Haftalık");
		lblHaftalk.setBounds(32, 86, 61, 16);
		contentPane.add(lblHaftalk);
		
		txtAd = new JTextField();
		txtAd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String str = txtAd.getText();
				txtAd.setText(str.toUpperCase());
			}
		});
		txtAd.setBounds(105, 23, 130, 26);
		txtAd.setToolTipText("Çalışanın adını yazınız...");
		contentPane.add(txtAd);
		txtAd.setColumns(10);
		
		txtSoyad = new JTextField();
		txtSoyad.setColumns(10);
		txtSoyad.setBounds(105, 51, 130, 26);
		txtSoyad.setToolTipText("Çalışanın soyadını yazınız...");
		contentPane.add(txtSoyad);
		
		
		txtHaftalik = new JTextField();
		txtHaftalik.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

			}
			@Override
			public void keyReleased(KeyEvent e) {
				char ch=e.getKeyChar();
				if(Character.isDigit(ch)==false)
					txtHaftalik.setText("");
				
			}
		});
		txtHaftalik.setColumns(10);
		txtHaftalik.setBounds(105, 81, 130, 26);
		txtHaftalik.setToolTipText("Çalışanın haftalığını tam sayı olarak yazınız...");
		contentPane.add(txtHaftalik);
		
		JButton btnNewButton = new JButton("Kaydet");
		btnNewButton.setBounds(105, 119, 117, 29);
		contentPane.add(btnNewButton);
		
	}
}
