
/* Task Part 2 Algorithms # 8
Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
   и среднее среди всех значений между 2-мя индексами.
        Test Data:
        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}*/


public class MinMaxAve {

    public int[] minMaxAve(int[] nums, int i1, int i2) {
        if (nums == null || nums.length == 0
                || i1 < 0 || i2 < 0 || i1 >= nums.length || i2 >= nums.length) {
            return new int[0];
        }

        int start;
        int end;

        if (i1 <= i2) {
            start = i1;
            end = i2;
        } else {
            start = i2;
            end = i1;
        }

        int[] minMaxAve = new int[3];
        int min = nums[start];
        int max = nums[start];
        int sum = nums[start];

        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
            sum += nums[i];
        }

        minMaxAve[0] = min;
        minMaxAve[1] = max;
        minMaxAve[2] = sum / (end - start + 1);

        return minMaxAve;
    }
}
