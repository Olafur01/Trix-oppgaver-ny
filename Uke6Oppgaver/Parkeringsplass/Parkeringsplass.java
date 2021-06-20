package Parkeringsplass;

class Parkeringsplass<E> {
    private E element;

    public void parkere(E element){
        this.element = element;
    }

    public void skrivInfo(){
        System.out.println(element.toString());
    }

    public E kjoerUt(){
        E temp = this.element;
        this.element = null;
        return temp;
    }
}
