/**
 * Created by kanghonggu on 2017. 5. 30..
 */
public class Person <T, S> {
    public T info;
    public S id;

    public Person() {
    }

    public Person(T info, S id) {
        this.info = info;
        this.id = id;
    }

    public <U> void printInfo (U info) {
        System.out.println(info);
    }

}
