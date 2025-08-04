class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        boolean a[]=new boolean[k];
        for(int key:map.keySet()){
           if(a[key]==true)
           continue;
            if(key==0)
            {
                if(map.get(key)%2==0)
                count+=map.get(key)/2;
                else 
                return false;
            }else if (k % 2 == 0 && key == k / 2) { 
                if (map.get(key) % 2 == 0)
                    count += map.get(key) / 2;
                else
                    return false;
            } else {
                int k1 = map.get(key);
                int k2 = 0;
                if (map.get(k-key)!=null) {
                    k2 = map.get(k - key);
                    a[k-key]=true;
                }else 
                return false;
                if (k1 != k2)
                    return false;
                count += k1;
            }
            
        }
        if(count==arr.length/2)
        return true;
        else
        return false;
    }
}