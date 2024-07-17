//Time: O(nlog(n))
//Space: O(n)
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
            else
                mp.put(ch,1);
        }
        List<Character> list=new ArrayList<>(mp.keySet());
        Collections.sort(list, (a,b) -> mp.get(b)-mp.get(a));
        StringBuilder sb=new StringBuilder();

        for(Character ch: list){
            for(int i=0;i<mp.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
