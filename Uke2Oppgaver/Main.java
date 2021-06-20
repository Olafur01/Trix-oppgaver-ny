import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


class Main{

   public static void main(String [] args){
	
	try{
	Scanner sc = new Scanner(new File("Untitled.txt"));
	while(sc.hasNextLine()){
		System.out.println(sc.nextLine());
	}
	}
	catch(FileNotFoundException e){
		System.out.println(e.getMessage());
	}	

}
}