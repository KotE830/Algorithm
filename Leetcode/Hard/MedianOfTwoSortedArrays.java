import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid = (nums1.length + nums2.length) / 2.0, result;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (true) {
            int num;
            if (i == nums1.length)
                list.add(nums2[j++]);
            else if (j == nums2.length)
                list.add(nums1[i++]);
            else if (nums1[i] < nums2[j])
                list.add(nums1[i++]);
            else
                list.add(nums2[j++]);

            if (list.size() >= Math.round(mid+0.5))
                break;
        }

        if ((nums1.length + nums2.length) % 2 == 0)
            result = (list.get(list.size()-1) + list.get(list.size()-2)) / 2.0;
        else
            result = list.get(list.size()-1);

        return result;
    }
}