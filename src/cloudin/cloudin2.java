package cloudin;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Li on 2018/7/30.
 */
public class cloudin2 {

    public static void main(String[] args) {
        /*判断字符串是否相识，如"aaab","baaa"相识，"aaac"、"aaad"不相识相识*/
        String str1 = "aaac";
        String str2 = "baaa";

        String sortedStr1 = sortStr(str1);
        String sortedStr2 = sortStr(str2);
        if (sortedStr1.equals(sortedStr2)){
            System.out.println("相识");
        }else {
            System.out.println("不相识");
        }
    }

    private static String sortStr(String str) {
        char[] charArr = str.toCharArray();
        String result = null;
        char temp;
        for (int i = 0; i < charArr.length-1; i++) {
            for (int j = 0;j< charArr.length-i-1;i++){
                if (charArr[i]>charArr[i+1]){
                  temp = charArr[i];
                  charArr[i] = charArr[i+1];
                  charArr[i+1] = temp;
                }
            }
        }

        result = String.valueOf(charArr);

        return result;
    }

}
