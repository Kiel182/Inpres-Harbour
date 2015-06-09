package MoyenTransport;

public abstract class MoyenDeTransportEau extends MoyenDeTransport
{
	protected boolean   _submersible;

	public boolean getSubmersible(){ return _submersible; }

	public void setSubmersible(boolean s){ _submersible = s; }
}