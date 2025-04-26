package Main.java;
public class Eredmeny 
{
    public int id;
    public int versenyzoId;
    public int versenyId;
    public int pontszam;
    public int helyezes;

    public Eredmeny(int versenyzoId, int versenyId, int pontszam, int helyezes) 
    {
        this.versenyzoId = versenyzoId;
        this.versenyId = versenyId;
        this.pontszam = pontszam;
        this.helyezes = helyezes;
    }
}