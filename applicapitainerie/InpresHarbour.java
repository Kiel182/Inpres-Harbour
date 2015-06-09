import Guis.*;

public class InpresHarbour 
{
    public static void main(String[] args) 
    {
        CapitainerieFrame CapiFrame = new CapitainerieFrame();
        DialLogin Login = new DialLogin(CapiFrame, true);
        
        Login.setVisible(true);
    }
}
