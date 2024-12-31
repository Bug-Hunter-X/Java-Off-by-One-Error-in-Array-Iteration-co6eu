public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i <= arr.length; i++) { // <= causes ArrayIndexOutOfBoundsException
            arr[i] = i * 2;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}