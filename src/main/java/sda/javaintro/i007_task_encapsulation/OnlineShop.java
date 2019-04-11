package sda.javaintro.i007_task_encapsulation;

/*

(The task 3-5 is done!)
3. W repozytorium kodu, w pakiecie encapsulation znajduje się kolejny pakiet nazwany task, gdzie jest kilka klas,
które należy uporządkować i stworzyć dla nich odpowiednie pakiety. To Twoje zadanie. Działaj wyłącznie w
obrębie pakietu task.
4. * W klasach, które właśnie zostały uporządkowane ktoś popełnił błędy i nie zadbał o prawidłową hermetyzację
danych oraz modyfikatory dostępu. Przejrzyj klasy i postaraj się by kod był zgodny z tym co było powiedziane na
zajęciach - przeprojektuj klasy by spełniały zasady hermetyzacji, a przy tym udostępniały do "świata
zewnętrznego" tylko potrzebne API. Zadbaj o prawidłowe użycie danych, dodaj konstruktory gdzie trzeba.
Utwórz przykłady użycia (tworzenie produktów i użytkowników) w klasie OnlineShop. Sprawdź, czy Twój kod jest
odporny na błędy.
5. * Utwórz klasę koszyka, która umożliwi robienie zakupów: użytkownik dodaje wybrane przedmioty w zadanej ilości
do swojego koszyka, a następnie dokonuje zakupu. Wykonywane operacje powinny być wyświetlane na konsoli.
Zadbaj o odpowiednią hermetyzację swojego API oraz właściwe modyfikatory dostępu.

 */


import sda.javaintro.i007_task_encapsulation.user.UserModel;
import sda.javaintro.i007_task_encapsulation.cart.ShopCart;
import sda.javaintro.i007_task_encapsulation.item.ItemManager;
import sda.javaintro.i007_task_encapsulation.item.ItemModel;
import sda.javaintro.i007_task_encapsulation.item.ItemUtil;
import sda.javaintro.i007_task_encapsulation.user.UserManager;

public class OnlineShop {
    public static void main(String[] args) {

        // User management
        UserManager userManager = new UserManager();
        UserModel user[] = new UserModel[10];

        userManager.createUser("Marcin", "Kobierowski", 34);
        user[0] = userManager.getUser();

        userManager.createUser("Łukasz", "Kowalski", 45);
        user[1] = userManager.getUser();

        System.out.println("List of user:");
        for (int i = 0; i < user.length; i++) {
            if (user[i] != null)
                System.out.println(user[i]);
        }

        // Item management
        ItemManager itemManager = new ItemManager();
        ItemModel item[] = new ItemModel[20];

        System.out.println("\nAdd item:");
        item[0] = itemManager.createShopItem("pralka", "pralka opis", 1399.99);
        item[1] = itemManager.createShopItem("monitor", "monitor opis", 600.45);
        item[2] = itemManager.createShopItem("waciki", "waciki opis", 9.30);
        item[3] = itemManager.createShopItem("papier", "papier opis", 2.30);

        //ItemUtil - truncate - cat string to maxLength char
        ItemUtil itemUtil = new ItemUtil();

        System.out.println("\nList of item (cut description to 10 char):");
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                System.out.printf("- item %d itemTitle= %s, itemDescription= %s, item price= %.2f PLN%n",
                        (i + 1), item[i].getTitle(), itemUtil.truncate(item[i].getDescription(), 10), item[i].getPrice());
            }
        }

        // Add to cart

        ShopCart shopCart = new ShopCart();

        System.out.println("\nAdd item do basket:");
        shopCart.addToBasket(item[0], 2);
        shopCart.addToBasket(item[1], 8);
        shopCart.addToBasket(item[2], 3);
        shopCart.addToBasket(item[3], 1);
        shopCart.addToBasket(item[2], 6);
        shopCart.addToBasket(item[2], 6);
        shopCart.addToBasket(item[2], 6);
        shopCart.addToBasket(item[2], 6);
        shopCart.addToBasket(item[2], 6);
        shopCart.addToBasket(item[2], 6);
        shopCart.addToBasket(item[2], 6);

        System.out.println("\nItem in basket:");
        shopCart.showItemInBasket();

        System.out.println("\nBuy all item from basket:");
        shopCart.buy();

    }
}
