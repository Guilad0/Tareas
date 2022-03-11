
public class Eencriptacion {
    public static void main(String[] args) {
        String message = "mensaje encriptado";
        char array[] = message.toCharArray();
        for (int i = 0; i < array.length;i++) {
            array[i] = (char) (array[i] + (char) 5);
        }
        String encrypt = String.valueOf(array);
        System.out.println("el mensaje encriptado es: "+encrypt);
        char arrayA[] = encrypt.toCharArray();
        for(int i = 0; i< arrayA.length; i++)
        {
            arrayA[i] = (char)(arrayA[i]-(char)5);
        }
        String undescrypt = String.valueOf(arrayA);
        System.out.println("el mensaje desencriptado es: "+undescrypt);
    }
}
