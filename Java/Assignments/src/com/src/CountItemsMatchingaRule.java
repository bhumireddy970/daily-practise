package com.src;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> list : items){
            if(ruleKey.equals("type") && list.get(0).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("color")&& list.get(1).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("name") && list.get(2).equals(ruleValue)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );
        System.out.println(countMatches(items, "type", "phone"));
    }
}
