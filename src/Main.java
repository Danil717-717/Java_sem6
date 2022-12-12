import java.util.*;

/*
1. —оздайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
–аспечатайте содержимое данного множества.
2. —оздайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
–аспечатайте содержимое данного множества.
3. —оздайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
–аспечатайте содержимое данного множества.

*/
public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,2,3,2,5,4,6,3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1);     // HashSet сортирует по хешкоду и показывает только уникальные значени€
                                      // те значени€ цыфры, значит он берет за хешькод сами цыфры

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set2);    // Linked сохран€ет пор€док и показывает уникальное значение

        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set3);   // как HeshSet только есть небольшие сложности


    }
}