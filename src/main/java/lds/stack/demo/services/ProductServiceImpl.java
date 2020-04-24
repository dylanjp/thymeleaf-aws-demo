package lds.stack.demo.services;

import lds.stack.demo.objects.Product;
import lds.stack.demo.objects.ProductCategory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer, Product> productMap;

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> listProducts() {
        return new ArrayList<>(productMap.values());
    }

    private void loadProducts() {

        ProductCategory springIntroCat = new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Porsche Cayman GTS");

        ProductCategory springCoreCat = new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Mid-Engine Chevy Corvette C8");

        ProductCategory springBootCat = new ProductCategory();
        springBootCat.setId(3);
        springBootCat.setCategory("2020 GR Supra");

        ProductCategory thymeleafCat = new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("1969 Ford Mustang Boss 429");

        ProductCategory geapCat = new ProductCategory();
        geapCat.setId(5);
        geapCat.setCategory("Ford GT");

        productMap = new HashMap<>();

        Product springIntro = new Product();
        springIntro.setId(1);
        springIntro.setCarName("Porsche Cayman GTS");
        springIntro.setCarMotto("Insatiable. The new 718 GTS models");
        springIntro.setCarDescription("The 718 GTS models are never satisfied. They always crave more. More heart pounding from the start. More corners per kilometre. And more adrenaline with every metre. With an uprated midmounted engine and a chassis unfazed by any hairpin turn. Their power follows an upward path, their design looks forwards: with sharpened forms, honed lines, exquisite materials.\n" +
            "\n" +
            "The 718 GTS models are the embodiment of forward thrust – even when stationary. Thanks to a sharpened design language and accents in black. The rear is clearly contoured and looks wide and imposing due to the rear apron and the centrally positioned sports tailpipes in black. The LED taillights are tinted, the model logo is also finished in black.\n");
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("cayman.jpg");
        springIntro.getProductCategories().add(springIntroCat);
        springIntro.getProductCategories().add(springBootCat);
        productMap.put(1, springIntro);


        Product springCoreUltimate = new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCarName("Mid-Engine Chevy Corvette C8");
        springCoreUltimate.setCarMotto("A mid-engine masterpiece");
        springCoreUltimate.setCarDescription("This all-new mid-engine sports car is so much more than Next Generation – it’s next level. At once precise and powerful, the Corvette Stingray has been completely redesigned from the ground up to deliver a thrill on every drive. And with a starting price of $59,995†, the 2020 Stingray brings power to the people. $73,885† as shown." +
            "When you completely reimagine a car as iconic as Corvette, you get a beautifully sculpted mid-engine sports car that makes a powerful statement. Not your everyday car, but a car you want to drive every day. And with aerodynamic components integrated throughout, its gorgeous form is functional.");
        springCoreUltimate.setPrice(new BigDecimal("199"));
        springCoreUltimate.setImageUrl("c8.jpg");
        springCoreUltimate.getProductCategories().add(springCoreCat);
        springCoreUltimate.getProductCategories().add(springBootCat);
        productMap.put(2, springCoreUltimate);

        Product thymeleaf = new Product();
        thymeleaf.setId(3);
        thymeleaf.setCarName("2020 GR Supra");
        thymeleaf.setCarMotto("The legend. Reborn");
        thymeleaf.setCarDescription("Only the lucky few will get the opportunity to own the GR Supra Launch Edition. Limited to just 1500 units—and available in Renaissance Red 2.0, Nocturnal black or Absolute Zero white—each of these cars comes standard with red mirror caps, unique matte-black wheels, red seats, carbon-fiber interior trim, and an individually numbered interior badge with Akio Toyoda's signature. 62");
        thymeleaf.setPrice(new BigDecimal("199"));
        thymeleaf.setImageUrl("supra.jpg");
        thymeleaf.getProductCategories().add(thymeleafCat);
        productMap.put(3, thymeleaf);

        Product springCore = new Product();
        springCore.setId(4);
        springCore.setCarName("1969 Ford Mustang Boss 429 FastBack");
        springCore.setCarMotto("Timeless Classic");
        springCore.setCarDescription("The Boss 429 is recognized as being among some of the most rare and highly valued muscle cars to date. In total there were 1358 original Boss 429s made. The origin of the Boss 429 was to fulfill Ford's need to homologate the 429 semi-hemispherical engine for NASCAR racing. Ford was seeking to develop an engine that would better compete with the 426 Hemi from Chrysler in NASCAR's Grand National Division, now known as the Monster Energy Cup Series. NASCAR's homologation rules required that at least 500 cars be fitted with this motor and sold to the general public. After much consideration, it was decided by Ford that the Mustang would be the car that would house this new engine.");
        springCore.setPrice(new BigDecimal("199"));
        springCore.setImageUrl("boss429.jpg");
        springCore.getProductCategories().add(springCoreCat);
        springCore.getProductCategories().add(springBootCat);
        productMap.put(4, springCore);

        Product springCoreAdv = new Product();
        springCoreAdv.setId(5);
        springCoreAdv.setCarName("Ford GT");
        springCoreAdv.setCarMotto("Super light. Super Strong. You've Never Seen Anything Like This Before");
        springCoreAdv.setCarDescription("Competition makes everyone stronger. The Ford GT is feared on the track thanks to wins all the way to Le Mans. And since that sort of thing winds up in the rest of our vehicles, we win races off the track as well. This is what true innovation looks like. From its 3.5L EcoBoost® technology to its ultra-efficient aerodynamics, the Ford GT is the culmination of everything great we do at Ford. And it’s the same passion for innovation that can be seen throughout our entire vehicle lineup.");
        springCoreAdv.setPrice(new BigDecimal("199"));
        springCoreAdv.setImageUrl("ford.jpg");
        springCoreAdv.getProductCategories().add(springCoreCat);
        springCoreAdv.getProductCategories().add(springBootCat);
        productMap.put(5, springCoreAdv);

        Product springCoreDevOps = new Product();
        springCoreDevOps.setId(6);
        springCoreDevOps.setCarName("Honda CB1000R Neo Sports Cafe");
        springCoreDevOps.setCarMotto("Performance has a style all it's own");
        springCoreDevOps.setCarDescription("An inline-four streetbike is truly a thing of beauty. It’s all business, and you never get tired looking at it. Simply put, the Honda CB1000R is the best open-class naked streetfighter we’ve ever produced. It has cutting-edge Neo-Sports Café styling, and a high-revving 998cc four-cylinder engine that’s specially tuned for midrange and top-end power. All in all, the CB1000R is light, powerful, responsive and an absolute blast to ride. So get ready to get noticed, on our 2019 CB1000R.");
        springCoreDevOps.setPrice(new BigDecimal("199"));
        springCoreDevOps.setImageUrl("honda.jpg");
        springCoreDevOps.getProductCategories().add(springCoreCat);
        springCoreDevOps.getProductCategories().add(springBootCat);
        productMap.put(6, springCoreDevOps);
    }
}
