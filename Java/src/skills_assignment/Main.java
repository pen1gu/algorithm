package skills_assignment;

public class Main {

    public static void main(String[]$) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i+1;
            System.out.println(System.identityHashCode(arr[i]));
        }

        swap(arr, 0, 4);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(System.identityHashCode(arr[i]));
        }

    }

    static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}