import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewDolg extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewDolg dialog = new NewDolg();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public NewDolg() {
		setBounds(100, 100, 600, 430);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(10, 11, 36, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00E9v:");
		lblNewLabel_1.setBounds(10, 36, 36, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Szem\u00E9lyi sz\u00E1m:");
		lblNewLabel_2.setBounds(10, 64, 85, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("L\u00E1nykori n\u00E9v:");
		lblNewLabel_3.setBounds(10, 89, 85, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sz\u00FClet\u00E9si \u00E9v:");
		lblNewLabel_4.setBounds(10, 114, 85, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Beoszt\u00E1s:");
		lblNewLabel_5.setBounds(10, 139, 85, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Neme:");
		lblNewLabel_6.setBounds(10, 164, 36, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setBounds(10, 219, 36, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Mobil:");
		lblNewLabel_8.setBounds(10, 247, 36, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("irsz.:");
		lblNewLabel_9.setBounds(10, 289, 26, 14);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("V\u00E1ros");
		lblNewLabel_10.setBounds(150, 289, 36, 14);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Utca:");
		lblNewLabel_11.setBounds(10, 317, 26, 14);
		getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("H\u00E1zsz\u00E1m:");
		lblNewLabel_12.setBounds(10, 345, 48, 14);
		getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Emelet:");
		lblNewLabel_13.setBounds(150, 345, 48, 14);
		getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Ajt\u00F3:");
		lblNewLabel_14.setBounds(272, 345, 48, 14);
		getContentPane().add(lblNewLabel_14);
		
		textField = new JTextField();
		textField.setBounds(52, 8, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(52, 33, 240, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 58, 96, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 86, 190, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 111, 96, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(73, 139, 125, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(52, 164, 96, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(46, 216, 146, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(46, 244, 146, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(46, 286, 96, 20);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(189, 286, 103, 20);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(46, 314, 96, 20);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(68, 342, 72, 20);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(196, 342, 72, 20);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(302, 342, 72, 20);
		getContentPane().add(textField_14);
		textField_14.setColumns(10);

	}
}
