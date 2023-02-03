import java.util.Arrays;
import java.util.ArrayList;

public class Why {
    public static void main(String[] args) {

        String query = "(2, 5)";
        ArraysIn arr1 = new ArraysIn(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ArraysIn arr2 = new ArraysIn(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        ArraysIn arr3 = new ArraysIn(new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        ArrayList<ArraysIn> grid = new ArrayList<ArraysIn>();
        grid.add(arr1);
        grid.add(arr2);
        grid.add(arr3);
        System.out.println(grid);
        System.out.println(grid.get(Integer.parseInt(query.substring(query.indexOf("(") + 1, query.indexOf("(") + 2))).getNums()[Integer.parseInt(query.substring((query.indexOf(",") + 2), (query.indexOf(")"))))]);
    }
}
