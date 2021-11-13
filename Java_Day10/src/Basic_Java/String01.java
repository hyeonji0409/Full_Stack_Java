package Basic_Java;

public class String01 {
    public static void main(String[] args) {
        String jumin = "990409-211112";

        // 문제1) 나이 출력
        // 앞의 두 자리 가져오기
        String strAge = jumin.substring(0,2);
        System.out.println(strAge);

        // 적당한 년도 형태로 변환
        int birthYear = Integer.parseInt(strAge);
        birthYear += 1900;
        System.out.println(birthYear);

        // 나이는 현재 년도(2021 - 출생년도 + 1)
        int age = 2021 - birthYear + 1;
        System.out.println(age);

        // 문제 2) 성별 출력
        // 1,3 = 남자, 2,4 = 여자
        String strSex = jumin.substring(7,8);
        System.out.println(strSex);

        int sex = Integer.parseInt(strSex);
        if(sex == 1 || sex == 3) System.out.println("남자입니다.");
        else if(sex == 2 || sex == 4) System.out.println("여자입니다.");


    }
}
