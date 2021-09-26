package alogrithm_skills;

import java.util.ArrayList;
import java.util.List;

public class Backtracking { 

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        backtrack(nums, ret, tmp);
        return ret;
    }

    public static void backtrack(int[] nums, List<List<Integer>> ret, List<Integer> tmp) {
        if (tmp.size() == nums.length){
            ret.add(new ArrayList<>(tmp));
            return;
        }
        for (int num : nums) {
            if (tmp.contains(num)) continue;
            tmp.add(num);
            backtrack(nums, ret, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
