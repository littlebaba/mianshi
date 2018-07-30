package cloudin;

/**
 * @author Li on 2018/7/30.
 */
public class cloudin1 {
    public static void main(String[] args) {
        /*输入带有"b"，"ac"的字符串，然后输入剔除掉这些字符的字符串，如"ababc"*/
        String str1 = "abad";
        String str2 = "abdac";
        String str3 = "ababc";

        String[] initStrArr = str1.split("");
        StringBuilder initSB = new StringBuilder();
        StringBuilder addB = new StringBuilder();
        for (int i = 0;i<initStrArr.length;i++){
            if (initStrArr[i].equals("b")){
                initSB.append("");
                addB.append("b");
            }else {
                initSB.append(initStrArr[i]);
            }
        }
        initSB.append(addB);



        String[] strArray = initSB.toString().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("b")) {
                sb.append("");
            }else if (strArray[i].equals("a")&&strArray[i+1].equals("c")){
                sb.append("");
                i++;
            }else {
                sb.append(strArray[i]);
            }
        }

        System.out.println(sb);
    }
}
