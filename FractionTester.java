public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction(12,1);
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        f.setNumerator(12);
        f.setDenominator(1);
        System.out.println(f.getNumerator() + "/" + f.getDenominator());
        System.out.println(f.toString());
        
        // neues Fraction-Objekt (S. 18 oben)
        Fraction f2 = new Fraction(10,2);
        System.out.println(f2.toString());
        
        // Fraction f3= new Fraction(0,0);
        // System.out.println(f3.toString());
        Fraction f4 = new Fraction();
        System.out.println(f4.toString());  //Methode this(0,1)

        // Copy-Konstruktor und equals():
        Fraction g = new Fraction(f);
        System.out.println(g.toString());
        System.out.println(g.equals(f));    //Inhaltsgleichheit
        System.out.println(g==f);           //Objektgleichheit
        System.out.println(g.equals(f));    //equals

            //Vergleiche Brüche mit gleichem Wert, aber unterschiedlichen Zählern und Nennern
        Fraction f5 = new Fraction (3,4);
        Fraction f6 = new Fraction (6,8);
        System.out.println(f5.equals(f6));
        System.out.println(f6.equals(f5));
        System.out.println(f5==f6);         //Objektgleichheit

        //statische und dynamische Methoden
        Fraction f7= new Fraction (1,2);
        Fraction f8 = new Fraction (1,4);
        f7.add(f8);
        System.out.println(f7.toString());
        System.out.println(Fraction.add(f7,f8));
        System.out.println(f7==f8);
        System.out.println(f7.equals(f8));
        Fraction f9 = new Fraction (1,2);
        System.out.println(Fraction.add(f9,f8));
        // statische Variablen:
        System.out.println(Fraction.numberOfFractions);

        //Konstante
        final double PI=3.14159;    //Aufgabe 2 a)
        PI = PI + 1;
        System.out.println(PI);


    }

}
