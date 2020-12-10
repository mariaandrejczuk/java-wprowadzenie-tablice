class PostalCode {
    public static void main (String args[]) {
        
        //czy ilość zadeklarowanych zmiennych musi być taka sama jak rozmiar tabeli? 
        //jaki jest sposób na uzyskanie wielu kodów pocztowych 5-cyfrowych (czyli new int[5]), będących kombinacją 10 różnych cyfr (czyli 10 róznych deklaracji od [0] do [9])?
        
        int[] postal = new int[5]; 
        
        postal [0] = 726;
        postal [1] = 0;
        postal [2] = 2;
        postal [3] = 3;
        postal [4] = 5; 
        
        System.out.println ("------");
        System.out.print (postal[0]);
        System.out.print (postal[1]);
        System.out.println (postal[3]);
        
        System.out.print (postal[0]);
        System.out.print (postal[1]);
        System.out.println (postal[1]);
        
        System.out.print (postal[0]);
        System.out.print (postal[1]);
        System.out.println (postal[2]);
        System.out.print ("------"); 
    }
}