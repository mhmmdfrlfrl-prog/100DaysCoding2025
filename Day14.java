public static void main(String[] args) {
                String umur  = "25";
        String berat = "60.2";
        String tinggi = "175";
        
        String aktif = "true";
        String nilai = "100";
        String maba = "3000";
        String penduduk = "268201608";
        
        int umur1 = Integer.parseInt(umur);
        double berat1 = Double.parseDouble(berat);
        float tinggi1 = Float.parseFloat(tinggi);
        boolean aktif1 = Boolean.parseBoolean(aktif);
        byte nilai1 = Byte.parseByte(nilai);
        short maba1 = Short.parseShort(maba);
        long penduduk1 = Long.parseLong(penduduk);
        
        System.out.println("Umur :" + umur1);
        System.out.println("Berat :" + berat1 + "kg");
        System.out.println("Tinggi :" + tinggi1 + "cm");
        System.out.println("Aktif :" + aktif1);
        System.out.println("Nilai :" + nilai1);
        System.out.println("Maba :" + maba1);
        System.out.println("Penduduk Indonesia :" + penduduk1);

    }
    
}
