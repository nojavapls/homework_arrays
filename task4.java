public class task4 {
    public static void main(String[] args) {

        int[] arr_1 = new int[3];
        arr_1[0] = -1;
        arr_1[1] = 2;
        arr_1[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i < 2)
                System.out.print((arr_1[i]+1)+", ");
            else
                System.out.println(arr_1[i]+1);
        }
}
}
