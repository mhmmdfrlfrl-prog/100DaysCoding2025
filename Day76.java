public class Day76 {
    
    public static void main(String[] args) {
        
        
        String kata1 = "Teknik Informatika";
        String kata2 = "Teknik informatika";
        System.out.println(kata1.equals(kata2));
        System.out.println(kata1.equalsIgnoreCase(kata2));
        System.out.println(kata1.contains("Informatika"));
        System.out.println(kata1.isEmpty());
    }
    
}
