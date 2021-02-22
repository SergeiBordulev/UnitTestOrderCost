public class UnitTestOrderCost {
    public static void main(String[] args) {
        int[] itemCount1 = {1, 4, 5};
        int[] orderCost1 = {450, 500, 550};
        int[] itemCount2 = {1, 4, 5};
        int[] orderCost2 = {450, 500, 550};

        for (int item : itemCount1) {
            for (int value : orderCost1) {
                for (int item2 : itemCount2) {
                    for (int value2 : orderCost2) {
                        System.out.print("The cost of the order: " + (value + value2) + ", ");
                        System.out.print("Number of products: " + (item + item2) + " The total value of the order: " + (value * item + value2 * item2) + ", ");
                        System.out.println();
                    }
                }
            }
        }
    }
}
