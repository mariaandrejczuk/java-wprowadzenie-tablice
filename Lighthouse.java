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
           tab[0][9] = -1;
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
    }   
        
}