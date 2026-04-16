class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] result = babbling;
        
        String[] allow = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < result.length; i++) {
            for(String allowWord : allow) {
                if(result[i].contains(allowWord)) {
                    result[i] = result[i].replace(allowWord, "#");
                    continue;
                }
            }
        }
        
        for(String word : result) {
            System.out.println(word);
            if(word.contains("#")) {
                word = word.replace("#","");
            }
            if(word == "") answer++;
        }
        
        return answer;
    }
}