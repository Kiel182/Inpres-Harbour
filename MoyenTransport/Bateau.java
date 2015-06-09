package MoyenTransport;
import MoyenTransport.Equipage.*;

public class Bateau extends MoyenDeTransportEau implements AUnIdentifiant		//Devra référencier l'équipage + Gestion de l'exception quand pas d'id
{
        protected int 		_tonnage;
	protected int 		_longueur;
	protected String        _nom;
	protected String 	_portAttache;
	protected String 	_pavillon;
	protected Equipage	_equipage;

	public Bateau()
	{
            // Variables Class MoyenTransport
	    setNombrePersonnes(0);
            setEnergie("Inconnu");
            
            // Variables Class MoyenDeTransportEau
            setSubmersible(false);
            
            // Variables membres
            _nom = _pavillon = _portAttache = "Inconnu"; 
            _tonnage = _longueur = 0; 
            _equipage = new Equipage();
	}

	public Bateau(String n, String p, int t, int l, String pv, int nbpers, String e)
	{
            // Variables Class MoyenTransport
            setNombrePersonnes(nbpers);
            setEnergie(e);
            
            // Variables Class MoyenDeTransportEau
            setSubmersible(false);
            
            // Variables this
            try
            {
                if( n == null ) throw new ShipWithoutIdentificationException();
                _nom = n;
                if( p == null ) throw new ShipWithoutIdentificationException();
                _portAttache = p; 
                _tonnage = t; 
                _longueur = l; 
                _pavillon = pv;
                _equipage = new Equipage();
                
            } catch( ShipWithoutIdentificationException exc )
            {
                System.out.println(exc.getMessage());
            }
	}

        @Override
	public String 	getIdentifiant()	{ return _nom + _portAttache; }
	public String	getNom()		{ return _nom; }
	public String	getPortAttache()	{ return _portAttache; }
	public String	getPavillon()		{ return _pavillon; }
	public int 	getLongueur()		{ return _longueur; }
	public int 	getTonnage()		{ return _tonnage; }
	public Equipage getEquipage()		{ return _equipage; }

	public void setNom(String n)		{ _nom = n; }
	public void setPortAttache(String p)	{ _portAttache = p; }
	public void setPavillon(String pv)	{ _pavillon = pv; }
	public void setLongueur(int l)		{ _longueur = l; }
	public void setTonnage(int t)		{ _tonnage = t; }
}