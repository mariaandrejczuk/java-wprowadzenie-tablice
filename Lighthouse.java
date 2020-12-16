class Lighthouse{
    public static void main(String args[]) {
           int[][] tab = new int [10][10];
           
           //latarnia       -  liczba, która określa, ile statków powinno być w zasięgu
           //puste pole  -   -1
           //statek         -   -2
           
           //wprowadzenie danych:
           //1 wiersz
           tab[0][0] = 1; 
           tab[0][1] = -1;
           tab[0][2] = -1;
           tab[0][3] = -1;
           tab[0][4] = -1;
           tab[0][5] = -1;
           tab[0][6] = -1;
           tab[0][7] = -2;
           tab[0][8] = -1;
           tab[0][9] = 2;
           //2 wiersz
           tab[1][0] = -1; 
           tab[1][1] = -1;
           tab[1][2] = -1;
           tab[1][3] = -1;
           tab[1][4] = -1;
           tab[1][5] = -2;
           tab[1][6] = -1;
           tab[1][7] = -1;
           tab[1][8] = -1;
           tab[1][9] = -1;
           //3 wiersz
           tab[2][0] = -1; 
           tab[2][1] = -2;
           tab[2][2] = -1;
           tab[2][3] = -1;
           tab[2][4] = -1;
           tab[2][5] = -1;
           tab[2][6] = -1;
           tab[2][7] = 4;
           tab[2][8] = -1;
           tab[2][9] = -2;
           //4 wiersz
           tab[3][0] = -1; 
           tab[3][1] = -1;
           tab[3][2] = -1;
           tab[3][3] = -1;
           tab[3][4] = -1;
           tab[3][5] = 2;
           tab[3][6] = -1;
           tab[3][7] = -1;
           tab[3][8] = -1;
           tab[3][9] = -1;
           //5 wiersz
           tab[4][0] = -1; 
           tab[4][1] = -1;
           tab[4][2] = -1;
           tab[4][3] = 0;
           tab[4][4] = -1;
           tab[4][5] = -1;
           tab[4][6] = -1;
           tab[4][7] = -1;
           tab[4][8] = -1;
           tab[4][9] = -1;
           //6 wiersz
           tab[5][0] = -1; 
           tab[5][1] = -2;
           tab[5][2] = -1;
           tab[5][3] = -1;
           tab[5][4] = -1;
           tab[5][5] = -1;
           tab[5][6] = 2;
           tab[5][7] = -1;
           tab[5][8] = -2;
           tab[5][9] = -1;
           //7 wiersz
           tab[6][0] = -1; 
           tab[6][1] = -1;
           tab[6][2] = -1;
           tab[6][3] = -1;
           tab[6][4] = 0;
           tab[6][5] = -1;
           tab[6][6] = -1;
           tab[6][7] = -1;
           tab[6][8] = -1;
           tab[6][9] = -1;
           //8 wiersz
           tab[7][0] = -1; 
           tab[7][1] = -1;
           tab[7][2] = 0;
           tab[7][3] = -1;
           tab[7][4] = -1;
           tab[7][5] = -1;
           tab[7][6] = -1;
           tab[7][7] = -1;
           tab[7][8] = -1;
           tab[7][9] = -1;
           //9 wiersz
           tab[8][0] = -1; 
           tab[8][1] = -1;
           tab[8][2] = -1;
           tab[8][3] = -1;
           tab[8][4] = -1;
           tab[8][5] = -1;
           tab[8][6] = -1;
           tab[8][7] = -1;
           tab[8][8] = -1;
           tab[8][9] = -1;
           //10 wiersz
           tab[9][0] = 2; 
           tab[9][1] = -1;
           tab[9][2] = -1;
           tab[9][3] = -1;
           tab[9][4] = -1;
           tab[9][5] = -2;
           tab[9][6] = -1;
           tab[9][7] = -2;
           tab[9][8] = -1;
           tab[9][9] = 3;
           
           //wyświetlenie:
           //sprawdzamy warunki:
           //  jeżeli jest -1 to wyświetl " "; 
           //  jeżeli jest -2 to wyświetl "X"; 
           //  w przeciwnym wypadku wyświetl to, co masz przypisane; 
           System.out.println("Wyświetl tablicę w I wersji: ");
           System.out.println(tab [0] [0]+" "+tab [0] [1]+" "+tab [0] [2]+" "+tab [0] [3]+" "+tab [0] [4]+" "+tab [0] [5]+" "+tab [0] [6]+" "+tab [0] [7]+" "+tab [0] [8]+" "+tab [0] [9]); 
           System.out.println(tab [1] [0]+" "+tab [1] [1]+" "+tab [1] [2]+" "+tab [1] [3]+" "+tab [1] [4]+" "+tab [1] [5]+" "+tab [1] [6]+" "+tab [1] [7]+" "+tab [1] [8]+" "+tab [1] [9]); 
           System.out.println(tab [2] [0]+" "+tab [2] [1]+" "+tab [2] [2]+" "+tab [2] [3]+" "+tab [2] [4]+" "+tab [2] [5]+" "+tab [2] [6]+" "+tab [2] [7]+" "+tab [2] [8]+" "+tab [2] [9]); 
           System.out.println(tab [3] [0]+" "+tab [3] [1]+" "+tab [3] [2]+" "+tab [3] [3]+" "+tab [3] [4]+" "+tab [3] [5]+" "+tab [3] [6]+" "+tab [3] [7]+" "+tab [3] [8]+" "+tab [3] [9]); 
           System.out.println(tab [4] [0]+" "+tab [4] [1]+" "+tab [4] [2]+" "+tab [4] [3]+" "+tab [4] [4]+" "+tab [4] [5]+" "+tab [4] [6]+" "+tab [4] [7]+" "+tab [4] [8]+" "+tab [4] [9]); 
           System.out.println(tab [5] [0]+" "+tab [5] [1]+" "+tab [5] [2]+" "+tab [5] [3]+" "+tab [5] [4]+" "+tab [5] [5]+" "+tab [5] [6]+" "+tab [5] [7]+" "+tab [5] [8]+" "+tab [5] [9]); 
           System.out.println(tab [6] [0]+" "+tab [6] [1]+" "+tab [6] [2]+" "+tab [6] [3]+" "+tab [6] [4]+" "+tab [6] [5]+" "+tab [6] [6]+" "+tab [6] [7]+" "+tab [6] [8]+" "+tab [6] [9]); 
           System.out.println(tab [7] [0]+" "+tab [7] [1]+" "+tab [7] [2]+" "+tab [7] [3]+" "+tab [7] [4]+" "+tab [7] [5]+" "+tab [7] [6]+" "+tab [7] [7]+" "+tab [7] [8]+" "+tab [7] [9]); 
           System.out.println(tab [8] [0]+" "+tab [8] [1]+" "+tab [8] [2]+" "+tab [8] [3]+" "+tab [8] [4]+" "+tab [8] [5]+" "+tab [8] [6]+" "+tab [8] [7]+" "+tab [8] [8]+" "+tab [8] [9]); 
           System.out.println(tab [9] [0]+" "+tab [9] [1]+" "+tab [9] [2]+" "+tab [9] [3]+" "+tab [9] [4]+" "+tab [9] [5]+" "+tab [9] [6]+" "+tab [9] [7]+" "+tab [9] [8]+" "+tab [9] [9]); 
           System.out.println();
           
           //wersja z typem char
           char[][] tab2 = new char[10][10];
           
           // -2= 'O'
           // 0,1, 2, itd = 'X'
           tab2[0][0] = 'O';    
           tab2[0][7] = 'X';
           tab2[0][9] = 'O';
           //2 wiersz
           tab2[1][5] = 'O';
           //3 wiersz
           tab2[2][1] = 'O';
           tab2[2][7] = 'X';
           tab2[2][9] = 'O';
           //4 wiersz
           tab2[3][5] = 'X';
           //5 wiersz
           tab2[4][3] = 'X';
           //6 wiersz
           tab2[5][1] = 'O';
           tab2[5][6] = 'X';
           tab2[5][8] = 'O';
           //7 wiersz
           tab2[6][4] = 'X';
           //8 wiersz
           tab2[7][2] = 'X';
           //9 wiersz
           //10 wiersz
           tab2[9][0] = 'X'; 
           tab2[9][5] = 'O';
           tab2[9][7] = 'O';
           tab2[9][9] = 'X';
        
           System.out.println("Wyświetl tablicę w II wersji: ");
           System.out.println(tab2 [0] [0]+" "+tab2 [0] [1]+" "+tab2 [0] [2]+" "+tab2 [0] [3]+" "+tab2 [0] [4]+" "+tab2 [0] [5]+" "+tab2 [0] [6]+" "+tab2 [0] [7]+" "+tab2 [0] [8]+" "+tab2 [0] [9]); 
           System.out.println(tab2 [1] [0]+" "+tab2 [1] [1]+" "+tab2 [1] [2]+" "+tab2 [1] [3]+" "+tab2 [1] [4]+" "+tab2 [1] [5]+" "+tab2 [1] [6]+" "+tab2 [1] [7]+" "+tab2 [1] [8]+" "+tab2 [1] [9]); 
           System.out.println(tab2 [2] [0]+" "+tab2 [2] [1]+" "+tab2 [2] [2]+" "+tab2 [2] [3]+" "+tab2 [2] [4]+" "+tab2 [2] [5]+" "+tab2 [2] [6]+" "+tab2 [2] [7]+" "+tab2 [2] [8]+" "+tab2 [2] [9]); 
           System.out.println(tab2 [3] [0]+" "+tab2 [3] [1]+" "+tab2 [3] [2]+" "+tab2 [3] [3]+" "+tab2 [3] [4]+" "+tab2 [3] [5]+" "+tab2 [3] [6]+" "+tab2 [3] [7]+" "+tab2 [3] [8]+" "+tab2 [3] [9]); 
           System.out.println(tab2 [4] [0]+" "+tab2 [4] [1]+" "+tab2 [4] [2]+" "+tab2 [4] [3]+" "+tab2 [4] [4]+" "+tab2 [4] [5]+" "+tab2 [4] [6]+" "+tab2 [4] [7]+" "+tab2 [4] [8]+" "+tab2 [4] [9]); 
           System.out.println(tab2 [5] [0]+" "+tab2 [5] [1]+" "+tab2 [5] [2]+" "+tab2 [5] [3]+" "+tab2 [5] [4]+" "+tab2 [5] [5]+" "+tab2 [5] [6]+" "+tab2 [5] [7]+" "+tab2 [5] [8]+" "+tab2 [5] [9]); 
           System.out.println(tab2 [6] [0]+" "+tab2 [6] [1]+" "+tab2 [6] [2]+" "+tab2 [6] [3]+" "+tab2 [6] [4]+" "+tab2 [6] [5]+" "+tab2 [6] [6]+" "+tab2 [6] [7]+" "+tab2 [6] [8]+" "+tab2 [6] [9]); 
           System.out.println(tab2 [7] [0]+" "+tab2 [7] [1]+" "+tab2 [7] [2]+" "+tab2 [7] [3]+" "+tab2 [7] [4]+" "+tab2 [7] [5]+" "+tab2 [7] [6]+" "+tab2 [7] [7]+" "+tab2 [7] [8]+" "+tab2 [7] [9]); 
           System.out.println(tab2 [8] [0]+" "+tab2 [8] [1]+" "+tab2 [8] [2]+" "+tab2 [8] [3]+" "+tab2 [8] [4]+" "+tab2 [8] [5]+" "+tab2 [8] [6]+" "+tab2 [8] [7]+" "+tab2 [8] [8]+" "+tab2 [8] [9]); 
           System.out.println(tab2 [9] [0]+" "+tab2 [9] [1]+" "+tab2 [9] [2]+" "+tab2 [9] [3]+" "+tab2 [9] [4]+" "+tab2 [9] [5]+" "+tab2 [9] [6]+" "+tab2 [9] [7]+" "+tab2 [9] [8]+" "+tab2 [9] [9]); 
}   
        
}