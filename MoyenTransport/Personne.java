package MoyenTransport;

public class Personne
{
	protected	String _nom;
	protected	String _prenom;
	protected	String _dateNaissance;

	public	Personne()
	{
            _nom = "Inconnu";
            _prenom = "Inconnu";
            _dateNaissance = "jj/mm/aaaa";
	}

	public 	Personne(String n, String p, String d) 
	{
            try
            {
               if( n == null ) throw new SailorWithoutIdentificationException();
               _nom = n; 
               
               if( p == null ) throw new SailorWithoutIdentificationException();
               _prenom = p;
               
            } catch ( SailorWithoutIdentificationException exc )
            {
                System.out.println(exc.getMessage());
            }
           
            _dateNaissance = d;
	}

	public	Personne(Personne p)
	{
            _nom = p.getNom();
            _prenom = p.getPrenom();
            _dateNaissance = p.getDateNaissance();
	}

	public String getNom()                  { return _nom; }
	public String getPrenom()               { return _prenom; }
	public String getDateNaissance()        { return _dateNaissance; }

	public void setNom(String n)		{ _nom = n; }
	public void setPrenom(String p)		{ _prenom = p; }
	public void setDateNaissance(String d)	{ _dateNaissance = d; }

}
