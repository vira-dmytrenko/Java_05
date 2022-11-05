import com.sun.jdi.Value;

public class CreateArray {

//    Part 1.1 Arrays.
    //    Task 1. В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
    //    который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    //    Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    public int[] createIntArray(int num1, int num2, int num3, int num4, int num5) {
        int[] array = {num1, num2, num3, num4, num5};
        return array;
    }


//    Part 2.1 Arrays
    // Task 1. В классе CreateArray написать метод createIntArrayFromText(),
    // который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”) и возвращает массив типа int[] из этих чисел.

    public int[] createIntArrayFromText(String str) {
        if (str == null || str.isEmpty()) {
            return new int[0];
        }

        String[] stringArray = str.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) Double.parseDouble(stringArray[i]);
        }

        return intArray;
    }

    public String[] getPhoneNumberAndCountry(int[] nums) {
        if (nums == null || nums.length != 11) {
            return new String[0];
        }

        String phoneNumberToString = "";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || nums[i] > 9) {

                return new String[0];
            } else if (i == 0) {
                phoneNumberToString += nums[i] + "(";
            } else if (i == 3) {
                phoneNumberToString += nums[i] + ")";
            } else if (i == 7 || i == 9) {
                phoneNumberToString += "-" + nums[i];
            } else {
                phoneNumberToString += nums[i];
            }
        }

        String[] data = new String[2];

        data[0] = phoneNumberToString;

        // add country code name
        switch (nums[0]) {
            case 1:
                data[1] = "USA";
                break;
            case 7:
                data[1] = "RUS";
                break;
        }

        return data;
    }
}
