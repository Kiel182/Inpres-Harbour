package MoyenTransport;
import MoyenTransport.*;
import java.util.*;

public class Ponton implements Amarrage
{
	protected Vector<MoyenDeTransportEau> _listeCote1;
	protected Vector<MoyenDeTransportEau> _listeCote2;
	protected int _capacite;

	public Ponton()
	{ 
		_listeCote1 = new Vector<MoyenDeTransportEau>(); 
                _listeCote2 = new Vector<MoyenDeTransportEau>(); 
		_capacite = 15; 
	}

	public Vector<MoyenDeTransportEau> getListe(int cote)
	{ 
		if(cote == 1)
			return _listeCote1;
		else 
			return _listeCote2; 
	}

	public void ajoutBateau(MoyenDeTransportEau mdt, int cote){
		if(cote == 1)
			_listeCote1.add(mdt); /*_capacite--;*/
		if(cote == 2)
			_listeCote2.add(mdt);
	}
	//public void retirerBateauQuai(){}

        @Override
	public int getCapacite(){ return _capacite; }
	public String getIdentifiant(){ return this.toString(); }
    
	public void setCapacite(int c){ _capacite = c; }
}
