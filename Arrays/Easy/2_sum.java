/*
Brute: 2 nested loops to keep track of sum of every 2 combination of all array elements till we find target.
Time = Quadratic, Space = constant

Better: Sort the array. Then consider 2 pointers, one from begining (i), other from the end (j). add sum=i+j, 
if the sum < target, i++. If sum > target, j--. If sum equals target while i<j then true, else false.
Time = O(NlogN)+O(N), Space = constant

Optimal: No need to sort the array, insted let us do time/space trade off. 
Let us consider a HashSet to store the complement of each element with the target (target-arr[i]) as we traverse. 
We keep on checking that if the complement is already present inside the set, if yes then true (we found the 2 sum pair), 
else add the complement to the set. return false if the loop ends
Time = O(N), Space = O(N)
*/

int[] arr = {1,5,2,7,9,3,6};
int target = 5;
Set<Integer> st = new HashSet<>();
for(int i=0; i<arr.length; i++){
  int comp = target - arr[i]; //comp=complement
  if(st.contains(comp)){
    return true;
  }
  else{
    st.add(comp);
  }
}
return false;

