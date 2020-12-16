class Oceny2{
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
        grades[1] = 5;
        System.out.println("Oceny po poprawce drugiej na 5: "+grades[0]+", "+grades[1]+", "+grades[2]+", "+grades[3]+", "+grades[4]);        
        System.out.print(" ");
        
        // posortuj od najmniejszej do największej: 
        byte temp;
        temp = grades[0]; 
        grades[0] = grades [4];
        grades [4] = temp; 
        grades[1] = 1; 
        grades[2] = 2; 
        grades[3] = 3; 
                      
        System.out.println("Oceny od najmniejszej do największej: "+grades[0]+", "+grades[1]+", "+grades[2]+", "+grades[3]+", "+grades[4]);
        System.out.print(" ");
       //" "+"\n"
        
        
        
    }
}