package MoyenTransport;
import MoyenTransport.*;

public class Marin extends Personne implements AUnIdentifiant
{
	private		String 	_fonction;

	public Marin() { _fonction = "Inconnue"; }
        
	public Marin(String n, String p, String d, String f) throws SailorWithoutIdentificationException
	{ 
		super(n, p, d);
		_fonction = f; 
	}
	public Marin(Marin m)
	{
		super(m);
		_fonction = m.getFonction();
	}

	public 	String	getFonction()		{ return _fonction; }
	public	String	getIdentifiant()	{ return _nom + _prenom + _dateNaissance; }

	public  void 	setFonction(String f){ _fonction = f; }
}
