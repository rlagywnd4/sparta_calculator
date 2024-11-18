package org.example.calculator.v1;

import java.util.Scanner;

public class Calculator {
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
                default:
                    System.out.println("사칙 연산 기호가 아닌 다른 기호를 입력하셨습니다.");
                    continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            isRunning = !scanner.next().equals("exit");

        }

    }
}
