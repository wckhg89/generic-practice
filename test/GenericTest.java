import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 30..
 */
public class GenericTest {


    @Test
    public void 제네릭_리스트_테스트 () {
        List<Product> productList = new ArrayList<>();

        TV tv = new TV();
        Audio audio = new Audio();

        productList.add(tv);
        productList.add(audio);
    }

    @Test
    public void 와일드카드_테스트 () {
        List<TV> tvs = new ArrayList<>();
        List<Audio> audios= new ArrayList<>();
        List<Product> products = new ArrayList<>();

        tvs.add(new TV("tv1"));
        tvs.add(new TV("tv2"));

        printProductList(tvs);

        audios.add(new Audio("audio1"));
        audios.add(new Audio("audio2"));

        printProductList(audios);

        products.add(new TV("tv1"));
        products.add(new TV("tv2"));
        products.add(new Audio("audio1"));
        products.add(new Audio("audio2"));

        printProductList(products);

    }

    public void printProductList (List<? extends Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
