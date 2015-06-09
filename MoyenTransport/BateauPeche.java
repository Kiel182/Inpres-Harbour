package MoyenTransport;

public class BateauPeche extends Bateau
{
	private String _type;

	public BateauPeche() { _type = "Inconnu"; }
        
	public BateauPeche(String n, String p, int t, int l, String pv, int nbpers, String e, String type)
	{
            // Appel constructeur Class Bateau
            super(n, p, t, l, pv, nbpers, e);
            
            // Variable membre this
            _type = type;
	}

	public String getType(){ return _type; }

	public void setType(String type){ _type = type; }
}
