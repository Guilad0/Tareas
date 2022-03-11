public class magicBox {

    public static void main(String[] args){

        int n = 5;
        int a_ant = 0;
        int b_ant = 0;
        int first_point = n/2;
        int[][] matriz_magica = new int [n][n];
        int temp = 1;

        for(int a = 0; a<n;a++){
            for(int b=0; b<n;b++){
             matriz_magica[a][b]=0;
            }
        }
        int a = 0;
        int b = first_point;

        while (temp !=  (n*n)+1){
            if(matriz_magica[a][b] == 0){
                matriz_magica[a][b] = temp;
            }
            else {
                a = a_ant + 1;
                b= b_ant;
                matriz_magica[a][b] = temp;
            }

            a_ant = a;
            b_ant = b;
            temp++;
            b++;
            a--;
            if(a<0 && b==n){
                a = n-1;
                b = 0;
            }
            else if(a<0){
                a=a+n;
            }
            else if(b==n) {
                b = 0;

            }
        }


        for(int x=0;x<n;x++){
            String answer = "";
            for (int y=0; y<n;y++){
                answer = answer +  "" + matriz_magica[x][y];
            }

            System.out.println(""+answer);

        }

    }
}

