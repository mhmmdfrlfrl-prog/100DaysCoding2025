
public class Day77 {
    
    public static void main(String[] args) {
        
        String kata = " Bissmillah Lulus ";
        System.out.println("KATA AWAL :"+kata);
        
        String katatrim = kata.trim();
        System.out.println("\nSetelah trim :"+katatrim);
        
        String katareplace = kata.replace("Lulus","Bisa");
        System.out.println("\nSetelah replace :"+katareplace);
        
        String katasubstring = kata.substring(12,16);
        System.out.println("Setelah substring :"+katasubstring);
    }
    
}
