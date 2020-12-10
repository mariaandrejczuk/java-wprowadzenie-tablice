class Notes{
    public static void main(String args[]){
             
        char[] index;
        index = new char[6];
        index [0] = '2';
        index [1] = '3';
        index [2] = '4';
        index [3] = '1';
        index [4] = '2';
        index [5] = '1';
        System.out.print("----------"+"\n");
        System.out.print("Student: ");
        System.out.print(index [0]);
        System.out.print(index [1]);
        System.out.print(index [2]);
        System.out.print(index [3]);
        System.out.print(index [4]);
        System.out.println(index [5]);
                
        //ten sposób z prezentacji nie chce zadziałać:-(
        //double[] notes = {5, 1, 3.5, 1, 6, 4.5}; 
        
        /*
        // to słabo działa, bo do ocen całkowitych dodaje zerowe miejsce po przecinku)
        double[] notes = new double[6];
        notes [0] = 5; 
        notes [1] = 1;
        notes [2] = 3.5;
        notes [3] = 1;
        notes [4] = 6; 
        notes [5] = 4.5; 
          */      
        
        char[] notes = new char[6];
        notes [0] = '5'; 
        notes [1] = '1';
        notes [2] = '3';
        notes [3] = '1';
        notes [4] = '6'; 
        notes [5] = '4'; 
        
        System.out.print("Oceny z Informatyki: ");
        System.out.print(notes [0]+", ");
        System.out.print(notes [1]+", ");
        System.out.print(notes [2]+"."+notes[0]+", ");
        System.out.print(notes [3]+", ");
        System.out.print(notes [4]+", ");    
        System.out.println(notes [5]+"."+notes[0]);            
        System.out.print("----------"+"\n");
    }
}