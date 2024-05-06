package P8;

public class Postfix13 {
    public int n;
    public int top;
    char[] stack;

    public Postfix13(int total) {
        this.n = total;
        this.top = -1;
        this.stack = new char[n];
        push('(');
    }

    public void push(char c) {
        this.top++;
        this.stack[this.top] = c;
    }

    public char pop() {
        char item = this.stack[this.top];
        this.top--;
        return item;
    }

    public boolean IsOperand(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.';
    }

    public boolean IsOperator(char c) {
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    public int derajat (char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi (String Q) {
        String P = "";
        char c;

        for (int i = 0; i < this.n; i++) {
            c = Q.charAt(i);
            if (this.IsOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                this.push(c);
            }

            if (c == ')') {
                while (this.stack[this.top] != '(') {
                    P = P + this.pop();
                }
                this.pop();
            }

            if (this.IsOperator(c)) {
                while (derajat(this.stack[this.top]) >= derajat(c)) {
                    P = P + this.pop();
                }
                push(c);
            }
        }

        return P;
    }
}
