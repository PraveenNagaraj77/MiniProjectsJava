public class MenuService {
    public static void showMenu(){
        System.out.println("\n===== RESTAURANT MENU =====");
        System.out.println("1. Idli      - ₹30");
        System.out.println("2. Dosa      - ₹50");
        System.out.println("3. Pongal    - ₹40");
        System.out.println("4. Coffee    - ₹20");
        System.out.println("5. Exit");
    }

    public static double getPrice(int choice){
        switch (choice){
            case 1:
                return 30;
                case 2:
                    return 50;
                    case 3:
                        return 40;
                        case 4:
                            return 20;
            default:
                    return 0;
        }
    }

}
