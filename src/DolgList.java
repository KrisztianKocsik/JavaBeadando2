import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;

public class DolgList extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DolgTM etm;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DolgList dialog = new DolgList();
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
	public DolgList(JFrame f, DolgTM betm) {
		super(f, "Dolgozók listája", true);
		etm = betm;
		
		setBounds(100, 100, 600, 430);
		getContentPane().setLayout(new BorderLayout());
		//contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		//getContentPane().add(contentPanel, BorderLayout.CENTER);
		//contentPanel.setLayout(null);
		
		
		JButton btnBezar = new JButton("Bez\u00E1r");
		btnBezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnBezar.setBounds(175, 227, 89, 23);
		getContentPane().add(btnBezar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 208);
		getContentPane().add(scrollPane);
		
		table = new JTable(etm);
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
		TableRowSorter<DolgTM> trs = 
				(TableRowSorter<DolgTM>)table.getRowSorter();
		trs.setSortable(0, false);

	}
}
