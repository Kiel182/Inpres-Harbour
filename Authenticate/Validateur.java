package Authenticate;

public class Validateur
{
	protected String _chaine;
	
	public boolean isValid()
        {
            int length = _chaine.length();
            
            if( length < 10 ) return true;
            return false;
        }
}
