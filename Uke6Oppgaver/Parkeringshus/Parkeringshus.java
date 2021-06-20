package Parkeringshus;

class Parkeringshus <E> {
    
    static Parkeringsplass [] etasje1 = new Parkeringsplass [10];
    static Parkeringsplass [] etasje2 = new Parkeringsplass [10];

    public static void main(String [] args){
        Bil bilen1 = new Bil("1234 FD", 4);
        Bil bilen2 = new Bil("3030 RA", 2);
        Bil bilen3 = new Bil("1345 FD", 3);
        Motorsykkel motorsykkel1 = new Motorsykkel("1434 FR", 4000);
        Motorsykkel motorsykkel2 = new Motorsykkel("2340 OR", 20);
        Motorsykkel motorsykkel3 = new Motorsykkel("1203 FR", 430);

        etasje1[3] = new Parkeringsplass<Motorsykkel>();
        etasje1[7] = new Parkeringsplass<Bil>();
        etasje2[3] = new Parkeringsplass<Motorsykkel>();
        etasje2[6] = new Parkeringsplass<Bil>();
        etasje1[3].parkere(motorsykkel2);
        etasje1[7].parkere(bilen1);
        etasje2[3].parkere(motorsykkel1);
        etasje2[6].parkere(bilen3);

        for (int i = 0; i < 10; i++){
            if(etasje1[i] != null){
                etasje1[i].kjoerUt();
                etasje1[i] = null;
            }
            if(etasje2[i] != null){
                etasje2[i].kjoerUt();
                etasje2[i] = null;
            }
        }

    }
}