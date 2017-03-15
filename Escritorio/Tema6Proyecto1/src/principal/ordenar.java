package principal;

public class ordenar {
 public static void ordenado(int lista[]){
	 for (int i = 0; i < lista.length-1; i++) {
		for (int j =i+1; j < lista.length; j++) {
			if(lista[i]>lista[j]){
				int Aux=lista[i];
				lista[i]=lista[j];
				lista[j]=Aux;
			}
		}
	}
	 
 }
 public void mostar(int lista[]){
	for (int i = 0; i < lista.length; i++) {
		System.out.print(lista[i] + " ");
	}
	 
 }
}
