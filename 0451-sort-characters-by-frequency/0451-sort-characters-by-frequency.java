class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
            (a,b) -> b.getValue() - a.getValue()
            
        );

        pq.addAll(freq.entrySet());

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return sb.toString();
    
    }
}