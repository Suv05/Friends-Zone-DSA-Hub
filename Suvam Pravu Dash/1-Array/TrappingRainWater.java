public class TrappingRainWater {

    public static void containerWithMostWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;


        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Most area is " + maxArea);
    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        containerWithMostWater(height);
    }
}
