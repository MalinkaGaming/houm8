import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание № 1");
        int[] nums0 = new int[]{1, 2, 3};


        float[] nums = new float[3];
        nums[0] = 1.57f;
        nums[1] = 7.654f;
        nums[2] = 9.986f;

        int[] nums2 = new int[]{45, 85, 69, 78, 73, 114, 45};

        System.out.println("задание № 2");

        for (int i = 0; i < nums0.length; i++) {
            if (i == nums0.length - 1) {
                System.out.println(nums0[i]);
                break;
            }
            System.out.print(nums0[i] + ", ");
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(nums[i]);
                break;
            }
            System.out.print(nums[i] + ", ");
        }
        for (int i = 0; i < nums2.length; i++) {
            if (i == nums2.length - 1) {
                System.out.println(nums2[i]);
                break;
            }
            System.out.print(nums2[i] + ", ");
        }

        System.out.println("задание № 3");

        for (int k = nums0.length - 1; k >= 0; k--) {

            if (k > 0) {
                System.out.print(nums0[k] + ", ");
            } else {
                System.out.print(nums0[k]);
            }
        }
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--) {

            if (i > 0) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println();

        for (int u = nums2.length - 1; u >= 0; u--) {

            if (u > 0) {
                System.out.print(nums2[u] + ", ");
            } else {
                System.out.print(nums2[u]);
            }
        }
        System.out.println();
        System.out.println("задание № 4");
        for (int i = 0; i < nums0.length; i++) {
            if (nums0[i] % 2 != 0) {
                nums0[i]++;
            }
        }
        System.out.println(Arrays.toString(nums0));
    }
}





















