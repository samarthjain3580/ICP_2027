TC : O(n)
SC : 42 MB

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {  
        // for(int i=m; i<m+n; i++) {
        //     nums1[i] = nums2[i%n];
        // }
        // Arrays.sort(nums1);

        int[] arr = new int[m];
        for(int i=0; i<m; i++) {
            arr[i] = nums1[i];
        }

        int i = 0, j = 0, k = 0;

        while (i<m && j<n) {
            if (arr[i] <= nums2[j]) {
                nums1[k] = arr[i];
                i++;
            }
            else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            nums1[k] = arr[i];
            i++;
            k++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
