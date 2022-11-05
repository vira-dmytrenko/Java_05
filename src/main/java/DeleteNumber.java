public class DeleteNumber {

    public int[] deleteNumber(int[] initialData, int num) {
        if (initialData == null || initialData.length == 0){
            return new int[0];
        }

        // count filtered numbers
        int count = 0;
        for (int i = 0; i < initialData.length; i++) {
            if (initialData[i] == num) {
                count ++;
            }
        }

        // create filtered array
       int[] filteredData = new int[initialData.length - count];

        // fill in filtered array
        int l = 0;
        for (int i = 0; i < initialData.length; i++) {
            if (initialData[i] != num) {
                filteredData[l++] = initialData[i];
            }
        }

        return filteredData;
    }

}
