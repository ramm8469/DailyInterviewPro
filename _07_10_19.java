package com.rammohan.DailyInterviewPro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _07_10_19 {
    /*
    * Hi, here's your problem today. This problem was recently asked by Twitter:

Given an array of characters with repeats, compress it in place. The length after compression should be less than or equal to the original array.

Example:

Input: ['a', 'a', 'b', 'c', 'c', 'c']
Output: ['a', '2', 'b', 'c', '3']

Here's a starting point:

class Solution(object):
  def compress(self, chars):
    # Fill this in.

print Solution().compress(['a', 'a', 'b', 'c', 'c', 'c'])
# ['a', '2', 'b', 'c', '3']

    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String...");
        String str = sc.nextLine();
        char[] chr = str.toCharArray();
//        char[] chr = {'a','a','b','c','c','c'};
        System.out.println(chr);

        // call the strCompress function
        strCompress(chr);
    }

    static void strCompress(char[] chr){
        // Create a HashMap
        HashMap<Character,Integer> map = new HashMap<>();

        // storing values of character count to the map
        for (int i = 0; i <chr.length ; i++) {
            char ch = chr[i];
            int count = 0;
            for (int j = 0; j <chr.length; j++) {
                if (ch == chr[j]){
                    count++;
                }

            }
            // put the values to the map
            map.put(ch,count);
        }

        // out the values of map
        // first create an entry set
       Set<Map.Entry<Character,Integer>> entries = map.entrySet();
        System.out.print("[");
        for (Map.Entry<Character,Integer> e:entries
             ) {
            if (e.getValue() == 1){
                System.out.print("\'" + e.getKey() + "\'" + "," );
            }
            else {
                System.out.print("\'" + e.getKey() + "\'" + "," + "\'" + e.getValue() + "\'" + ",");
            }
        }
        System.out.print("\b"+"]");

    }
}
