package MoyenTransport;

public class BateauPlaisance extends Bateau
{
	private String _permis;

	public BateauPlaisance(){ _permis = "Inconnu"; }

	public BateauPlaisance(String n, String p, int t, int l, String pv, int nbpers, String e, String perm) throws ShipWithoutIdentificationException
	{
		super(n, p, t, l, pv, nbpers, e);	//Appel du constructeur de la superclass
		_permis = perm;
	}

	public String getPermis(){ return _permis; }

	public void setPermis(String perm){ _permis = perm; }
}
