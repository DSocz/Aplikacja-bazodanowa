/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_projekt1;


        
public class DataListOddzialy 
{
    public String ID_O, Ulica , Nr_Budynku, Nr_telefonu, Email, Data_zalozenia;
    public int ID_P;
    
    public DataListOddzialy(String id_o, String ulica, String nr_budynku, String nr_telefonu, String email, String data_zalozenia, int id_p)
    {   
        ID_O = id_o;
        Ulica = ulica;
        Nr_Budynku = nr_budynku;
        Nr_telefonu = nr_telefonu;
        Email = email;
        Data_zalozenia = data_zalozenia;
        ID_P = id_p;
    }
}
