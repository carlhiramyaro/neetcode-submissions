class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 
        // Hashhmap to count the appearance of each number in the array(counter)
        // init a bucket(initiate an array of arrayList)
        // for each number in the counter append the number to the array at its index in bucket
        // iterate through bucket in the reverse order appending a result list until its length equals k 

        HashMap<Integer, Integer> counter = new HashMap<>();

        for(Integer num:nums){
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        // System.out.println(counter);

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i ++){
            buckets.add(new ArrayList<>());
        }

        for(Integer number:counter.keySet()){
            buckets.get(counter.get(number)).add(number);
        }

        // System.out.println(buckets.toString());


        int[] res = new int[k];
        int index = 0;
        for(int i = buckets.size() - 1; i >= 0; i --){
            for(int number: buckets.get(i)){
                res[index] = number;
                index ++;
                if (index == k){
                    return res;
                }

            }



        }
        return null;

        
    }
}
