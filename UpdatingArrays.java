import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        String[] newMenu = new String[5];
       String menuString =  Arrays.toString(menu);
       menu[2] = "Latte";

       System.out.println(menuString);

       for(int i = 0; i < menu.length; i++) {
          newMenu[i] = menu[i];
       }
       newMenu[3] = "House Blend";
       newMenu[4] = "Dark Roast";

       System.out.println(Arrays.toString(newMenu));
    }
    
}
