import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice1 = 0;
        do {
            System.out.println("1 - MyArrayList" + "\n" + "2 - MyLinkedList");
            choice1 = sc.nextInt();
            switch (choice1) {
                case 1:
                    int choise2;
                    MyList<Integer> list = new MyArrayList<>();
                    do {

                        System.out.println(
                                "1 - get the size of the array" + "\n" +
                                        "2 - is there this element in the array?" + "\n" +
                                        "3 - adding a new element to an array" + "\n" +
                                        "4 - adding a new element to the array by index " + "\n" +
                                        "5 - removing item" + "\n" +
                                        "6 - removing item by index" + "\n" +
                                        "7 - get element of array by index" + "\n" +
                                        "8 - delete array" + "\n" +
                                        "9 - array sorting" + "\n" +
                                        "10 - index of the element" + "\n" +
                                        "11 - the last index of the element" + "\n" +
                                        "12 - go back");
                        choise2 = sc.nextInt();
                        switch (choise2) {
                            case 1:
                                System.out.println(list.size());
                                break;
                            case 2:
                                System.out.println("input element: ");
                                int case2 = sc.nextInt();
                                System.out.println(list.contains(case2));
                                break;
                            case 3:
                                System.out.println("input new element: ");
                                int case3 = sc.nextInt();
                                list.add(case3);
                                break;
                            case 4:
                                System.out.println("input new element: ");
                                int case4 = sc.nextInt();
                                System.out.println("input index: ");
                                int case4Index = sc.nextInt();
                                list.add(case4, case4Index);
                                break;
                            case 5:
                                System.out.println("input element: ");
                                int case5 = sc.nextInt();
                                System.out.println(list.remove(case5));

                        }

                    } while (choise2 != 13);
                case 2:
            }
            System.out.println();
        } while (choice1 != 1);

    }
}
