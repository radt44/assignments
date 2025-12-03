//Name: Garrett Radtke
//Date: 12/1/2025

public class BinaryTest {
    public static void main(String[] args) {
        int[] values = {
                20, 577, 190, 444, 916, 683, 408, 962, 185, 957,
                404, 779, 847, 662, 491, 710, 678, 410, 994, 442,
                788, 443, 809, 989, 286, 857, 616, 77, 99, 614,
                160, 368, 104, 196, 26, 543, 941, 38, 764, 544
        };
        BST tree = new BST();
        for (int value : values) {
            tree.insert(value);
        }
        tree.search(916);
        tree.displayOrdered();
        tree.remove(916);
        tree.search(916);
    }
}
