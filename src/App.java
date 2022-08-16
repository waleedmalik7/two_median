public class App {
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums3 = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        while(i+j != nums3.length){


            if(nums1.length == i && nums2.length != j){
                nums3[i+j] = nums2[j];
                j++;
            }else if(nums1.length != i && nums2.length == j){
                nums3[i+j] = nums1[i];
                i++;
            }else{
                if(nums1[i] <= nums2[j]){
                    nums3[i+j] = nums1[i];
                    i++;
                }else{
                    nums3[i+j] = nums2[j];
                    j++;
                }
            }
        }

        if((i+j) % 2 == 0){
            return (nums3[(i+j-1)/2]+nums3[(i+j)/2])/2.0;
        }else{
            return (nums3[nums3.length-1/2])*1.0;
        }
    }
    public static void main(String[] args) {
        int [] one = {0,1,2,3,4,5};
        int [] two = {0,1,2,3,4,7};
       
        System.out.println(findMedianSortedArrays(one,two));
    }
}

