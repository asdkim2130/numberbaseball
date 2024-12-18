package numberBaseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
            int strike = 0;
            int ball = 0;


            // 랜덤으로 컴퓨터 입력 받기
            // random을 쓰면 중복의 가능성이 있기 때문에 1~9까지 숫자로 pool 리스트를 만든 후 순서를 섞어서
            // computerNumber 리스트로 가져온다
            ArrayList<Integer> numberPool = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8)
            );
            Collections.shuffle(numberPool);

            ArrayList<Integer> computerNumber = new ArrayList<>();
            computerNumber.add(numberPool.get(0));
            computerNumber.add(numberPool.get(1));
            computerNumber.add(numberPool.get(2));


            //사용자 입력 리스트로
            ArrayList<Integer> userNumber = new ArrayList<>();

            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            userNumber.add(scanner.nextInt());
            System.out.print("두 번째 숫자를 입력하세요: ");
            userNumber.add(scanner.nextInt());
            System.out.print("세 번째 숫자를 입력하세요: ");
            userNumber.add(scanner.nextInt());



            // 스트라이크 카운트 반복문으로 변경
            for (int i = 0; i < 3; i++) {
                if (computerNumber.get(i) == userNumber.get(i)) {
                    strike++;
                }
            }


            //볼 카운트 반복문으로 변경
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == k) {
                        continue;
                    }
                    if (computerNumber.get(j) != computerNumber.get(k)) {
                        ball++;
                    }
                }
            }

            //결과 출력
            printResult(strike, ball);


            //브레이크
            if (strike == 3) {
                break;
            }
        }

        }

        // 결과출력 함수
        static void printResult ( int strike, int ball){
            if (strike == 0 && ball == 0) {
                System.out.println("아웃!");
            } else if (strike == 3) {
                System.out.println("축하합니다! 정답을 맞히셨습니다.");
            } else System.out.println(strike + " 스트라이크 " + ball + " 볼");


        }


    }

