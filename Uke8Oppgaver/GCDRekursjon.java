class GCDRekursjon {

    public static int rekursjon(int a, int b){
        // Base Case
        if (a == b){
            return a;
        }

        // Rekursjons case
        if (a > b){
            int c = a % b;
            if (c == 0){
                return b;
            }
            else{
                return rekursjon(b, c);
            }
        }
        else{
            int c = b % a;
            if (c == 0){
                return a;
            }
            else{
            return rekursjon(a, c);
            }
        }
    }

    public static int gcdIterativ(int a, int b){
        if (a == b){
            return a;
        }
        if (a > b){
            int c = a % b;
            while (c != 0){
                a = b;
                b = c;
                c = a % b;
            }
            return b;
        }
        else {
            int c = b % a;
            while (c != 0){
                b = a;
                a = c;
                c = b % a;
            }
            return a;
        }
    }

    public static void main(String [] args){
        System.out.println(rekursjon(30, 12));
        System.out.println(gcdIterativ(30, 12));
    }
}