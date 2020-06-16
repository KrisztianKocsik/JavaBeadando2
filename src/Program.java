import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Program extends JFrame {

	private JPanel contentPane;
	private DbMethods dbm = new DbMethods();
	private DolgTM etm;
	private JarmTM jtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program frame = new Program();
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
	public Program() {
		dbm.Reg();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDolgozok = new JButton("Dolgoz\u00F3k");
		btnDolgozok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CsvReader();
				dbm.Connect();
				etm = dbm.ReadDataDolgozok();//dbm.ReadDataDolgozok();
				dbm.DisConnected();
				DolgList el = new DolgList(Program.this, etm);
				el.setVisible(true);

			}
		});
		btnDolgozok.setBounds(0, 11, 89, 23);
		contentPane.add(btnDolgozok);
		
		JButton btnJarmu = new JButton("J\u00E1rm\u0171vek");
		btnJarmu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CsvReader();
				dbm.Connect();
				jtm = dbm.ReadDataJarmu();//dbm.ReadDataJarmu();
				dbm.DisConnected();
				JarmList jl = new JarmList(Program.this, jtm);
				jl.setVisible(true);	
			}
		});
		btnJarmu.setBounds(0, 45, 89, 23);
		contentPane.add(btnJarmu);
	
	//Object dolgtmn[] = {"id","Név","Szem.szám","Leanykori név","Születési év","Beosztás","Érvényesség","e-mail","mobil","Irányítószám","Város","Utca","Házszám","Emelet","Ajtó","Aktív"};
	//etm = new DolgTM(dolgtmn, 0);	
	}
}
