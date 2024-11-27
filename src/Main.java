//Написать все фигуры использ. while, do while (квадрат)
public class Main {
    public static void main(String[] args) {
        int side = 20;
        int i = 0;
        while (i < side) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            i++;
        }
    }
}

//