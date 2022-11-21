package exemple;
import bandeau.Bandeau;

public class Clignotant extends Effet{

	public void executer(Bandeau b)
	{
			b.setMessage("Clignotant");
			b.sleep(80);
			b.setMessage("");
			b.sleep(80);
	}
}
