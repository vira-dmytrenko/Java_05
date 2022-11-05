public class Task9 {
    public int[] intersection(int[] array1, int[] array2) {
        int l = 0;
        int[] result = new int[l];

        if (array1.length >= array2.length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        l++;
                        result[i] = array1[i];
                    }
                }
            }
        } else {
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array1[i] == array2[j]) {
                        l++;
                        result[i] = array1[i];
                    }
                }
            }
        }
        return result;
    }
}

