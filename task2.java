public class task2 {
    public static void main(String[] args) {

        int[] arr_1 = new int[3];
        arr_1[0] = -1;
        arr_1[1] = 2;
        arr_1[2] = 3;
        double arr_2[] = {-1.57, 7.654, 9.986};
        String arr_3[] = {"1.2", "0.2", "0.7"};
        for (int i = 0; i < 3; i++) {
            if (i < 2)
                System.out.print(arr_1[i]+", ");
            else
            System.out.println(arr_1[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (i < 2)
                System.out.print(arr_2[i]+", ");
            else
                System.out.println(arr_2[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (i < 2)
                System.out.print(arr_3[i]+", ");
            else
                System.out.println(arr_3[i]);
        }
    }
}
