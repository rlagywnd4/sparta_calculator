package org.example.calculator.v2;

import java.util.Queue;

public class Calculator {
    private Queue<Integer> results;

    Calculator(Queue<Integer> results) {
        this.results = results;
    }

    public void calculate(char operator, int firstNumber, int secondNumber) {
        switch (operator) {
            case '+':
                System.out.println("결과 : " + (firstNumber + secondNumber));
                results.add((firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("결과 : " + (firstNumber - secondNumber));
                results.add((firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("결과 : " + (firstNumber * secondNumber));
                results.add((firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber != 0) {
                    System.out.println("결과 : " + (firstNumber / secondNumber));
                    results.add((firstNumber / secondNumber));
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                System.out.println("사칙 연산 기호가 아닌 다른 기호를 입력하셨습니다.");

        }
    }

    public Queue<Integer> getResults() {
        return this.results;
    }

    public void setResults(Queue<Integer> results) {
        this.results = results;
    }

    public void removeResult() {
        results.poll();
    }

}
