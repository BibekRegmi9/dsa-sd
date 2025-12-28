package dsa.array.two_pointer;

public class TrappingRainWater {
    public static void main(String[] args) {

    }

    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        int maxHeight = height[0];
        int index= 0 ;

        for(int i = 0 ; i < height.length; i++){
            if(height[i] > maxHeight){
                maxHeight = height[i];
                index = i;
            }
        }

        for(int i = 0; i < index; i++){
            if(leftMax > height[i]){
                water += leftMax - height[i];
            } else {
                leftMax = height[i];
            }
        }

        for(int i = height.length-1; i > index; i--){
            if(rightMax > height[i]){
                water += rightMax - height[i];
            } else {
                rightMax = height[i];
            }
        }

        return water;
    }
}
