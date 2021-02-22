import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class sortTest {

    @Test
    public void simpleTest()                                //простой тест с положительными числами
    {
        int array[] = {8, 15, 78, 14, 66, 1, 77};           //входные данные
        int arraySorted[] = {1, 8, 14, 15, 66, 77, 78};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

    @Test
    public void negativeNumbersTest()                          //отрицательные числа
    {
        int array[] = {-10, -6, -40, -34, -97, -57};           //входные данные
        int arraySorted[] = {-97, -57, -40, -34, -10, -6};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);                 //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);     //сравнение результата с ожиданием
    }

    @Test
    public void mixTest()                                      //положительные, отрицательные числа и 0
    {
        int array[] = {-18, 15, 0, 14, -6, -177, 1};           //входные данные
        int arraySorted[] = {-177, -18, -6, 0, 1, 14, 15};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

    @Test
    public void alreadySortedTest()                    //массив изначально отсортирован по возрастанию
    {
        int array[] = {0, 1, 2, 3, 4, 5, 6};           //входные данные
        int arraySorted[] = {0, 1, 2, 3, 4, 5, 6};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

    @Test
    public void descendingSortedTest()                         //на вход подается массив, отсортированный по убыванию
    {
        int array[] = {6, 5, 4, 3, 2, 1, 0, -1, -2};           //входные данные
        int arraySorted[] = {-2, -1, 0, 1, 2, 3, 4, 5, 6};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

    @Test
    public void boundaryTest()                                //граничные значения типа инт и 0
    {
        int array[] = {-2147483648, 2147483647, 0};           //входные данные
        int arraySorted[] = {-2147483648, 0, 2147483647};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

    @Test
    public void sameNumbersTest()                   //массив с одинаковыми числами
    {
        int array[] = {2, 2, 2, 2, 2, 2};           //входные данные
        int arraySorted[] = {2, 2, 2, 2, 2, 2};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

    @Test
    public void lilBabyArrayTest()    //массив из одного числа
    {
        int array[] = {1};           //входные данные
        int arraySorted[] = {1};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

    @Test
    public void avgTest()                    //одно из значений массива равно среднему арифметическому значений массива
    {
        int array[] = {23, 46, 0};           //входные данные
        int arraySorted[] = {0, 23, 46};     //ожидаемый результат работы сортировки

        int result[] = sort.thanosSort(array);              //вызов сортировки

        Assertions.assertArrayEquals(arraySorted, result);  //сравнение результата с ожиданием
    }

}
