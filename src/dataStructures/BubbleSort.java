package dataStructures;

public class BubbleSort {
    public  int Sorting(int[]sort, int n){
        int i, s, temp;
        for(i=0; i<sort.length; i++){
            for (s=i+1; s<=sort.length-1; s++){
                if(sort[i]<=sort[s]){
                    //swap
                    temp = sort[s];
                    sort[s] = sort[i];
                    sort[i] = temp;

                }
            }
        }
        return Sorting(sort,n);
    }
    public static void main(String [] args){
        
        int Arr[] = {3,5,6,7,2,4};
        int temp = Arr.length, res;

        BubbleSort obj = new BubbleSort();
        res = obj.Sorting(Arr,temp);
        System.out.println(res);
    }
}
