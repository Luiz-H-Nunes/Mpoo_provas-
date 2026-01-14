package mpooSaveAnimalsSystem.animals;

public class Teste {
    public static void main(String[] args) {
        String a = "ANIM004";
        int i = 4 ;
        int ani = Integer.parseInt(a.split("M")[1]);
        System.out.println(ani);
        if (ani == i){
            System.out.println("OK");
        }
    }
}
