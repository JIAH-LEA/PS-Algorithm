package Programmers_LV1;

public class StringCount {
    //test code
    public static void main(String[] args) {
        StringCount s = new StringCount();
        System.out.println(s.countstring("Hello java"));
    }

    boolean countstring(String s) {
        s = s.toUpperCase();
        int length = s.length(), pCount = 0, yCount = 0;
        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {
                case 'P':
                    pCount++;
                    break;
                case 'Y':
                    yCount++;
                    break;
                default:
                    break;
            }
        }
        // return pCount==yCount?true:false;(불필요했던 나의 원코드)
        return pCount == yCount;
    }
}