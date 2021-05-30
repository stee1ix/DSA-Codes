class TwoStacks {
    int cap;
    int top1, top2;
    int a[];

    TwoStacks(int n) {
        cap = n;
        a = new int[n];
        top1 = -1;
        top2 = cap;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {  // means if there at least one gap in between
            top1++;             // -1   0 1 2 3 4 5   6
            a[top1] = x;        //            1 g 2
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            a[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = a[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2() {
        if (top2 < cap) {
            int x = a[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
}

class TwoStacksInAnArray {
    public static void main(String[] args) {
        TwoStacks t = new TwoStacks(5);
        t.push1(5);
        t.push2(10);
        t.push2(15);
        t.push1(11);
        t.push2(7);
        System.out.println("Popped element from stack1 is: " + t.pop1());
        t.push2(40);
        System.out.println("Popped element from stack2 is: " + t.pop2());
        System.out.println("Popped element from stack2 is: " + t.pop2());
        System.out.println("Popped element from stack2 is: " + t.pop2());
        System.out.println("Popped element from stack2 is: " + t.pop2());
        System.out.println("Popped element from stack2 is: " + t.pop2());
    }
}
