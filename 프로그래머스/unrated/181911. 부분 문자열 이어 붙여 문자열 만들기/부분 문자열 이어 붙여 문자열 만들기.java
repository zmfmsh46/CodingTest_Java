class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < parts.length; i++){
            stringBuffer.append(my_strings[i].substring(parts[i][0],parts[i][1] + 1));
        }
        return stringBuffer.toString();
    }
}