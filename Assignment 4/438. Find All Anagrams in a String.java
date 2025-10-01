//TC:O(n)
//SC:O(1)

class Solution {
    public List<Integer> findAnagrams(String p, String s) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();

        if(m<n) return list;

        int map1[] = new int[26];   
        int map2[] = new int[26];

        for(int i=0;i<n;i++){
            map1[s.charAt(i) - 'a']++;
            map2[p.charAt(i) - 'a']++;
        }

        //start window   
        if(isMatched(map1,map2)){
            list.add(0);
        }
        for(int i=1;i<=m-n;i++){
            map2[p.charAt(i-1) - 'a']--; 
            map2[p.charAt(i+n-1) - 'a']++;
            if(isMatched(map1,map2)){
                list.add(i);
            }
        }
        return list;
    }

    public  boolean isMatched(int map1[], int map2[]){
        for(int i=0;i<26;i++){
            if (map1[i]!=map2[i]) return false;
        }
        return true;
    }   
}

// Example 1:
// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".

// Example 2:
// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".
