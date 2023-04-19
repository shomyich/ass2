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
                    MyList<Object> list = new MyArrayList<>();
                    do {

                        System.out.println(
                                "0 - output whole array" + "\n" +
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
                            case 0:
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.print(list.get(i) + " ");
                                }
                                break;
                            case 1:
                                System.out.println(list.size());
                                break;
                            case 2:
                                System.out.println("input element: ");
                                Object case2 = sc.next();
                                System.out.println(list.contains(case2));
                                break;
                            case 3:
                                System.out.println("input new element: ");
                                Object case3 = sc.next();
                                list.add(case3);
                                break;
                            case 4:
                                System.out.println("input new element: ");
                                Object case4 = sc.next();
                                System.out.println("input index: ");
                                int case4Index = sc.nextInt();
                                list.add(case4, case4Index);
                                break;
                            case 5:
                                System.out.println("input element: ");
                                Object case5 = sc.next();
                                System.out.println(list.remove(case5));
                                break;
                            case 6:
                                System.out.println("input index: ");
                                int case6 = sc.nextInt();
                                list.remove(case6);
                                break;
                            case 7:
                                System.out.println("input index: ");
                                int case7 = sc.nextInt();
                                System.out.println(list.get(case7));
                                break;
                            case 8:
                                list.clear();
                                System.out.println("array is empty");
                                break;
                            case 9:
                                list.sort();
                                System.out.println("list is sorted");
                                break;
                            case 10:
                                System.out.println("input element: ");
                                Object case10 = sc.next();
                                System.out.println(list.indexOf(case10));
                                break;
                            case 11:
                                System.out.println("input element: ");
                                Object case11 = sc.next();
                                System.out.println(list.lastIndexOf(case11));
                                break;
                            case 12:
                                break;

                        }

                    } while (choise2 != 12);
                    break;

                case 2:

            }
            System.out.println();
        } while (choice1 != 3);

    }
}
