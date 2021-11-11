package Standard_Java;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class Subject {
    String name;
    int score;
}

class Student{
    static int stdCnt = 0;

    String name;
    Subject[] subjectArray;
}


public class ClassArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // # 학생 추가 삭제 컨트롤러
        //   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
        //   김준면 : 과목3개 수학 50 국어50 영어 60
        //   김민석 : 과목2개 수학 20 국어 30
        //   도경수 : 과목1개 수학 100

        Student[] stdList = new Student[3];
        int stdCnt = 0;    // 학생 수

        while (true) {
            // 내용 먼저 출력
            // 클래스 변수는 클래스 통해서 접근 가능
//            System.out.println(Student.stdCnt);

            for (int i = 0; i < Student.stdCnt; i++) {
                System.out.println("["+i + 1 + "] "+ stdList[i].name +" 학생");

                if (stdList[i].subjectArray != null) {
                    for (int j = 0; j < stdList[j].subjectArray.length; j++) {
                        System.out.println(i + 1 + " 과목 = " + stdList[i].subjectArray[j].name + ", "
                                + stdList[i].subjectArray[j].score + "점");
                    }
                }
                System.out.println();
            }

            System.out.println("[1]학생 추가하기");        // 이름 입력받아 추가
            System.out.println("[2]과목 추가하기");        // 이름과 과목 입력받아 추가
            System.out.println("[3]성적 추가하기");        // 이름과 과목 그리고 성적 입력받아 추가
            System.out.println("[4]종료하기");

            System.out.print("선택: ");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("이름 입력");
                String name = scan.next();

                stdList[Student.stdCnt] = new Student();
                stdList[Student.stdCnt].name = name;
                Student.stdCnt++;
            }
            else if (choice == 2) {
                int number = 0;
                for(Student stu:stdList){
                    if(stu != null) System.out.println("["+number+1+"] "+stu.name);
                }
                System.out.print("학생 선택: ");
                int select = scan.nextInt();
                select--;

                System.out.print("과목 입력: ");
                String subject = scan.next();
                if(stdList[select].subjectArray == null) {
                    // 과목 객체를 저장하기 위한 배열을 먼저 생성
                    stdList[select].subjectArray = new Subject[1];

                    // 과목 객체를 생성해서 배열에 저장
                    stdList[select].subjectArray[0] = new Subject();
                    stdList[select].subjectArray[0].name = subject;
                }
                else{
                    // 과목에 대한 정보를 저장하는 배열이 이미 있다면 뒤에 추가
                    // 배열의 크기를 확인
                    int size = stdList[select].subjectArray.length;

                    // 기존의 값을 다시 가져오는 작업(임시 메모리를 만들어서 가져오기)
                    Subject [] imsi = stdList[select].subjectArray;

                    // 과목을 저장할 배열의 크기를 늘려주기 위한 작업. (배열을 재정의)
                    // -> 기존의 내용이 사라진다는 단점이 존재 (기존의 내용을 다시 넣어서 유지하는 작업 필요)
                    stdList[select].subjectArray = new Subject[size+1];

                    // 기존의 과목 정보를 새로운 배열로 복사
                    for(int i = 0; i<size;i++){
                        stdList[select].subjectArray[i] = imsi[i];
                    }

                    // 새로 입력받은 과목 정보를 맨 마지막에 추가
                    stdList[select].subjectArray[size] = new Subject();
                    stdList[select].subjectArray[size].name = subject;
                }
            }
            else if (choice == 3) {}

        }

    }
}

