package Parkeringshus;

class Parkeringsplass<E> {
    private E element;

    public void parkere(E element){
        this.element = element;
    }

    public void skrivInfo(){
        System.out.print(element.toString());
    }

    public E kjoerUt(){
        skrivInfo();
        System.out.println();
        System.out.println("Kjoerer naa ut");
        E temp = this.element;
        this.element = null;
        return temp;
    }
}
