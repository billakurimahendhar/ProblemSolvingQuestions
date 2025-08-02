class Solution {
    public int findTheWinner(int n, int k) {
       ArrayList<Integer>arl=new ArrayList<>();
       for(int i=1;i<=n;i++)
       arl.add(i);
       for(int i=0;arl.size()>1;){
         i=(i+k-1)%arl.size();
         arl.remove(i);
       }   
       return arl.get(0);
       }
}