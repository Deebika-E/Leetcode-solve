// Last updated: 1/26/2026, 4:54:22 PM
1public class Solution extends VersionControl {
2    public int firstBadVersion(int n) {
3
4        int left = 1;
5        int right = n;
6
7        while (left < right) {
8            int mid = left + (right - left) / 2;
9
10            if (isBadVersion(mid)) {
11                right = mid;      // mid might be the first bad
12            } else {
13                left = mid + 1;   // first bad is after mid
14            }
15        }
16        return left;
17    }
18}
19