package Capitainerie;

import Guis.*;

public class InpresHarbour 
{
    public static void main(String[] args) 
    {
        CapitainerieFrame CapiFrame = new CapitainerieFrame();
        DialLogin Login = new DialLogin(CapiFrame, true, "Coucou");
        
        Login.setVisible(true);
    }
}
