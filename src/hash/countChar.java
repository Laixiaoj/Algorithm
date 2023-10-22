package hash;

// 赎金信：在 magazine 中能找到 ransomNote 【数组 作为 Hash】
public class countChar {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] record = new int[26]; // 使用数组哈希表保存

        for(char i : magazine.toCharArray())
            record[i - 'a'] += 1; // 统计magazine字符

        for(char i : ransomNote.toCharArray())
            record[i - 'a'] -= 1; // 统计ransomNote字符

        for(int i : record){
            if(i < 0)  return false; // 若magazine字符不够用
        }
        return true;
    }
}


