import java.util.Comparator;

public class Main {


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

    public static <T extends Comparable<T>> void sort(T[] data,boolean[] fixed) {

        class TempComparator implements Comparator<T> {
            @Override
            public int compare(T a, T b) {
                return a.compareTo(b);
            }
        }

        selectionSort(data,fixed, new TempComparator());
    }


    public static void main(String[] args) {

//        Integer[] array = {7, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
//        boolean[] booleans ={true,false,true,true,false,false,true,true,false,true};

        Integer[] array = {3, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
        boolean[] booleans ={false,true,false,false,false,false,false,false,false,false};

        newSort.sort(array,booleans);

        System.out.println();
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
