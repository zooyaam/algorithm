class Solution {
    public int solution(String skill, String[] skill_trees) {
        int cnt = 0;
        
        for (int i = 0; i < skill_trees.length; i++) {
            String tree = skill_trees[i].replaceAll("[^" + skill + "]", "");
            
            if (skill.startsWith(tree)) cnt++;
        }
        
        return cnt;
    }
}