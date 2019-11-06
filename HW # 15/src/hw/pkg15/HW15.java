package hw.pkg15;

public class HW15 {
    public static int q1(int n) {
        int[] temp = new int[n];
        temp[0] = 4;
        temp[1] = 7;
        for(int k = 2; k < n; k++)
            temp[k] = temp[k-1] + temp[k-2];
        return temp[n];
    }

    public static void q2(int[] list) {
        int max = list.length - 1;
        for(int k = 0; k < max; k++) {
            int temp = list[k];
            list[k] = list[k+1];
            list[k+1] = temp;
        }
    }

    public static void q4(int[] list) {
        for(int p = 0; p < list.length; p++) {
            int max = list.length -1;
            int temp = list[p];
            list[p] = list[max-p];
            list[max-p] = temp;
        }
    }

    public static void q5(int[] list) {
        for(int p = 0; p < list.length/2; p++) {
            int max = list.length -1;
            int temp = list[p];
            list[p] = list[max-p];
            list[max-p] = temp;
        }
    }

    public static int[] q6(int[] x) {
        int[] temp = new int[x.length];
        int q = temp.length - 1;
        for(int p = 0; p < x.length; p++) {
            temp[q] = x[p];
            q--;
        }
        return temp;
    }
    
    public static void q12() {
        int[] list1 = {56, 23, 78, 54, 11, 95, 60, 17, 64};
        int[] list2 = {32, 44, 87, 11, 90, 56};
        swap(list1, list2);
        for(int item1: list1)
            System.out.print(item1 + " ");
        System.out.println();
        for(int item2: list2)
            System.out.print(item2 + " ");
    }
    

    public static void swap(int[] inList1, int[] inList2) {
	    int[] inList3 = inList1;
	    inList1 = inList2;
	    inList2 = inList3;
    }

    public static void q18() {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3};
        for(int i = 3; i < nums.length -1; i++) {
            nums[i+1] = i;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        /* System.out.println("Hello Java");
        int[] array = {6,2,7,8,1,3,4,5,0};
        array = q6(array);

        for (int item : array) {
            System.out.println(item);
        } */

        q18();
    }
}