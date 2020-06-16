import javax.swing.table.DefaultTableModel;

public class DolgTM extends DefaultTableModel {
	public DolgTM (Object fildNames[], int rows)
	{
		super(fildNames, rows);
	}
	
	public boolean isCellEditabe(int row, int col)
	{
		if(col == 6)
		{
			return true;
		}
		return false;
	}
	
	public Class<?> getColumnClass(int index)
	{
		//if (index == 16) return(Boolean.class);
		if (index == 15 || index == 14 || index == 12 || index == 0 ) return(Integer.class);
		return(String.class);
	}

}
