import java.util.Comparator;
import java.util.List;

public class ExaminationPage<result> {
    List<Model> mobile = List.of(new Model("Mobile", "realme c11", 7499, 4.4),
            (new Model("Mobile", "Redmi note 7s", 12999, 4.1)),
            (new Model("Mobile", "Iphone 10", 99999, 4.5)),
            (new Model("Mobile", "Samsung S10", 56999, 4.9))
    );

    List<Model> electronics = List.of(new Model("Laptop", "Yoga I1S", 155990, 4.9),
            (new Model("Laptop", "Acer i7", 39990, 4.2)),
            (new Model("Desktop", "HP CoreI7", 49999, 4.7)),
            (new Model("Desktop", "Dell CoreI3", 145432, 3.5)));

    public void mobile(){

        fulldata();
        mobile.stream()
                //  .map(mob -> mob.getBrand())
                .forEach(n -> System.out.println(n.getBrand() +", "+ n.getPrice() +", "+ n.getRating()));

        sortByPrice();
        mobile.stream().sorted(Comparator.comparing(m -> m.getPrice()))
                .forEach(b -> System.out.println(b.getPrice() +", "+ b.getBrand()));

        sortByRating();
        mobile.stream().sorted(Comparator.comparing(m -> m.getRating()))
                .forEach(b -> System.out.println(b.getRating() +", "+ b.getBrand()));

    }

    public void electronics(){

        fulldata();
        electronics.stream()
                .forEach(n -> System.out.println(n.getBrand() +", "+ n.getPrice() +", "+ n.getRating()));

        sortByPrice();
        electronics.stream().sorted(Comparator.comparing(m -> m.getPrice()))
                .forEach(b -> System.out.println(b.getPrice() +", "+ b.getBrand()));

        sortByRating();
        electronics.stream().sorted(Comparator.comparing(m -> m.getRating()))
                .forEach(b -> System.out.println(b.getRating() +", "+ b.getBrand()));

    }

    public void fulldata(){
        System.out.println();
        System.out.println("Brand, Price, Rating");
        System.out.println("*********************");
    }

    public void sortByPrice(){
        System.out.println();
        System.out.println("Sorted based on Price");
        System.out.println("*********************");
    }

    public void sortByRating(){
        System.out.println();
        System.out.println("Sorted based on Rating");
        System.out.println("*********************");
    }

}