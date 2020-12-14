/*
Stwórz krzyżówkę. które hasłami będą: wilk, kot, żyrafa (typy proste). 
'----
wilk
kot
żyrafa
'----
1) wyświetl trzecią literę drugiego hasła, 
2) wyświetl pierwszą literę pierwszego hasła, 
3) zamień ostatnią literę trzeciego hasła na 'y', 
4) wyświetl długość drugiego hasła krzyżówki, 
5) wyświetl całą krzyżówkę.  */

class Crosswords{
        public static void main (String args []) {
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
        
        //wyświetl trzecią literę drugiego hasła:
        /*
        System.out.println();
        System.out.print("Trzecia litera drugiego hasła: ");
        System.out.println(crossw [1][2]);
        System.out.println();
        */
        System.out.println("------");
        char trzeciaDrugiego = crossw[1][2];
        System.out.println("Trzecia litera drugiego hasła: "+trzeciaDrugiego); 
        
        //wyświetl pierwszą literę pierwszego hasła:
        /*
        System.out.print("Pierwsza litera pierwszego hasła: ");
        System.out.println(crossw [0][0]);
        System.out.println();
        */
        char pierwszaPierwszego = crossw[0][0];
        System.out.println("Pierwsza litera pierwszego hasła: "+pierwszaPierwszego); 
        
        
        //zamień ostatnią literę trzeciego hasła na 'y':
        crossw [1] [2] = 'y';
        
        //wyświetl długość drugiego hasła krzyżówki:
        int dlugoscDrugiego = crossw[1].length; 
        System.out.println("Długość drugiego hasła krzyżówki: "+dlugoscDrugiego); 
        
        //wyświetl całą krzyżówkę:
         System.out.println("------");
         System.out.println(crossw [0][0]+" "+crossw [0][1]+" "+crossw [0][2]+" "+crossw [0][3]);
         System.out.println(crossw [1][0]+" "+crossw [1][1]+" "+crossw [1] [2]);
         System.out.println(crossw [2][0]+" "+crossw [2][1]+" "+crossw [2][2]+" "+crossw [2][3]+" "+crossw [2][4]+" "+crossw [2][5]);
         System.out.println("------");   
    }
}