class PostalCode {
    public static void main (String args[]) {
        
        //czy można zastosować dwucyfrową liczbę na jedno miejsce?
        //czy ilość zadeklarowanych zmiennych musi być taka sama jak rozmiar tabeli? 
        //jaki jest sposób na uzyskanie wielu kodów pocztowych będących kombinacją 10 różnych cyfr?
        
        byte[] postal = new byte[5]; 
        
        postal [0] = 72;
        postal [1] = 6;
        postal [2] = 0;
        postal [3] = 3;
        postal [4] = 5; 
        
        System.out.print (postal[0]);
        System.out.print (postal[1]);
        System.out.print (postal[2]);
        System.out.println (postal[3]);
      
  

        //czy można zastosować typ int? 
        //czy można do jednego miejsca przypisać liczbę wielocyfrową?
        //dlaczego new int[4] - liczba 4 jest wystarczająca, a 2 i 3 juz nie?  
        //w takim kształcie kod pocztowy wyświatlany jest tak jak tego oczekiwałam, ale mam wąptliwość, czy kod napisany zostal poprawnie. 
        /*
        int[] postal = new int[4];    
        postal [0] = 7260;
        postal [1] = 0;
        postal [2] = 3;
        postal [3] = 5; 
         
        System.out.print (postal[0]);
        System.out.println (postal[2]);
        */
        
 
    }
}