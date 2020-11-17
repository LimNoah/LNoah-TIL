package Sources;
/**
 * 공변 반환 타입 (Covariant return type)
 */

class Foo3 {
    public Foo3 getInstance() {
        return this;
    }
}

class Bar3 extends Foo3 {
    @Override
    public Bar3 getInstance() { // 오버라이딩이지만, 리턴 타입이 달리질 수 있다.
        return this;
    }
}

public class Poly_03 {
}
