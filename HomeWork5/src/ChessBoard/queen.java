package ChessBoard;

import java.lang.Math;

public class queen 
{
    static final int chessboardSize = 8;
    static int[] queens = new int[chessboardSize];
    static int solutionCounter = 0;

    public void placeQueens() 
    {
        placeQueens(0);
    }
    private void placeQueens(int row) 
    {
        if (row == chessboardSize) 
        {
            printChessBoard();
            return;
        }
        for (int column = 0; column < chessboardSize; column++) 
        {
            queens[row] = column;
            if (checkQueenLocation(row, column))
                placeQueens(row + 1);
        }
    }
// Метод проверки наличия засечек между ферзями
    private boolean checkQueenLocation(int row, int column) 
    {
        for (int i = 0; i < row; i++) 
        {
            int different = Math.abs(column - queens[i]);
            if (different == 0 || different == row - i) 
                return false;
        }
        return true;
    }
// Метод вывода на экран всех вариаций расстановки ферзей на шахматной доске
    public static void printChessBoard() 
    {
        System.out.println();
        for (int row = 0; row < chessboardSize; row++) 
        {
            for (int column = 0; column < chessboardSize; column++) 
            {
                if (queens[row] == column)
                    System.out.print("Q ");
                else
                    System.out.print("~ ");
            }
            System.out.println();
        }
        solutionCounter++;
        System.out.println("Вариант расстановки ферзей №" + solutionCounter);
    }
}