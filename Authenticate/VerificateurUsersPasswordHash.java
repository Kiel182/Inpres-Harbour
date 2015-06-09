package Authenticate;
import java.util.Hashtable;

public class VerificateurUsersPasswordHash extends VerificateurMotDePasse 
{
	private Hashtable _logs;
        
        public VerificateurUsersPasswordHash()
        {
            _logs = new Hashtable();
            _logs.put("lionel","lionel");
            _logs.put("anto", "anto");
        }

        @Override
	public String findPwd(String l)
	{
            if(_logs.containsKey(l)) return (String)_logs.get(l);
            return null;
	}
}