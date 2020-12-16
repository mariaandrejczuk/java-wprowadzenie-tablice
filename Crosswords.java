/*
StwÃ³rz krzyÅ¼Ã³wkÄ™. ktÃ³re hasÅ‚ami bÄ™dÄ…: wilk, kot, Å¼yrafa (typy proste). 
'----
wilk
kot
Å¼yrafa
'----
1) wyÅ›wietl trzeciÄ… literÄ™ drugiego hasÅ‚a, 
2) wyÅ›wietl pierwszÄ… literÄ™ pierwszego hasÅ‚a, 
3) zamieÅ„ ostatniÄ… literÄ™ trzeciego hasÅ‚a na 'y', 
4) wyÅ›wietl dÅ‚ugoÅ›Ä‡ drugiego hasÅ‚a krzyÅ¼Ã³wki, 
5) wyÅ›wietl caÅ‚Ä… krzyÅ¼Ã³wkÄ™.  */

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
        
        //wyÅ›wietl trzeciÄ… literÄ™ drugiego hasÅ‚a:
        /*
        System.out.println();
        System.out.print("Trzecia litera drugiego hasÅ‚a: ");
        System.out.println(crossw [1][2]);
        System.out.println();
        */
        System.out.println("------");
        char trzeciaDrugiego = crossw[1][2];
        System.out.println("Trzecia litera drugiego has³a: "+trzeciaDrugiego); 
        
        //wyÅ›wietl pierwszÄ… literÄ™ pierwszego hasÅ‚a:
        /*
        System.out.print("Pierwsza litera pierwszego hasÅ‚a: ");
        System.out.println(crossw [0][0]);
        System.out.println();
        */
        char pierwszaPierwszego = crossw[0][0];
        System.out.println("Pierwsza litera pierwszego has³a: "+pierwszaPierwszego); 
        
        
        //zamieñ ostatnia literê trzeciego has³a na 'y':
        crossw [2] [5] = 'y';
        
        //wyœwietl d³ugoœc drugiego has³a krzy¿ówki:
        int dlugoscDrugiego = crossw[1].length; 
        System.out.println("D³ugoœæ drugiego has³a krzy¿ówki: "+dlugoscDrugiego); 
        
        //wyœwietl ca³¹ krzy¿ówkê:
         System.out.println("------");
         System.out.println(crossw [0][0]+" "+crossw [0][1]+" "+crossw [0][2]+" "+crossw [0][3]);
         System.out.println(crossw [1][0]+" "+crossw [1][1]+" "+crossw [1] [2]);
         System.out.println(crossw [2][0]+" "+crossw [2][1]+" "+crossw [2][2]+" "+crossw [2][3]+" "+crossw [2][4]+" "+crossw [2][5]);
         System.out.println("------");   
    }
}