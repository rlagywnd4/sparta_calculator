package org.example.calculator.v2;

public class Calculator {

    // 연산 결과를 저장하는 컬렉션 타입 필드
    // 사칙연산 수행후, 결과값 반환 메서드 구현
    public int calculate(char operator, int firstNumber, int secondNumber){
        switch (operator) {
            case '+':
                return (firstNumber + secondNumber);
            case '-':
                return  (firstNumber - secondNumber);
            case '*':
                return  (firstNumber * secondNumber);
            case '/':
                if (secondNumber != 0) {
                    return (firstNumber / secondNumber);
                }else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                System.out.println("사칙 연산 기호가 아닌 다른 기호를 입력하셨습니다.");

        }
        return 0;
    }
}
