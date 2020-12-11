class Oceny{
    public static void main(String args[]) {
        byte[] grades = new byte[5];
        
        //dodaj pięć ocen o wartościach od 1 do 3
        grades[0] = 3; 
        grades[1] = 1; 
        grades[2] = 2; 
        grades[3] = 3; 
        grades[4] = 1; 
        
        //wyświetl trzy ostatnie oceny
        System.out.print(" "+"\n");
        System.out.println("Trzy ostatnie oceny: ");
        System.out.print(grades[2]+", ");
        System.out.print(grades[3]+", " );
        System.out.println(grades[4]);
        System.out.print(" "+"\n");
        
        //popraw druga ocenę na 5
        byte temp5 = 5;
                
        System.out.println("Druga ocena poprawiona na 5: ");
        System.out.print(grades[2]+", ");
        System.out.print(temp5+", " );
        System.out.println(grades[4]);
        System.out.print(" "+"\n");
               
        byte tmp0 = grades[1];
        byte tmp1 = grades[4]; 
        byte tmp2 = grades[2]; 
        byte tmp3 = grades[0];
        byte tmp4 = grades[3];   
               
        System.out.println("Oceny od najmniejszej do największej: ");
        System.out.print(tmp0+", ");
        System.out.print(tmp1+", ");  
        System.out.print(tmp2+", ");
        System.out.print(tmp3+", ");
        System.out.println(tmp4);
        System.out.print(" "+"\n");
       
        
        
        
    }
}