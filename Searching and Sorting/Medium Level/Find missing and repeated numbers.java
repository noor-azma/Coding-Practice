QUESTION LINK - https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
VIDEO LINK - dry run 

========================================================ANSWER=====================================================================================
  
class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        //Filling the hashmap
        for(int i=0; i<n; i++){
            hm.put(arr[i], hm.get(arr[i]) == null ? 1 : hm.get(arr[i])+1);
        }
        
        //finding the element wch is missing
        
        for(int i=1; i<=n; i++){  // ask why are we starting from 1st index and not 0th
            if(!hm.containsKey(i)){
                ans[1] = i;
                break;
             }
        }
        
        //finding the repeated element
        
        for(int i=0; i<n; i++){
            if(hm.get(arr[i]) > 1){
                ans[0] = arr[i];
                
                break;
            }
        }
        
        return ans;
    }
}

=======================================================ONE MORE SOLUTION===================================================================================
  int a=0, b=1;
  int ar[]= new int[2];
  Arrays.sort(arr);

  for(int i=0;i<n-1;i++){
     if( arr[i]==arr[i+1])
     ar[0]=arr[i];
  }  

  for(int i=0;i<n;i++){
     while( b== arr[i])
     b++;
  }

  ar[1]=b;
  return ar;
