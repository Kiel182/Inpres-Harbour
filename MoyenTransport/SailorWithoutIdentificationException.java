package MoyenTransport;

public class SailorWithoutIdentificationException extends Exception
{
    SailorWithoutIdentificationException()
    {
        super("Nom et/ou prénom de la personne incomplète !");
    }
}
