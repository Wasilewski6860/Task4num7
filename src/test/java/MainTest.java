import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void test01() {
        Integer[] array = {7, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
        boolean[] booleans ={true,false,true,true,false,false,true,true,false,true};
        Integer[] right ={ 1, 10, 3, 7, 7, 2, 7, 8, 5, 9 };
        assertTrue(java.util.Arrays.equals(right, newSort.sort(array,booleans)), "Arrays are not equal");
    }

    @Test
    void test02() {
        Integer[] array = {7, 10, 10, 8, 7, 2, 1, 9, 5, 7 };
        boolean[] booleans ={true,false,true,true,false,false,true,true,false,true};
        Integer[] right ={ 1, 10 ,7 ,7, 7 ,2 ,8, 9, 5, 10 };
        assertTrue(java.util.Arrays.equals(right, newSort.sort(array,booleans)), "Arrays are not equal");
    }

    @Test
    void test03() {
        Integer[] array = {7, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
        boolean[] booleans ={true,true,true,true,true,true,true,true,true,true};
        Integer[] right ={ 1, 2 ,3, 5, 7, 7 ,7 ,8 ,9 ,10 };
        assertTrue(java.util.Arrays.equals(right, newSort.sort(array,booleans)), "Arrays are not equal");
    }

    @Test
    void test04() {
        Integer[] array = {7, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
        boolean[] booleans ={false,false,false,false,false,false,false,false,false,false};
        Integer[] right ={ 7, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
        assertTrue(java.util.Arrays.equals(right, newSort.sort(array,booleans)), "Arrays are not equal");
    }

    @Test
    void test05() {
        Integer[] array = {3, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
        boolean[] booleans ={false,true,false,false,false,false,false,false,false,false};
        Integer[] right ={ 3, 10, 3, 8, 7, 2, 1, 9, 5, 7  };
        assertTrue(java.util.Arrays.equals(right, newSort.sort(array,booleans)), "Arrays are not equal");
    }

}