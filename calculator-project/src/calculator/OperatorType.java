package calculator;

public enum OperatorType {
    ADD('+') {
        @Override
        public double apply(double a, double b) { return a + b; }
    },
    SUBTRACT('-') {
        @Override
        public double apply(double a, double b) { return a - b; }
    },
    MULTIPLY('*') {
        @Override
        public double apply(double a, double b) { return a * b; }
    },
    DIVIDE('/') {
        @Override
        public double apply(double a, double b) { return a / b; }
    };

    private final char symbol;

    OperatorType(char symbol) { this.symbol = symbol; }

    public abstract double apply(double a, double b);

    public char getSymbol() { return symbol; }

    // 문자로부터 Enum 찾기
    public static OperatorType fromChar(char ch) {
        for (OperatorType op : values()) {
            if (op.symbol == ch) return op;
        }
        throw new IllegalArgumentException("잘못된 연산자 입력: " + ch);
    }
}

