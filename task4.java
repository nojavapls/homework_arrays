public class task4 {
    public static void main(String[] args) {

        int[] arr_1 = new int[3];
        arr_1[0] = -1;
        arr_1[1] = 2;
        arr_1[2] = 3;
        for (int i = 0; i < arr_1.length; i++) {
            if ( i != arr_1.length - 1)
                System.out.print(arr_1[i]%2 != 0 ? ((arr_1[i]+1)+", ") : (arr_1[i]+", "));
            else
                System.out.println(arr_1[i]%2 != 0 ? ((arr_1[i]+1)) : (arr_1[i]));

            }
     }
}
