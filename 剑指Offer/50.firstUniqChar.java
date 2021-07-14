// class Solution {
//     public char firstUniqChar(String s) {
//         Map<Character, Integer> freq = new HashMap<Character,Integer>();
//         for(char ch : s.toCharArray()){
//             freq.put(ch,freq.getOrDefault(ch,0)+1);
//         }
//         for(int i = 0;i<s.length();++i){
//             if(freq.get(s.charAt(i))==1){
//                 return s.charAt(i);
//             }
//         }
//         return ' ';
//     }
// }

class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc)
            dic.put(c, !dic.containsKey(c));
        for (char c : sc)
            if (dic.get(c))
                return c;
        return ' ';
    }
}
