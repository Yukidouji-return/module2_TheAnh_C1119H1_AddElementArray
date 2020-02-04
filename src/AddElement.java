import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 1; i < size + 1; i++) {
            System.out.print("element " + i + " :");
            arr[i - 1] = scanner.nextInt();
        }
        System.out.print("your arr:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int index;
        System.out.println("please enter the number you want to add:");
        int value = scanner.nextInt();
        do {
            System.out.print("please enter the position you want to add:");
            index = scanner.nextInt();
        } while (index < 0 || index > size);
        int[] newarr = new int[size + 1];
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        newarr[index] = value;
        for (int i = index + 1; i < newarr.length; i++) {
            newarr[i] = arr[i - 1];
        }


        System.out.print("your new arr:");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }

    }
}