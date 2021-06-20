import java.util.*;
import java.io.*;


public class ParallellMerge {
   
    
    public static void main(String []args){
        int antallTraader = Integer.parseInt(args[0]);
        String innFil = args[1];
        String utFil = args[2];

        try{
            Scanner sc = new Scanner(new File(innFil));

            int antallOrd = sc.nextInt();
            
            
        }
        catch (FileNotFoundException e){
            System.out.println("Filen " + innFil + " finnes ikke");
        }

        
    


    }
}
