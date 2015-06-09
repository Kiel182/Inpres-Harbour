package MoyenTransport;
import java.util.*;

public class Equipage
{
	protected Marin _capitaine;
	protected Marin _second;
	protected Vector<Marin> _equipage;

	public Equipage() 
        { 
            _capitaine = new Marin(); 
            _second = new Marin();
            _equipage = new Vector<Marin>(); 
        }
        
	public Equipage(Marin c, Marin s) 
        { 
            _capitaine = new Marin(c);
            _second = new Marin(s); 
            _equipage = new Vector<Marin>(); 
        }

	public Marin getCapitaine()             { return _capitaine; }
	public Marin getSecond()                { return _second; }

	public void setCapitaine(Marin c) 	{ _capitaine = new Marin(c); }
	public void setSecond(Marin s)		{ _second = new Marin(s); }

	public void ajoutMarin(Marin nveau)	{ _equipage.add(nveau); }
}
