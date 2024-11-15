package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    //        입력
//          양의 정수 입력 받기
//              양의 정수 2개(0 포함)
//          사칙연산 기호 입력받기
//              char 타입의 사칙연산 기호
//        연산 진행
//          사칙연산 기호에 따른 연산 진행
//              switch문으로 연산기호 구분
//          연산 오류 방지
//              예상 오류에 대한 내용 출력
//        결과 출력
//          연산 결과 출력
//        계산 반복
//          반복 여부 입력 받기
//          "exit"입력시 반복 종료
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = scanner.nextInt();
            if (firstNumber < 0) {
                System.out.println("양의 정수를 입력해주세요");
                continue;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = scanner.nextInt();
            if (secondNumber < 0) {
                System.out.println("양의 정수를 입력해주세요");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("결과 : " + (firstNumber + secondNumber));
                    break;
                case '-':
                    System.out.println("결과 : " + (firstNumber - secondNumber));
                    break;
                case '*':
                    System.out.println("결과 : " + (firstNumber * secondNumber));
                    break;
                case '/':
                    if (secondNumber != 0) {
                        System.out.println("결과 : " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    }
                    break;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            isRunning = !scanner.next().equals("exit");

        }

    }
}
