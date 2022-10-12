package Servicio;

//@author Facundo Cruz
public class SopaService {

    public int[] buscarPalabra(String matriz[][], String palabra) {
        if (palabra.length() != 5) {
            return null;
        }
        String palabraV[] = new String[5];
        rellenarVector(palabraV, palabra);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (validacion(i, j, matriz, palabraV)) {
                    int vector[] = {i, j};
                    return vector;
                }
            }
        }
        return null;
    }
    
    public void imprimirMatriz(String matriz[][], boolean aux) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (aux) {
                    System.out.print(matriz[i][j] + "   ");
                }else{
                    System.out.print(matriz[j][i] + "   ");
                }
            }
            System.out.println("");
        }
    }

    public void reemplazarDatos(String cambiar, String palabraUsuario, String matriz[][]){
        if (palabraUsuario.length()!=5) {
            System.out.println("La palabra ingresada no se encuentra en la sopa de letras");
        }else{
            if (buscarPalabra(matriz, cambiar) == null) {
                System.out.println("La palabra ingresada no se encuentra en la sopa de letras");
            }else{
                int posiciones[] = buscarPalabra(matriz, cambiar);
                String palabraV[] = new String[5];
                rellenarVector(palabraV, palabraUsuario);
                for (int j = posiciones[1]; j < posiciones[1]+5; j++) {
                    matriz[posiciones[0]][j] = String.valueOf(palabraUsuario.charAt(j-posiciones[1]));
                }
                System.out.println("Palabra reemplazada con éxito");
            }
        }
    }
    
    public void rellenarVector(String vector[], String palabra) {
        for (int i = 0; i < 5; i++) {
            vector[i] = String.valueOf(palabra.charAt(i));
        }
    }

    public boolean validacion(int i, int j, String matriz[][], String palabra[]) {
        if (j > 5) {
            return false;
        }
        for (int k = j; k < j+5; k++) {
             if (!matriz[i][k].equalsIgnoreCase(palabra[k-j])) {
                    return false;
                }
        }

        return true;
    }

}
