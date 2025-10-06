import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public int maxValue;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in array (x y): ");
        String dimRun = input.nextLine();
        String [] dims = dimRun.split(" ");
        Location test = new Location(Integer.parseInt(dims[0]), Integer.parseInt(dims[1]), 0);

    }

    public Location (int row, int column, double maxValue) {
        Scanner input2 = new Scanner(System.in);
        this.row = row;
        this.column = column;
        double[][] arrayDub = new double[this.row][];

        for (int i = 0; i < this.row; i++) {
            System.out.printf("Enter row " + i + ": ");
            String line = input2.nextLine();
            String[] tokenArr = line.split(" ,");
            System.out.println(tokenArr[1]);
            arrayDub[i] = new double[this.column];

            for (int j = 0; j < this.column; j++) {
                arrayDub[i][j] = Double.parseDouble(tokenArr[j]);
            }

        }
    }

}
