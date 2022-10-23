public class MyGenericClass <Type extends Number, Type2 extends Number> {
    Type x;
    Type2 y;

    MyGenericClass(Type x, Type2 y) {
        this.x = x;
        this.y = y;
    }

    public Type2 getValue() {
        return y;
    }
}
