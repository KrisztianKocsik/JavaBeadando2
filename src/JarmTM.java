import javax.swing.table.DefaultTableModel;

public class JarmTM extends DefaultTableModel {
	public JarmTM (Object fildNames[], int rows)
	{
		super(fildNames, rows);
	}
	
	public boolean isCellEditabe(int row, int col)
	{
		if(col == 8)
		{
			return true;
		}
		return false;
	}
	
	public Class<?> getColumnClass(int index)
	{
		//if (index == 16) return(Boolean.class);
		if (index == 0 || index == 4 || index == 7) return(Integer.class);
		return(String.class);
	}
}
