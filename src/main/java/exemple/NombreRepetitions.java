package exemple;

public class NombreRepetitions {

	private int nbreRepetitions;
	private final Effet effet;
	
	public NombreRepetitions(Effet e,int nbreRepetitions)
	{
		this.effet = e;
		this.nbreRepetitions = nbreRepetitions;
	}
	
	public int getRep()
	{
		return nbreRepetitions;
	}
	
	public Effet getEffet()
	{
		return effet;
	}
}
