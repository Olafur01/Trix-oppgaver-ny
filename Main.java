public class Main {
    public static void main(String[] args)throws Exception{
        StudentSystem nyttSystem = new StudentSystem();
        nyttSystem.lesFraFil("emneoppgaver.txt");
        nyttSystem.ordrelokke();
    }
}
