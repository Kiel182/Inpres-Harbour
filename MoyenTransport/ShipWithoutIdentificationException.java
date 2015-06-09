package MoyenTransport;

public class ShipWithoutIdentificationException extends Exception
{
    ShipWithoutIdentificationException() { super("Nom et/ouport d'attache incomplet !"); }
}
