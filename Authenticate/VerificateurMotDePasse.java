package Authenticate;

public abstract class VerificateurMotDePasse extends Validateur implements Verificateur 
{
	protected String _login;
	protected String _password;

	public String getLogin() { return _login; }
	public String getPassword() { return _password; }

	public void setLogin(String l) { _login = l; }
	public void setPassword(String pwd) { _password = pwd; }

	abstract String findPwd(String l);
        @Override
	public boolean isOk()
        {
            String foundPassword = findPwd(_login);
            if( foundPassword == null ) return false;
         
            else
            {
                if( _password.equals(foundPassword) )
                {
                    _chaine = _password;
                    if( isValid() == true ) return true;
                }
                
                return false;
            }	
	}
}