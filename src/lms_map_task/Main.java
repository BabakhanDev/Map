package lms_map_task;

import task1.Course;
import task1.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//   todo 1    Телефон китепчеси тиркемеси:
//        Байланыш аттарын ачкыч катары жана телефон номерлерин маани катары сактоо үчүн
//        Map<String, String> ишке ашырыңыз. Аталышы боюнча байланыштарды кошуу,
//        алып салуу жана издөө ыкмаларын камсыз кылыңыз.

        Map<String, String> telephone = new TreeMap<>();
        telephone.put("Petr", "+996888999555");
        telephone.put("Manas", "+996500800900");
        telephone.put("Argen", String.valueOf(new ArrayList<String>(Arrays.asList("+996700800500", "+9964558564688"))));
        System.out.println("   1.      ");
        telephone.put("Jyldyz", "+996900555998");
        System.out.println(telephone);
        System.out.println("..................................................");
        telephone.remove("Manas");
        System.out.println(telephone);
        System.out.println("..................................................");
        System.out.println("telephone.get(\"Jyldyz\") = " + telephone.get("Jyldyz"));

//       todo 2   Студенттердин баалары системасы:
//          Ар бир студенттин атын ачкыч жана алардын бааларынын тизмесин маани катары сактоо үчүн
//          Map<String, List<Integer>> түзүңүз. Ар бир студенттин орточо баасын эсептөө функциясын кошуңуз.
        StudentGrades stGrades = new StudentGrades();
        stGrades.addGrade("Aliya", 85);
        stGrades.addGrade("Aliya", 90);
        stGrades.addGrade("Aliya", 95);
        stGrades.addGrade("Aliya", 97);
        stGrades.addGrade("Ruslan", 75);
        stGrades.addGrade("Ruslan", 84);
        stGrades.addGrade("Ruslan", 77);
        stGrades.addGrade("Ruslan", 88);
        stGrades.addGrade("Ermek", 86);
        stGrades.addGrade("Ermek", 88);
        stGrades.addGrade("Ermek", 87);
        stGrades.addGrade("Ermek", 98);
        stGrades.addGrade("Nurs", 76);
        stGrades.addGrade("Nurs", 100);
        stGrades.addGrade("Nurs", 86);
        stGrades.addGrade("Nurs", 95);
        System.out.println("   2.      ");
        stGrades.printAllGrades();
        System.out.println("..................................................");

        System.out.println("Алиянын орточо баасы: " + stGrades.calculateArifmetic("Aliya"));
        System.out.println("Русландын орточо баасы: " + stGrades.calculateArifmetic("Ruslan"));
        System.out.println("Эрмектин орточо баасы: " + stGrades.calculateArifmetic("Ermek"));
        System.out.println("Нурстун орточо баасы: " + stGrades.calculateArifmetic("Nurs"));
        System.out.println("..................................................");

        System.out.println("   3.      ");
        // todo     3          Товарларды башкаруу системасы:
//          Продукт аттарын жана алардын кампадагы санын сактоо үчүн Map<String, Integer> колдонуңуз.
//          Жаңы продукттарды кошуу, запасты жаңыртуу жана продукт түгөнгөнүн текшерүү ыкмаларын ишке ашырыңыз.
        Product product = new Product();
        product.addProduct("Алма", 50);
        product.addProduct("Алма", 60);
        product.addProduct("Апельсин", 50);
        product.addProduct("Банан", 50);

        product.printInventory();
        System.out.println("..................................................");
        product.updateProduct("Алма",-20);
        product.updateProduct("Банан",-50);
        System.out.println(" ");
        product.printInventory();
        System.out.println("..................................................");
        System.out.println(" ");
        System.out.println("Алма түгөндүбү?          " + product.isOutOfProduct("Алма"));
        System.out.println("Апельсин түгөндүбү?      " + product.isOutOfProduct("Апельсин"));
        System.out.println("Банан түгөндүбү?         " + product.isOutOfProduct("Банан"));

        //     todo  4   Продукт баасын эсептөөчү:
//                Продукт аттарын жана алардын бааларын сактоо үчүн Map<String, Double> колдонуңуз.
//                Продукттардын тизмесин алып, жалпы бааны кайтаруучу ыкманы ишке ашырыңыз.
        System.out.println("   4.      ");
       ProductPriceSum productPrice = new ProductPriceSum();
      productPrice.addProduct("pristavka", 1000.0);
       productPrice.addProduct("Televisor",50000.0);
        productPrice.addProduct("Phone", 50000.0);
        productPrice.addProduct("Bluetus",4000.0);
        System.out.println("..................................................");
        System.out.println(productPrice.getProducts());
        System.out.println("..................................................");
        System.out.println("Summa Price = " + productPrice.getSummPrice());
        System.out.println("..................................................");

    }

}