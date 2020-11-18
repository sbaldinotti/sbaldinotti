/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baldinotti_film;

/**
 *
 * @author 4BIA
 */
public class Film 
{
    private String titolo;
    private String regista;
    private String genere;
    private int anno;
    private int durata;
    public Film(String titolo, String regista, String genere, int anno, int durata)
    {
        this.titolo= titolo;
        this.regista= regista;
        this.genere= genere;
        this.anno= anno;
        this.durata= durata;
    }
    
    
    /*public String gettitolo()
    {
        return titolo;
    }
    */
   
    
    
    public String toString()//restituisce una stringa con le informazioni dell'oggetto
    {
        return titolo+""+regista+""+genere+""+anno+""+durata;//da inserire gli attributi dell'oggetto
    }
    
    
}
