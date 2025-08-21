class Solution {
    public List<Integer> partitionLabels(String s) {

        Map<Character, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        int max = 0, prev = 0;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, map.get(s.charAt(i)));
            if (i == max) {
                res.add(max - prev + 1);
                prev = max + 1;
            }
        }

        return res;
    }
}