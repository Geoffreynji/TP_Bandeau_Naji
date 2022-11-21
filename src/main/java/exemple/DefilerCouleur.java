package exemple;
import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;


public class DefilerCouleur {

	public void executer(Bandeau b)
	{
		for(int i = 0;i<25;i++)
		{
			b.setMessage("ChangeCouleur");
			b.setForeground(Color.blue);
			b.sleep(600);
			b.setForeground(Color.red);
			b.sleep(600);
			b.setForeground(Color.green);
			b.sleep(600);
			b.setForeground(Color.pink);
			b.sleep(600);
		}
	}
}
