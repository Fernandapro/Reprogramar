import java.util.Scanner;
import javax.swing.JOptionPane;





/*Adopcion De Convencion De Estilo De Programacion*/
public class Burbuja1 {
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);   
    int matrizArbol [], resultadoFinal, aux, pos;
    resultadoFinal = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Digitos Introducira? "));
    
    matrizArbol = new int[resultadoFinal];
    
    for (int i=0; i< resultadoFinal; i++){
        
        System.out.println((i+1) + "----------Introduzca Un Numero ---------");
        matrizArbol[i] = entrada.nextInt();
    }
    
     /*metodo burbuja*/
    for(int i=0; i< (resultadoFinal-1);i++){
        for(int j=0;j<(resultadoFinal-1);j++){
            if(matrizArbol[j]> matrizArbol[j+1]){
                aux = matrizArbol[j];
                matrizArbol[j] = matrizArbol[j+1];
                matrizArbol[j+1] = aux;
            }
        }
    }  
    for(int i=0;i < resultadoFinal;i++){
        System.out.println(matrizArbol[i]+" - ");      
    }     
    
    /*ordenamiento quicksort*/
    for(int i=0;i<resultadoFinal;i++){
        pos = i;
        aux = matrizArbol[i];
        
        while((pos>0) && (matrizArbol[pos-1] > aux)) {
            matrizArbol[pos] = matrizArbol[pos-1];
            pos--;
        }
        matrizArbol[pos] = aux;
    }
    System.out.println("Orden Ascendente: ");
    for(int i=0;i<resultadoFinal;i++){
        System.out.print(matrizArbol[i]+"_***_");
    }
        }  
}

    

   