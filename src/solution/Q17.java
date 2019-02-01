package solution;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * @author foxleezh
 * @date 2019-02-01.
 */
public class Q17 extends BaseQustion{

    String Number[] = { "","","abc","def"
            ,"ghi" ,"jkl" ,"mno"
            ,"pqrs" ,"tuv" ,"wxyz" };

    List<String>t=new ArrayList<>();
    String tt="";

    /**
     * 解题思路：看到这题我们首先可能会想到直接遍历就行，但写的过程会发现每次遍历次数不一样，这就只能用递归了
     *
     */
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
        {
            if(!"".equals(tt)) {
                t.add(tt);
            }
            return t;
        }
        for (int i = 0; i < Number[digits.charAt(0) - '0'].length(); i++)
        {
            String ts = tt;
            tt = tt + Number[digits.charAt(0)-'0'].charAt(i);
            letterCombinations(digits.substring(1, digits.length()));
            tt = ts;
        }
        return t;
    }



    @Override
    public void solution() {
        System.out.println(letterCombinations("223"));
    }
}
