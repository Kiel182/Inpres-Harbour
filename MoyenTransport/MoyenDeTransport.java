package MoyenTransport;

public abstract class MoyenDeTransport implements AvecPersonnes
{
	protected int       _nbPersonnes;
	protected String    _energie;

        @Override
	public int getNombrePersonnes(){ return _nbPersonnes; }
	public String getEnergie(){ return _energie; }

	public void setNombrePersonnes(int n){ _nbPersonnes = n; }
	public void setEnergie(String e){ _energie = e; }
}
