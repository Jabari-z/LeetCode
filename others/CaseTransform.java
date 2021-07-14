package others;
// 请设计并实现一个caseTransform函数，使得一个字符串str可以被方便地转成四种形式，并且将四种形式通过空格拼接成一个字符串返回
// 为方便起见，这里假设输入字符串全部符合以上四种形式的英文字母组合
public class CaseTransform {

    /**
     *  - 全部首字母大写
        - 第一个单词首字母小写，其余单词首字母大写
        - 单词全部小写，由下划线连接
        - 单词全部小写，由减号连接
    PascalCaseTest  pascalCaseTest  pascal_case_test pascal-case-test

     */

    private int getNumOfWord(String name){
        int n = 0;
        for (char c : name.toCharArray()) {
            if(c>=65&&c<=90){
                n++;
            }
        }
        return n==0?1:n;
    }

    public String toCamel(String name){
        //  第一步 判断 是一个单词 还是两个单词
        int n = getNumOfWord(name);
        // 一个单词直接返回
        if(n==1) return name;
        //其他 第一个字母变小写
        return name.substring(0,1).toLowerCase()+name.substring(1);
    }    
    public String toSubLine(String name){
        //  第一步 判断 是一个单词 还是两个单词
        int n = getNumOfWord(name);
        // 一个单词直接返回
        if(n==1) return name;
        // 其他
        StringBuilder sb = new StringBuilder();
        int wordStart = 0;
        for (int i = 1; i < name.length(); i++) {
            if(name.charAt(i)>=65&&name.charAt(i)<=90){
                if(wordStart==0){
                    sb.append(name.substring(wordStart, i).toLowerCase());
                }else{
                    sb.append('-');
                    sb.append(name.substring(wordStart, i).toLowerCase());
                }
                wordStart=i;
                
            }
        }
        // 最后一个单词
        sb.append('-');
        sb.append(name.substring(wordStart).toLowerCase());
        return sb.toString();
    }
    public String toDashLine(String name){
        //  第一步 判断 是一个单词 还是两个单词
        int n = getNumOfWord(name);
        // 一个单词直接返回
        if(n==1) return name;
        // 其他
        StringBuilder sb = new StringBuilder();
        int wordStart = 0;
        for (int i = 1; i < name.length(); i++) {
            if(name.charAt(i)>=65&&name.charAt(i)<=90){
                if(wordStart==0){
                    sb.append(name.substring(wordStart, i).toLowerCase());
                }else{
                    sb.append('_');
                    sb.append(name.substring(wordStart, i).toLowerCase());
                }
                wordStart=i;
                
            }
        }
        // 最后一个单词
        sb.append('_');
        sb.append(name.substring(wordStart).toLowerCase());
        return sb.toString();
    }

    public static void main(String[] args) {
        CaseTransform ctm = new CaseTransform();
        System.out.println(ctm.toCamel("PascalCaseTest"));
        System.out.println(ctm.toSubLine("PascalCaseTest"));
        System.out.println(ctm.toDashLine("PascalCaseTest"));
    }
    
}
