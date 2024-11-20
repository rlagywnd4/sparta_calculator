package org.example.calculator.v3;

import java.util.Queue;

public class ArithmeticCalculator<T extends Number> {
    private Queue<Double> results;

    ArithmeticCalculator(Queue<Double> results) {
        this.results = results;
    }

    public void calculate(char operator, T firstNumber, T secondNumber) {
        OperatorType operatorType = OperatorType.setOperatorType(operator);
        double result = 0;
        switch (operatorType) {
            case ADD:
                result = firstNumber.doubleValue() + secondNumber.doubleValue();
                System.out.println("결과 : "  + result);
                break;
            case SUBTRACT:
                result = firstNumber.doubleValue() - secondNumber.doubleValue();
                System.out.println("결과 : "  + result);
                results.add(result);
                break;
            case MULTIPLY:
                result = firstNumber.doubleValue() * secondNumber.doubleValue();
                System.out.println("결과 : "  + result);
                results.add(result);
                break;
            case DIVIDE:
                if (secondNumber.doubleValue() != 0) {
                result = firstNumber.doubleValue() / secondNumber.doubleValue();
                System.out.println("결과 : "  + result);
                results.add(result);
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                System.out.println("사칙 연산 기호가 아닌 다른 기호를 입력하셨습니다.");

        }
    }

    public Queue<Double> getResults() {
        return this.results;
    }

    public void setResults(Queue<Double> results) {
        this.results = results;
    }

    public void removeResult() {
        results.poll();
    }


}
