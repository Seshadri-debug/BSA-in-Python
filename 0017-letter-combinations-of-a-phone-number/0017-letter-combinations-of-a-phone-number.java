class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits.length() == 0) {
            return combinations;
        }
          String[] digitMapping = new String[]{
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };

        backtrack(0, new StringBuilder(), digits, digitMapping, combinations);

        return combinations;
    }

   
    private void backtrack(int index, StringBuilder path, String digits, String[] letters, List<String> combinations) {
        
        if (path.length() == digits.length()) {
           
            combinations.add(path.toString());
            return; 
        }

        String possibleLetters = letters[digits.charAt(index) - '0'];

        if (possibleLetters != null) {
            for (int i = 0; i < possibleLetters.length(); i++) {
               
                path.append(possibleLetters.charAt(i));
               
                backtrack(index + 1, path, digits, letters, combinations);
                
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}