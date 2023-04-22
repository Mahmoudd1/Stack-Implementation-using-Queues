public class main {
    public static void main(String[] args) {
        MyStack s=new MyStack();
       // ["MyStack", "push", "push", "top", "pop", "empty"] test cases
       // [[], [1], [2], [], [], []]
        s.push(1);
        s.push(2);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.empty());

    }
}
