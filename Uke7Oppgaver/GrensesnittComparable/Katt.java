package GrensesnittComparable;

import java.util.List;
import java.util.ArrayList;

class Katt implements Comparable<Katt>{
    protected String navn;
    protected int alder;


    public Katt(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }
    public String toString(){
        return "Navn: " + this.navn + "\nAlder: " + this.alder;
    }

    @Override
    public int compareTo(Katt andreKatt) {
        return this.alder - andreKatt.alder;
    }

    public static void main(String[] args){
        List<Katt> katter = new ArrayList<>();
        katter.add(new Katt("jens", 11));
        katter.add(new Katt("jacob", 14));
        katter.add(new Katt("thea", 1));
        katter.add(new Katt("markus", 11));

        Katt eldsteKatt = katter.get(0);
        for (Katt i: katter){
            if (eldsteKatt.compareTo(i) < 0){
                eldsteKatt = i;
            }
        }

        System.out.println("Den eldste katten er: ");
        System.out.println(eldsteKatt);

    }

}