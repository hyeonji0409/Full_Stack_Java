public class StringOperator {
    public static void main(String[] args) {
        String str = "hello java";

        System.out.println(str.length());

        System.out.println(str.isEmpty());

        System.out.println(str.equals("hello java"));

        // subString: 문자열 자를 때 사용(문자열 내에서 원하는 만큼만 잘라낼 때)
        System.out.println(str.substring(7,10));

        //split: 문자열을 분리(구분자)
        System.out.println(str.split(" ")[0]);
        System.out.println(str.split(" ")[1]);

        // trim: 문자열의 앞/뒤 공백을 제거 (중간의 공백은 제거되지 X)
        str = "       Hello    Java";
        System.out.println(str.trim());
    }
}
