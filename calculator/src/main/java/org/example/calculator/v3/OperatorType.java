package org.example.calculator.v3;

// 연산자 타입과 연산 기능을 포함
// calculator에서 어떤 연산을 할지 나누기만 진행
public enum OperatorType {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), ERROR('e');
//    ADD ('+'){
//        @Override
//        public int operate(int x, int y) {
//            System.out.println("결과 : " + (x + y));
//            return x + y;
//        }
//    },
//    SUBTRACT('-') {
//        @Override
//        public int operate(int x, int y) {
//            System.out.println("결과 : " + (x - y));
//
//            return x - y;
//        }
//    },
//    MULTIPLY('*') {
//        @Override
//        public int operate(int x, int y) {
//            System.out.println("결과 : " + (x * y));
//            return x * y;
//        }
//    },
//    DIVIDE('/') {
//        @Override
//        public int operate(int x, int y) {
//            System.out.println("결과 : " + (x / y));
//            return x / y;
//        }
//    };
//
    private final char operator;
//
    OperatorType(char operator) {
        this.operator = operator;
    }
//
//    public abstract int operate(int x, int y);
public static OperatorType setOperatorType(char operatorType){
    for (OperatorType op : OperatorType.values()) {
        if (op.operator == operatorType) {
            return op;
        }
    }
    return ERROR;
}

}
