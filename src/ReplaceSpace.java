public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        int P1 = str.length()-1;
        for(int i=0; i<=P1; i++)
            if (str.charAt(i) == ' ')
                str.append("  ");       //增加两个空格

        int P2 = str.length() -1;
        while (P1 >=0 || P2 > P1){      //从后往前替换，节省时间
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);     //当不为空格时把字符移到最后面去
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer i = new StringBuffer("a bc de");

        replaceSpace(i);
        System.out.println(i.toString());
    }
}
