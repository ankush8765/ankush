class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        List<Character>[] arr = new ArrayList[s.length() + 1];
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        map.keySet().forEach(
                c -> {
                    if (arr[map.get(c)] == null)
                        arr[map.get(c)] = new ArrayList<>();
                    arr[map.get(c)].add(c);
                });
        for (int i = s.length(); i > 0; i--) {
            if (arr[i] != null) {
                for (char c : arr[i]) {
                    for (int j = 0; j < i; j++) {
                        ans.append(c);
                    }
                }
            }
        }
        return ans.toString();
    }
}