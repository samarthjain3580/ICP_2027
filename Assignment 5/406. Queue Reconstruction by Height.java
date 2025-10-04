// Time complexity: O(n^2)
// Space complexity: O(n)

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0]; // descending order by 0th index
            } else {
                return a[1] - b[1]; // ascending order by 1st index
            }
        });

        List<int[]> list = new ArrayList<>();
        for(int[] curr: people) {
            list.add(curr[1], curr);
        }

        return list.toArray(new int[people.length][]);
    }
}

// class Solution {
//     public int[][] reconstructQueue(int[][] people) {
        
//         Arrays.sort(people, (a, b) -> {
//             if (a[0] != b[0]) {
//                 return b[0] - a[0]; // descending order by 0th index
//             } else {
//                 return a[1] - b[1]; // ascending order by 1st index
//             }
//         });

//         List<int[]> list = new ArrayList<>();
//         for(int[] curr: people) {
//             list.add(curr[1], curr);
//         }

//         return list.toArray(new int[people.length][]);
//     }
// }
