/*
You are working on a feature for an application that analyze user-generated content, specifically focusing on identifying missing tags from a given set of tags, provided in the form of an array T. Each tag is represented as an integer from 1 to n, where n is the total number of tags available. Your task is to return an array, in the increasing order, of all tags that were not used in the user's content.

Input Specification:

Input1: An integer value representing the number of tags
Input2: An integer array T representing the tags

Output Specification: Return an array in the increasing order, of all tags that were not used in the user's content.

Example1: 

input1: 8
input2: [4, 3, 2, 7, 8, 2, 3, 1]

output: [5, 6]
 */

import java.util.*;

public class UserContentTag {
    static int[] findMissingTags(int n, int[] arr){
        boolean[] usedTags = new boolean[n + 1];
        for(int tag: arr){
            if(tag <= n){
                usedTags[tag] = true;
            }
        }
        List<Integer> missingTags = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(!usedTags[i]){
                missingTags.add(i);
            }
        }
        int[] result = new int[missingTags.size()];
        for(int i= 0; i< missingTags.size(); i++){
            result[i] = missingTags.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] output = findMissingTags(n, arr);
        for(int t: output){
            System.out.print(t + " ");
        }

    }
}
