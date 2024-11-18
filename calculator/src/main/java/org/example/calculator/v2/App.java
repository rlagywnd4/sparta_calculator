package org.example.calculator.v2;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(new LinkedList<>());

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

            calculator.calculate(operator, firstNumber, secondNumber);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            isRunning = !scanner.next().equals("exit");

        }

    }
}
