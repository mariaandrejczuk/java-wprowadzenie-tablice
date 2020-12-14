class MultidimensionalArray{
    public static void main(String args[]) {
        int [] [] array = new int [3] [3]; 
        
            //ustawienie wartości 1-go wiersza i 1-szej kolumny
            array [0] [0] = 1;
            array [0] [1] = array [1] [0] = 2;
            array [0] [2] = array [2] [0] = 3;
            
            //obliczenie 2-go wiersza:
            array[1] [1] = array [0] [1] * array [1] [0];  
            array[1] [2] = array [1] [0] * array [0] [2];  
            
            //obliczenie 3-go wiersza:           
            array[2] [1] = array [0] [1] * array [2] [0];  
            array[2] [2] = array [2] [0] * array [0] [2];  
            
            
            // wyświetl
            System.out.println("------");
            System.out.println(array [0] [0] +" "+array [0] [1]+" "+array [0] [2]);
            System.out.println(array [1] [0] +" "+array [1] [1]+" "+array [1] [2]);         
            System.out.println(array [2] [0] +" "+array [2] [1]+" "+array [2] [2]);   
            System.out.println("------");
            
            
            }
}