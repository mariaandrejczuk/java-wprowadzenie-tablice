

  class Crosswords{
        public static void main (String args[]) {
        char [] [] crossw = new char [3] []; 
           
         crossw [0] = new char [4]; 
         crossw [1] = new char [3]; 
         crossw [2] = new char [6];  
           
        crossw [0] [0] = 'w';
        crossw [0] [1] = 'i';
        crossw [0] [2] = 'l';
        crossw [0] [3] = 'k';
        
        crossw [1] [0] = 'k';
        crossw [1] [1] = 'o';
        crossw [1] [2] = 't';
        
        crossw [2] [0] = 380;
        crossw [2] [1] = 'y';
        crossw [2] [2] = 'r';
        crossw [2] [3] = 'a';
        crossw [2] [4] = 'f';
        crossw [2] [5] = 'a';
        
        //wy�wietl trzeci� liter� trzeciego has�a:
        /*
        System.out.println();
        System.out.print("Trzecia litera drugiego has�a: ");
        System.out.println(crossw [1][2]);
        System.out.println();
        */
        System.out.println("------");
        char trzeciaDrugiego = crossw[1][2];
        System.out.println("Trzecia litera drugiego has�a: "+trzeciaDrugiego); 
        
        //wy�wietl pierwsz� liter� pierwszego has�a:
        /*
        System.out.print("Pierwsza litera pierwszego has�a: ");
        System.out.println(crossw [0][0]);
        System.out.println();
        */
        char pierwszaPierwszego = crossw[0][0];
        System.out.println("Pierwsza litera pierwszego has�a: "+pierwszaPierwszego); 
        
        
        //zamie� ostatnia liter� trzeciego has�a na 'y':
        crossw [2] [5] = 'y';
        
        //wy�wietl d�ugo�c drugiego has�a krzy��wki:
        int dlugoscDrugiego = crossw[1].length; 
        System.out.println("D�ugo�� drugiego has�a krzy��wki: "+dlugoscDrugiego); 
        
        //wy�wietl ca�� krzy��wk�:
         System.out.println("------");
         System.out.println(crossw [0][0]+" "+crossw [0][1]+" "+crossw [0][2]+" "+crossw [0][3]);
         System.out.println(crossw [1][0]+" "+crossw [1][1]+" "+crossw [1] [2]);
         System.out.println(crossw [2][0]+" "+crossw [2][1]+" "+crossw [2][2]+" "+crossw [2][3]+" "+crossw [2][4]+" "+crossw [2][5]);
         System.out.println("------");   
    }
}