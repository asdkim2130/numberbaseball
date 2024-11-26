package numberBaseball;

import java.util.ArrayList;
import java.util.Scanner;




public class NumberBaseball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 게임 진행에 필요한 변수들을 선언합니다
        // 스트라이크 개수
        // 볼 개수
        boolean isCorrect = false; // 정답 여부

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        while (!isCorrect) {
            //변수
            int computerNumber1 = 1;
            int computerNumber2 = 2;
            int computerNumber3 = 3;
            int strike = 0;
            int ball = 0;

            // 사용자 입력 받기 (이 부분은 미리 제공됨)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();


            //스트라이크 카운트
            if(computerNumber1 == user1){
                strike++;
            }if(computerNumber2 == user2){
                strike++;
            }if(computerNumber3 == user3){
                strike++;
            }


            //볼 카운트
            if(computerNumber1 == user2 || computerNumber1 == user3){
                ball++;
            }if(computerNumber2 == user1 || computerNumber2 == user3){
                ball++;
            }if(computerNumber3 == user1 || computerNumber3 == user2){
                ball++;
            }

            System.out.println(strike + " 스트라이크 " + ball + " 볼");


            //브레이크
            if(strike == 3){break;}


        }   // 결과출력
        System.out.println("축하합니다! 정답을 맞히셨습니다.");
    }
}