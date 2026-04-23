class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String> > H = new HashMap<>();
        for( String st : strs){
            String cur = st;
            char arr[] = st.toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            if(!H.containsKey(str)){

             H.put(str, new ArrayList<>());
            }
            H.get(str).add(cur);
            

        }
       // System.out.println(H);
        return new ArrayList<>(H.values());

       
    
        }
}