package exemple;
import bandeau.Bandeau;

public class TourComplet extends Effet{

	public void executer(Bandeau b)
	{
		b.setMessage("Rotation");
		for(int i =0; i<360;i++)
		{
			b.sleep(30);
			b.setRotation(i);
		}
	}
}
