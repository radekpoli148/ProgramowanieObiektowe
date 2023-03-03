/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programwanieobiektowe;

public class ProgramwanieObiektowe {
    
    public static void main(String[] args) {
        /*
            Obiekty - pojemniki do przechowywania zmiennych i funkcji tematycznie
                      ze sobą powiązanych do dalszego łatwiejszego ponownego użytku
            Klasy - foremki do tworzenia egzemplarzy obiektów
        
            Properties - właściwości
            Metody - funkcje
        */
        Monitor abc = new Monitor();
        abc.wysokosc = 130;
        abc.szerokosc = 185;
        Monitor abc2 = new Monitor();
        abc2.szerokosc = 215;
        
        System.out.println(abc.wysokosc);
        System.out.println(abc.szerokosc);
        System.out.println(abc2.szerokosc);
        abc.wlacz();
        abc.wylacz();
        
        //new Punkt();//konstruktor domyślny
        
        Punkt p = new Punkt(8, 4);
        
        System.out.println("p.x "+ p.x);
        System.out.println("p.y "+ p.y);
        
        Punkt p2 = new Punkt();
        
        System.out.println("p2.x "+ p2.x);
        System.out.println("p2.y "+ p2.y);
        
        Test a = new Test();
        
        a.wypisz("Arek", "Włodarczyk");
        double wynik = a.dzielenie(10, 40);
        
        System.out.println(wynik);
        
        int wynik2 = a.dodaj(3, 6);
        System.out.println(wynik2);
        
        double wynik3 = a.dodaj(3.449, 6.215);
        System.out.println(wynik3);
    }
    
}

class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor domyślny");
        
    }
    Punkt(int x, int y)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        this.x = x;
        this.y = y;
    }
    int x, y;
}

class Monitor
{
    //parametry
    int szerokosc; 
    int wysokosc;
    
    //metody
    void wlacz()
    {
        
    }
    void wylacz()
    {
        
    }
}

class Test
{
    void wypisz(String imie, String nazwisko)
    {
        System.out.println(imie + " " + nazwisko);
    }
    
    int dodaj(int a, int b)
    {
        return a + b;
    }
    
    double dodaj(double a, double b)
    {
        return a + b;
    }
    
    double dzielenie(double a, double b)
    {
        if(b == 0)
            return 0;
        
        return a/b;
    }
}