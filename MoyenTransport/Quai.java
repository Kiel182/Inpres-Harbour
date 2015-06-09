package MoyenTransport;
import MoyenTransport.*;
import java.util.*;

public class Quai implements Amarrage
{
	protected Vector<MoyenDeTransportEau> _liste;
	protected int _capacite;

	public Quai()
        { 
            _liste = new Vector<MoyenDeTransportEau>();
            _capacite = 15; 
        }

	public Vector<MoyenDeTransportEau> getListe(){ return _liste; }

	public void ajoutBateau(MoyenDeTransportEau mdt)
        { 
            _liste.add(mdt);
            _capacite--; 
        }
	//public void retirerBateauQuai(){}

	public int getCapacite(){ return _capacite; }
	public String getIdentifiant(){ return this.toString(); }

	public void setCapacite(int c){ _capacite = c; }
}
