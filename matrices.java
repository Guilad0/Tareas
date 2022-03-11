package matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class matrices {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int matriz [][], nfiles, ncolumns, plusfiles, pluscolumns;

        nfiles = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));

        ncolumns = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int[nfiles][ncolumns];

        System.out.println("Digite la matriz");
        for(int i=0; i<nfiles;i++){
            for(int j=0;j<ncolumns;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ");
        for(int i=0;i<nfiles;i++){

            for(int j=0;j<ncolumns;j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<nfiles;i++){
            plusfiles= 0;
            for(int j=0;j<ncolumns;j++){

                plusfiles+= matriz[i][j];
            }
            System.out.print("\nLa suma de la fila["+i+" es: "+plusfiles);
        }
        System.out.println("");
        for(int j=0;j<ncolumns;j++){
            pluscolumns= 0;
            for(int i=0;i<ncolumns;i++){
                pluscolumns+= matriz[i][j];
            }
            System.out.print("\nLa suma de la columna["+j+"] es: "+ pluscolumns);
        }
        System.out.println("");
    }
}