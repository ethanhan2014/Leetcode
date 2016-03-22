package array;

public class FindMedianTwoArray {
	/**
	 * There are two sorted arrays nums1 and nums2 of size m and n 
	 * respectively. 
	 * Find the median of the two sorted arrays. 
	 * The overall run time complexity should be O(log (m+n)).
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedian(int[] nums1, int[] nums2){
		int len1 = nums1.length;
		int len2 = nums2.length;
		if((len1+len2)%2 == 0){
			int r1 = findMedian(nums1,0,len1,nums2,0,len2,(len1+len2)/2);
			int r2 = findMedian(nums1,0,len1,nums2,0,len2,(len1+len2)/2+1);
			return (double)(r1+r2)/2;
		}else{
			return (double) findMedian(nums1,0,len1,nums2,0,len2,(len1+len2+1)/2);
		}
	}
	
	public int findMedian(int[] nums1, int lo1, int hi1,
						  int[] nums2, int lo2, int hi2, int k){
		int len1 = hi1 - lo1;
		int len2 = hi2 - lo2;
		
		if(len1 <= 0){
			return nums2[lo2+k-1];
		}
		if(len2 <= 0){
			return nums1[lo1+k-1];
		}
		
		if(k==1){
			return (nums1[lo1]<nums2[lo2]?nums1[lo1]:nums2[lo2]);
		}
		
		int mid1 = (lo1+hi1)/2;
		int mid2 = (lo2+hi2)/2;
		
		if(nums1[mid1] <= nums2[mid2]){
			if(len1/2+len2/2+1>=k){
				return findMedian(nums1, lo1, hi1, nums2, lo2, mid2, k);
			}else{
				return findMedian(nums1, mid1+1, hi1, nums2, lo2, hi2, k-len1/2-1);
			}
		}else{
			if(len1/2+len2/2+1>=k){
				return findMedian(nums1, lo1, mid1, nums2, lo2, hi2, k);
			}else{
				return findMedian(nums1, lo1, hi1, nums2, mid2+1, hi2, k-len2/2-1);
			}
		}
	}
	
//	public double findMedian(int[] A, int[] B) {
//        int m = A.length, n = B.length;
//        int l = (m + n + 1) / 2;
//        int r = (m + n + 2) / 2;
//        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
//    }
//
//	public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
//		if (aStart > A.length - 1) return B[bStart + k - 1];            
//		if (bStart > B.length - 1) return A[aStart + k - 1];                
//		if (k == 1) return Math.min(A[aStart], B[bStart]);
//
//		int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
//		if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1]; 
//		if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];        
//
//		if (aMid < bMid) 
//			return getkth(A, aStart + k/2, B, bStart,       k - k/2);// Check: aRight + bLeft 
//		else 
//			return getkth(A, aStart,       B, bStart + k/2, k - k/2);// Check: bRight + aLeft
//	}
}
