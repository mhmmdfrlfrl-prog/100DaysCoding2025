public class Day21 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        System.out.println("Nilai awal a="+ a +"\nNilai awal b="+b);
        
        a = a+b ;
        b = a-b ;
        a = a-b ;
        
        System.out.println("Nilai setelah ditukar" +"\nNilai a="+a +"\nNilai b="+b);
        
    }
    
}
