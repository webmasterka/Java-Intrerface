package interfejsy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {



        int[] tab = new int[3];

        tab[0] = 1;
        tab[1] = -5;
        tab[2] = 3;

        Arrays.sort(tab);

//        System.out.println(tab[0]);

        Pracownik[] pracownik = new Pracownik[3];

        pracownik[0] =new Pracownik(7000);
        pracownik[1] = new Pracownik(10000);
        pracownik[2] = new Pracownik(3000);

        for(Pracownik p: pracownik) {
            System.out.println(p.getWynagrodzenie());
        }

        Arrays.sort(pracownik);

        Arrays.sort(pracownik, Collections.reverseOrder());

        for(Pracownik p: pracownik) {
            System.out.println(p.getWynagrodzenie());
        }

        System.out.println(pracownik[0].compareTo(pracownik[1]));




    }
}

interface nazwaInterfejsu
{
    double PI = 3.14; // public, static i final

    void cos ();
}

class Pracownik implements nazwaInterfejsu, Comparable
{

    @Override
    public void cos() {

    }

    private double wynagrodzenie;

    public Pracownik(double wynagordzenie) {
        this.wynagrodzenie = wynagordzenie;
    }
    public double getWynagrodzenie () {
       return this.wynagrodzenie;
}

    @Override
    public int compareTo(Object o) {

       Pracownik przyslany =  ((Pracownik)o);

        if(this.wynagrodzenie < przyslany.wynagrodzenie)
            return -1;
        if(this.wynagrodzenie > przyslany.wynagrodzenie)
            return 1;
        return 0;

    }
}