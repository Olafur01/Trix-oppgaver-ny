package Grensesnitt;

public class Main {

    public static void main(String[] args){
        Rovdyr [] rovdyr = new Rovdyr[3];
        Bjoern jens = new Bjoern();
        Bjoern mats = new Bjoern();
        Ulv jacob = new Ulv();
        rovdyr[0] = jens;
        rovdyr[1] = mats;
        rovdyr[2] = jacob;
        for (Rovdyr i: rovdyr){
            i.jakte();
        }
    }
    
}
