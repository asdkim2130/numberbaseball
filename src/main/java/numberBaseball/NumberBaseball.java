package numberBaseball;

import java.util.ArrayList;
import java.util.Scanner;

import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;


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
//            int computerNumber1 = 1;
//            int computerNumber2 = 2;
//            int computerNumber3 = 3;
            int strike = 0;
            int ball = 0;

            //컴퓨터 입력을 변수에서 리스트로
            ArrayList<Integer> computerNumber = new ArrayList<>();
            computerNumber.add(1);
            computerNumber.add(2);
            computerNumber.add(3);

            //사용자 입력 리스트로
            ArrayList<Integer> userNumber = new ArrayList<>();

            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            userNumber.add(scanner.nextInt());
            System.out.print("두 번째 숫자를 입력하세요: ");
            userNumber.add(scanner.nextInt());
            System.out.print("세 번째 숫자를 입력하세요: ");
            userNumber.add(scanner.nextInt());


            //스트라이크 카운트
//            if(computerNumber.get(0) == user1){
//                strike++;
//            }if(computerNumber.get(1) == user2){
//                strike++;
//            }if(computerNumber.get(2) == user3){
//                strike++;
//            }

            // 스트라이크 카운트 반복문으로 변경
            for (int i = 0; i < 3; i++) {
                if(computerNumber.get(i) == userNumber.get(i)){
                    strike++;
                }

//            //볼 카운트
            if(computerNumber.get(0) == userNumber.get(2) || computerNumber.get(0) == userNumber.get(3)){
                ball++;
            }if(computerNumber.get(1) == userNumber.get(1) || computerNumber.get(1) == userNumber.get(3)){
                ball++;
            }if(computerNumber.get(2) == userNumber.get(1) || computerNumber.get(2) == userNumber.get(2)){
                ball++;
            }


            System.out.println(strike + " 스트라이크 " + ball + " 볼");


            //브레이크
            if(strike == 3){break;}


        }   // 결과출력
        System.out.println("축하합니다! 정답을 맞히셨습니다.");
    }
}