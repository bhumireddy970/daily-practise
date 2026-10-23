package com.src.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(result,new ArrayList<>(),candidates,target,0);
        return result;

    }

    private static void backTrack(List<List<Integer>> result,List<Integer> currentCombination,int[] candidates,int remain,int start) {
        if(remain==0){
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>remain)
                break;
            currentCombination.add(candidates[i]);
            backTrack(result,currentCombination,candidates,remain-candidates[i],i);

            currentCombination.remove(currentCombination.size()-1);

        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum( new int[]{2,3,6,7},7));
    }
}
