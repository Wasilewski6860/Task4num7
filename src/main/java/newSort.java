import java.util.Comparator;

public class newSort {
    public static <T> T[] selectionSort(T[] data, boolean[] fixed, Comparator<T> c){

        for (int i = 0; i < data.length; i++) {

            if (fixed[i]) {

                T min = data[i];
                int min_i = i;

                for (int j = i + 1; j < data.length; j++) {

                    if (c.compare(data[j], min) < 0 && fixed[j]) {
                        min = data[j];
                        min_i = j;
                    }
                }

                if (i != min_i) {
                    T tmp = data[i];
                    data[i] = data[min_i];
                    data[min_i] = tmp;
                }
            }

        }
        return data;
    }

    public static <T extends Comparable<T>> T[] sort(T[] data,boolean[] fixed) {

        class TempComparator implements Comparator<T> {
            @Override
            public int compare(T a, T b) {
                return a.compareTo(b);
            }
        }

       return selectionSort(data,fixed, new TempComparator());
    }
}
