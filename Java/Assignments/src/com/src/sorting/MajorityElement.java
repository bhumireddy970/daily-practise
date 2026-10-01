package com.src.sorting;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //Two loops
    public static int majorityElement(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int num : nums)
           map.put(num,map.getOrDefault(num,0)+1);
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue()>(nums.length/2))
               return entry.getKey();
       }
       return -1;
    }

    //single loops
    public static int majorityElementSingleLoop(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        int majarioty=0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>majarioty){
                result=num;
                majarioty=map.get(num);
            }

        }
        return majarioty > (nums.length/2)?result:-1;
    }

    //single loops without map
    public static int majorityElementSingleLoopWithoutMap(int[] nums) {

        int result=0;
        int majarioty=0;
        for(int num : nums){
            if(majarioty==0){
                result=num;
            }
            majarioty+= num==result?1:-1;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElementSingleLoop(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElementSingleLoopWithoutMap(new int[]{2,2,1,1,1,2,2}));
    }
}
