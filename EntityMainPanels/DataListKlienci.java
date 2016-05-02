/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_projekt1;

public class DataListKlienci 
{
    public int id_p;
    public String id_k, pesel,imie, nazwisko, plec, kraj, miejscowosc, ulica, nr_budynku, nr_mieszkania, nr_telefonu, email;
    
    public DataListKlienci(String ID_K, int ID_P, String Pesel, String Imie, String Nazwisko, String Plec, String Kraj, String Miejscowosc, String Ulica, String Nr_Budynku, String Nr_mieszkania, String Nr_telefonu, String Email)
    {
        
        id_p = ID_P;
        id_k = ID_K;
        pesel = Pesel;
        imie = Imie;
        nazwisko = Nazwisko;
        plec = Plec;
        kraj = Kraj;
        miejscowosc = Miejscowosc;
        ulica = Ulica;
        nr_budynku = Nr_Budynku;
        nr_mieszkania = Nr_mieszkania;
        nr_telefonu = Nr_telefonu;
        email = Email;
                
    }
}
