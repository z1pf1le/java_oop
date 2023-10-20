package classes;

import java.util.Objects;

public class Test1{
    int a;
    int b;

    Test1(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Test1 test1 = (Test1) o;
        return a == test1.a && b == test1.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
