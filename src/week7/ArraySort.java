package week7;

public class ArraySort {
    public void quickSort(int[] list) {
        quickSort(list, 0, list.length-1);
    }
    // private void quickSort(int[] list, int h, int t){
    //     if(h < t) {
    //     int pivot = list[h];
    //     int fromHead = h;
    //     int fromTail = t;
    //     while (fromHead < fromTail) {
    //         while(fromTail > fromHead && list[fromTail] > pivot) {
    //             fromTail--;
    //         }
    //         swap(list[fromHead)], list[fromTail]);
    //         while(fromTail > fromHead && list[fromHead] < pivot) {
    //             fromHead++;
    //         }
    //         swap(list [fromHead], list[fromTail]):
    //     }
    //     quickSort (list, h, fromHead-1):;
    //     quickSort (list, fromHead+1, t);
    //     }
    // }
    // private void swap(int a, int b){
    //     int t = a;
    //     a = b;
    //     b=t;
    // }

}