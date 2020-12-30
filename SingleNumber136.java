/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class SingleNumber136 {

    public void SingleNumber136() {
        int[] nums = {1, 3, 1, -1, 3};
        //11224
        Arrays.sort(nums);
        Map<Integer, Integer> mList = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (mList.containsKey(nums[i])) {
                mList.put(nums[i], 2);
            } else {
                mList.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mList.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) {
                System.out.println(key);
            }
        }
    }
}
