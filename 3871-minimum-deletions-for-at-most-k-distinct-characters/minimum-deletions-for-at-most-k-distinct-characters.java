class Solution {
    public int minDeletion(String s, int k) {
        int minDeletion=0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!freq.containsKey(ch)) {
                freq.put(ch, 1);
            } else {
                int temp = freq.get(ch);
                freq.put(ch, temp + 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(freq.values());

        if(pq.size()<k)return 0;

        while(!pq.isEmpty() && pq.size()!=k){
            minDeletion += pq.poll();
        }

        return minDeletion;
    }
}