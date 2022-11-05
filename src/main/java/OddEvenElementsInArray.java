public class OddEvenElementsInArray {

    public int[] countOddEvenValuesInArray(int[] data) {
        if (data.length == 0) {
            return new int[0];
        }

        int countEven = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                countEven++;
            }
        }

        return new int[]{countEven, data.length - countEven};
    }
}
