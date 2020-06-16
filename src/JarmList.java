import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JarmList extends JDialog {
	private JPanel contentPanel = new JPanel();
	private JTable table;
	private JarmTM jtm;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JarmList dialog = new JarmList();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the dialog.
	 */
	public JarmList(JFrame f, JarmTM betm) {
		super (f, "Jármûvek listája", true);
		jtm = betm;
		
		setBounds(100, 100, 600, 430);
		getContentPane().setLayout(new BorderLayout());
		
		JButton btnBezar = new JButton("Bez\u00E1r");
		btnBezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBezar.setBounds(171, 227, 89, 23);
		getContentPane().add(btnBezar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 211);
		getContentPane().add(scrollPane);
		
		table = new JTable(jtm);
		scrollPane.setViewportView(table);
		
		TableColumn tc = null;
		for (int i = 0; i < 6; i++)
		{
			tc = table.getColumnModel().getColumn(i);
			if (i==0 || i==1) tc.setPreferredWidth(30);
			else if (i==4) tc.setPreferredWidth(150);
			else {tc.setPreferredWidth(100);}
		}
		
		table.setAutoCreateRowSorter(true);
		TableRowSorter<JarmTM> trs = 
				(TableRowSorter<JarmTM>)table.getRowSorter();
		trs.setSortable(0, false);

	}
}
