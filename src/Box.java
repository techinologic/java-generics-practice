/**
 * Created by Paopao on 08/11/17.
 */
public class Box<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public <U> void inspect() {

    }
}
