import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DbMethods {
	private Statement s = null;
	private Connection conn = null;
	private ResultSet rs = null;
	
	public void Reg()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			//SM("Sikeres driver regisztracio!", 1);
		}
		catch (ClassNotFoundException e) {
			//SM("Hibas driver regisztracio!"+e.getMessage(), 0);
		}
		
	}
	
	public void Connect() 
	{
		try {
			String url = "jdbc:sqlite:E:/LEARN/DB2/beadando_jdbc/empdb";
			conn = DriverManager.getConnection(url);
			//SM("Connection OK!", 1);
		}
		catch (SQLException e) {
			SM(e.getMessage(), 0);
		}
	}
	
	public void DisConnected()
	{
		try {
			conn.close();
			//SM("DisConnecion OK!", 1);
		}
		catch (SQLException e) {
			SM(e.getMessage(), 0);
		}
	}
	
	public DolgTM ReadDataDolgozok()
	{
		Object dolgtmn[] = {"id","Név","Szem.szám","Leanykori név","Születési év","Beosztás","Érvényesség","e-mail","mobil","Irányítószám","Város","Utca","Házszám","Emelet","Ajtó","Aktív"};
		DolgTM etm = new DolgTM(dolgtmn, 0);	
		String nev="" , szemszam="", leanynev="", szul="", beosztas="", kezddatum="";
		String email="", mobil="", irsz="", varos="", utca="", emelet="" , x="\t";
		int id=0, hazszam=0, ajto=0, aktiv=0;
		String sqlp = "select dol_id, dol_nev, dol_szemelyi_szam, dol_leanykori_nev, dol_szul, dol_beosztas, dol_ervenyesseg, dol_email, dol_mobil, dol_irsz, dol_varos, dol_utca, dol_hazszam, dol_emelet, dol_ajto, dol_aktiv from dolgozok";
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next())
			{
				id = rs.getInt("dol_id");
				nev = rs.getString("dol_nev");
				szemszam = rs.getString("dol_szemelyi_szam");
				leanynev = rs.getString("dol_leanykori_nev");
				szul = rs.getString("dol_szul");
				beosztas = rs.getString("dol_beosztas");
				kezddatum = rs.getString("dol_ervenyesseg");
				email = rs.getString("dol_email");
				mobil = rs.getString("dol_mobil");
				irsz = rs.getString("dol_irsz");
				varos = rs.getString("dol_varos");
				utca = rs.getString("dol_utca");
				hazszam = rs.getInt("dol_hazszam");
				emelet = rs.getString("dol_emelet");
				ajto = rs.getInt("dol_ajto");
				aktiv = rs.getInt("dol_aktiv");
				//System.out.println(id+x+nev+x+szemszam+x+leanynev+x+szul+x+beosztas+x+kezddatum+x+email+x+mobil+x+irsz+x+varos+x+utca+x+hazszam+x+emelet+x+ajto+x+aktiv);
				etm.addRow(new Object[]{id, nev, szemszam, leanynev, szul, beosztas, kezddatum, email, mobil, irsz, varos, utca, hazszam, emelet, ajto, aktiv});
			}
			rs.close();
		}
		catch (SQLException e)
		{
			SM(e.getMessage(), 0);
		}
		return etm;
	}
	
	public JarmTM ReadDataJarmu()
	{
		Object jarmtmn[] = {"id","Rendszám","Márka","Típus","Súly","Szín","Jelleg","Tulaj.Id","Tulajdonos","Érvényesség"};
		JarmTM jtm = new JarmTM(jarmtmn, 0);	
		String rendszam="" , marka="", tipus="", szin="", jelleg="", ervenyesseg="" , dolgnev="" , x="\t";
		int jid=0, suly=0, dolgid=0;
		String sqlp = "select ja_id, ja_rendszam, ja_marka, ja_tipus, ja_suly, ja_szin, ja_jelleg, ja_dol_id, dol_nev, ja_ervenyesseg from jarmu left join dolgozok on dol_id = ja_dol_id";
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next())
			{
				jid = rs.getInt("ja_id");
				rendszam = rs.getString("ja_rendszam");
				marka = rs.getString("ja_marka");
				tipus = rs.getString("ja_tipus");
				suly = rs.getInt("ja_suly");
				szin = rs.getString("ja_szin");
				jelleg = rs.getString("ja_jelleg");
				dolgid = rs.getInt("ja_dol_id");
				dolgnev = rs.getString("dol_nev");
				ervenyesseg = rs.getString("ja_ervenyesseg");
				//System.out.println(id+x+nev+x+szemszam+x+leanynev+x+szul+x+beosztas+x+kezddatum+x+email+x+mobil+x+irsz+x+varos+x+utca+x+hazszam+x+emelet+x+ajto+x+aktiv);
				jtm.addRow(new Object[]{jid, rendszam, marka, tipus, suly, szin, jelleg, dolgid, dolgnev, ervenyesseg});
			}
			rs.close();
		}
		catch (SQLException e)
		{
			SM(e.getMessage(), 0);
		}
		return jtm;
	}
	
	public void SM(String msg, int tipus) 
	{
		JOptionPane.showMessageDialog(null, msg, "Program uzenet", tipus);
	}
	

}
