package source;

public class MergeSort implements IClassificacao {

	@Override
	public void sort(int[] dados) {
		if (dados == null || dados.length == 0) {
            return;
        }
        mergeSort(dados, 0, dados.length - 1);
	}

    private void mergeSort(int[] dados, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            // Ordena a primeira e a segunda metade
            mergeSort(dados, left, mid);
            mergeSort(dados, mid + 1, right);
            
            // Junta as duas metades
            merge(dados, left, mid, right);
        }
    }

    // Método para juntar duas metades ordenadas
    private void merge(int[] dados, int left, int mid, int right) {
        // Encontrar os tamanhos dos dois subarrays para serem juntados
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Arrays temporários
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copia os dados para os arrays temporários
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = dados[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = dados[mid + 1 + j];
        }
        
        // Junta os arrays temporários
        
        // Índices iniciais dos primeiros e segundo subarrays
        int i = 0, j = 0;
        
        // Índice inicial do array mesclado
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                dados[k] = leftArray[i];
                i++;
            } else {
                dados[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copia os elementos restantes de leftArray se houver algum
        while (i < n1) {
            dados[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copia os elementos restantes de rightArray se houver algum
        while (j < n2) {
            dados[k] = rightArray[j];
            j++;
            k++;
        }
    }
	
}
