package Sources;

/**
 * 멤버 변수의 재정의는 선언된 객체의 타입을 따른다. (문법적으로 본다)
 * 메소드 오버라이딩은 메모리상의 객체 타입을 따른다. (실제 객체로 본다)
 *   (가상 메소드 호출; Virtual method call)
 */

class Foo2 {
    static public String y = "Super Class";
    public String x = "Super";

    public void methodA() {
        System.out.println("Super Method");
    }
}

class Bar2 extends Foo2 {
    static public String y = "Sub Class";
    public String x = "Sub";

    @Override
    public void methodA() {
        System.out.println("Sub Method");
    }
}

public class Poly_02 {
    public static void main(String[] args) {
        Bar2 bar2 = new Bar2();
        Foo2 foo2 = (Foo2) bar2;

        System.out.println(bar2.x); // Sub
        bar2.methodA(); // Sub Method

        System.out.println(foo2.x);
        foo2.methodA(); // virtual method call

        System.out.println(Foo2.y);
        System.out.println(Bar2.y);

        System.out.println(foo2.y);
        System.out.println(bar2.y);


    }
}