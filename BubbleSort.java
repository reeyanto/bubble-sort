import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {6, 2, 8, 4, 10};                      // sekumpulan data tidak terurut

        System.out.print("Sebelum terurut: ");
        System.out.println(Arrays.toString(data));          // sebelum terurut

        System.out.print("Setelah terurut: ");
        System.out.println(Arrays.toString(bubble(data)));  // setelah terurut
    }

    // algoritma bubble sort
    private static int[] bubble(int[] data) {
        int banyak = data.length;                           // tampung banyak data

        for (int i = 0; i < banyak - 1; i++) {              // looping penunjuk jumlah iterasi
            for (int j = 0; j < banyak - i - 1; j++) {      // looping utk perbandingan
                if (data[j] > data[j + 1]) {                // jika lebih besar dari elemen setelahnya
                    int temp    = data[j];                  // tukar, tampung dulu ke variabel temp
                    data[j]     = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;                                        // kembalikan datanya dalam bentuk string
    }
}
