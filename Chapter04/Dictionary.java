package Chapter04;

public class Dictionary {
    private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    
    public static String kor2Eng(String word) {
        String result = null;
        if(word != null) {
            for(int i=0;i<kor.length;i++) {
                if(kor[i].equals(word)) {
                    result = eng[i];
                    break;
                }
                if(i == kor.length - 1) result = null;
            }
                
        }
        return result;
    }
    
   
}
