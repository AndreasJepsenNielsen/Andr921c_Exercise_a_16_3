public class Kap16Opgave3
{
    public static void main(String[] args) {
       LinkedIntList A = new LinkedIntList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(6);
        A.add(7);
        A.add(6);
        isSorted(A);
    }

    // kapitel 16 opgave 3

    public static boolean isSorted(LinkedIntList list) {
        boolean sorted = false;

        int i = 0;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) >= i) {
                i = list.get(j);
                sorted = true;
            } else {
                sorted = false;
            }

        }
        System.out.println(sorted);
        return sorted;

    }

}
