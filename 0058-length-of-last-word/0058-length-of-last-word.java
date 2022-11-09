class Solution {
    public int lengthOfLastWord(String s) {
        String[] string = s.split(" ");
        return string[string.length - 1].length();
    }
}