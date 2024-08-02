package source;

public class InsertSort implements IClassificacao {

	@Override
	public void sort(int[] dados) {
		int n = dados.length;
        for (int i = 1; i < n; ++i) {
            int key = dados[i];
            int j = i - 1;

            while (j >= 0 && dados[j] > key) {
                dados[j + 1] = dados[j];
                j = j - 1;
            }
            dados[j + 1] = key;
        }

	}

}
