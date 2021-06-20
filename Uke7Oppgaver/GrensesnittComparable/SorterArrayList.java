package GrensesnittComparable;

import java.util.ArrayList;

class SorterArrayList<T extends Comparable<T>> {
    private ArrayList<T> liste = new ArrayList<>();

    public void settInn(T element){
        for (int i = 0; i < liste.size(); i++){
            if (liste.get(i).compareTo(element) > 0){
                liste.add(i, element);
                return;
            }
        }
        liste.add(element);
    }

    public T hentFoerste(){
        return liste.remove(0);
    }
}
