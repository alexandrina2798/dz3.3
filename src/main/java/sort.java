import java.util.*;

public class sort
{
    public static void main(String[] args) {

        int a [] = {8, 15, 78, 14, 66, 77, 1};     // создаем массив с 7 индексами

        a = thanosSort(a);

        System.out.println("result:");

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }


    }

    public static int[] conc (int[] a, int[] b){                //метод для сложения двух массивов
        int[]c = new int[a.length+b.length];                    //создаем третий массив длиной, равной сумме длин переданных массивов
        int count;                                              //переменная для отслеживания индекса элемента третьего массива
        for(count = 0; count<a.length; count++) {               //копируем первый массив в третий
            c[count] = a[count];
        }
        for(int i = 0;i<b.length;i++) {                         //копируем второй массив в третий
            c[count++] = b[i];                                  //продолжая увеличивать индекс третьего массива
        }
        return c;                                               //возвращаем третий массив
    }

    public static int[] thanosSort (int[] array){

        if (array.length > 1){                                  // пока не дошли до массивов, длиной 1, нужно сортировать
            int sum = 0;                                        // счетчик, к которому мы будем прибавлять элементы массива

            for (int i = 0; i < array.length; i++){                 //ищем сумму переданного массива
                sum = sum + array[i];
            }

            double avg = (double) sum / array.length;               //ищем среднее арифмитическое

            int[] newArray = Arrays.copyOf(array, array.length);    //создаем вспомогательный массив для сортировки
            int l = 0;                                              //переменная для подсчета количества чисел, меньших avg
            int r = newArray.length;                                //переменная для подсчета количества чисел, больших avg
            for (int i = 0; i < newArray.length; i++){              //идем по массиву
                if (array[i] > avg )                                //если элемент больше avg
                {
                    newArray[r-1] = array[i];                       //закидываем его в правую часть массива
                    r--;                                            //увеличиваем индекс для следующей записи
                    //countR++;
                }
                else {
                    newArray[l] = array[i];                         //иначе кидаем в левую часть
                    l++;                                            //уменьшаем индекс для следующей записи, так как сохраняем с конца
                    //countL++;
                }
            }

            return conc (thanosSort(Arrays.copyOfRange(newArray, 0, l)), thanosSort(Arrays.copyOfRange(newArray, r, newArray.length)));
            //возвращаем склейку левого + правого массива, которые по отдельности кидаются на сортировку
        }

        else{
            return array; //в тот момент, когда на сортировку приходит один массив с одним элементом, выходим из порочной рекурсии
        }
    }
}


