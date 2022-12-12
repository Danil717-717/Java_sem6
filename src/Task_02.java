/*
   1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами
       от 0 до 24.
   2. Создайте метод, в который передайте заполненный выше массив и с помощью
       Set вычислите процент уникальных значений в данном массиве и верните
       его в виде числа с плавающей запятой.
   Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее
        количество чисел в массиве.
*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task_02 {
        public static void main(String[] args) {
                System.out.println(unicZnach(generateArrey(1000,0,24)));
        }

        public static Integer[] generateArrey(int size, int min, int max){  //создаем массив
                Random random = new Random();                               // рандомно заполняем
                Integer[] arr = new Integer[size];
                for (int i = 0; i < arr.length; i++) {                       // заполняем циклом
                        arr[i] = random.nextInt(min, max + 1);      // от мин до макс(макс+1)
                }                            //(max - min + 1) + min; те в рандоме если передается тольео максимальное значение то пишем
                                             // разницу между ними и добавляем этот недостающий минимум н/м если мин 10 24-10=14 + 10= 24
                return arr;
        }
        public  static int unicZnach(Integer[] arr){    // 2. засовываем получившийся массив в Set
                Set<Integer> set = new HashSet<>(Arrays.asList(arr)); // Создаем
                System.out.println(Arrays.toString(arr));             // печать массива в 1000 элементов
                System.out.println(set);                              // печать Set с уникальными значениями
                return set.size() * 100/ arr.length;                  // возвращаем значение по формуле
        }
}
