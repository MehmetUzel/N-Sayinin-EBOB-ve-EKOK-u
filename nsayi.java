public class nsayi {

    public static long arrayekok(int[] array)
    {
        long array_ekok = 1;
        int carpan = 2;

        while (true) {
            int sayac = 0;
            boolean bolunebilir = false;

            for (int i = 0; i < array.length; i++) {

                // Negatif sayıları pozitif farz ederek hesaplama yapıyoruz.

                if (array[i] == 0) {
                    return 0;
                }
                else if (array[i] < 0) {
                    array[i] = array[i] * (-1);
                }
                if (array[i] == 1) {
                    sayac++;
                }

                if (array[i] % carpan == 0) {
                    bolunebilir = true;
                    array[i] = array[i] / carpan;
                }
            }

            if (bolunebilir) {
                array_ekok = array_ekok * carpan;
            }
            else {
                carpan++;
            }

            if (sayac == array.length) {
                return array_ekok;
            }
        }
    }

    static int ebob(int a, int b)
    {
        if (a == 0)
            return b;
        return ebob(b % a, a);
    }

    static int bulebob(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = ebob(arr[i], result);

        return result;
    }


    public static void main(String[] args)
    {
        int[] array = { 2, 10, 6, 16, 4 };
        int n = array.length;
        System.out.println("EBOB : "+bulebob(array, n));
        System.out.println("EKOK : "+arrayekok(array));




    }
}
