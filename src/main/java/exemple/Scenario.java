package exemple;

import java.util.*;
import bandeau.Bandeau;

public class Scenario {
	
	private ArrayList<NombreRepetitions> liste_effet;
	NombreRepetitions nbreRepetitions;
	
	public Scenario()
	{
		this.liste_effet = new ArrayList();
	}
	
	public void ajouterEffet(Effet e, int newNombreRepetitions)
	{
		
		NombreRepetitions nbre = new NombreRepetitions(e, newNombreRepetitions);
		liste_effet.add(nbre);
	}
	
	public void executer()
	{
		Bandeau b = new Bandeau();
		for(NombreRepetitions rp : liste_effet)
		{
			for(int i=0;i<rp.getRep();i++)
			{
				rp.getEffet().executer(b);
			}
		}
	}
}
