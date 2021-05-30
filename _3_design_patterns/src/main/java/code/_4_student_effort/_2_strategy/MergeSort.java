package code._4_student_effort._2_strategy;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] list) {
        if (list.length < 2){return;}

        int mid = list.length / 2;
        int [] left_arr = new int[mid];
        int [] right_arr = new int[list.length-mid];

        //Dividing array into two and copying into two separate arrays
        int k = 0;
        for(int i = 0;i<list.length;++i){
            if(i<mid){
                left_arr[i] = list[i];
            }
            else{
                right_arr[k] = list[i];
                k = k+1;
            }
        }
        // Recursively calling the function to divide the subarrays further
        sort(left_arr);
        sort(right_arr);
        // Calling the merge method on each subdivision
        merge(left_arr,right_arr,list,mid,list.length-mid);
    }

    public void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){

        int i=0,l=0,r = 0;
        //The while loops check the conditions for merging
        while(l<left_size && r<right_size){

            if(left_arr[l]<right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else{
                arr[i++] = right_arr[r++];
            }
        }
        while(l<left_size){
            arr[i++] = left_arr[l++];
        }
        while(r<right_size){
            arr[i++] = right_arr[r++];
        }
    }
}
