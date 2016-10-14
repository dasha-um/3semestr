import java.io.*;
public class Main {
        public static void main(String[] args) {
            int[][] mA =
                    {{31,34,12},
                            {33,19,1},
                            {12,14,17},
                            };

            int[][] mB =
                    {{10,11,34},
                            {33,45,17},
                            {45,63,12}};


            int m = mA.length;
            int o = mB.length;
            int [][] sum = new int [m][m];
            int[][] umn = new int[m][m];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < o; k++) {
                        umn[i][j] += mA[i][k] * mB[k][j];
                    }
                }
            }
            for (int i=0 ; i<m;i++){
                for (int j=0; j<m ; j++){
                    sum[i][j]=mA[i][j]+mB[i][j];
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.format("%6d ", umn[i][j]);
                }
                System.out.println();
            }
            for (int i=0; i<m;i++){
                for (int j=0; j<m; j++){
                    System.out.format("%6d ",sum[i][j]);
                }
                System.out.println();
            }
        }
    }
