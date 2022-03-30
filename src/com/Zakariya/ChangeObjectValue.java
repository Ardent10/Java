package com.Zakariya;

import java.util.Arrays;

public class ChangeObjectValue {
    public static void main(String[] args) {
        int[] arr = {1,5,8,7,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    // nums is a copy of the ref variable arr which are pointing to
    // the same obejct of the array
    static void change(int[] nums){
        nums[0] = 58; // if you make a change the object via this ref variable, then changes will be reflected.
    }
}
