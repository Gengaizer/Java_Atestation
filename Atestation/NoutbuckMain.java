package Atestation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NoutbuckMain {
    public static void main(String[] args) {
        Noutbuck noutbuck1 = new Noutbuck("Msi", "Katana", 16, 512, 17.3, "Black", "RTX 4060 8 ГБ",
                "Windows");
        Noutbuck noutbuck2 = new Noutbuck("Msi", "Katana17", 8, 256, 17.3, "Black", "GeForce RTX 2050 4 ГБ", "Windows");
        Noutbuck noutbuck3 = new Noutbuck("Apple", "MacBook Air", 8, 256, 13.3, "Grey", "Apple M1 7-core",
                "macOS");
        Noutbuck noutbuck4 = new Noutbuck("HONOR", "MagicBook 15", 16, 512, 15.6, "Grey", "AMD Radeon Graphics",
                "Windows");
        Noutbuck noutbuck5 = new Noutbuck("HONOR", "MagicBook 14", 16, 512, 14, "Grey", "AMD Radeon Graphics",
                "Windows");
        Noutbuck noutbuck6 = new Noutbuck("Apple", "MacBook Air", 8, 256, 15.3, "Black", "Apple M2 10-core",
                "macOS");

        Set<Noutbuck> setNubuk = new HashSet<>();
        setNubuk.add(noutbuck1);
        setNubuk.add(noutbuck2);
        setNubuk.add(noutbuck3);
        setNubuk.add(noutbuck4);
        setNubuk.add(noutbuck5);
        setNubuk.add(noutbuck6);

        search(setNubuk);

    }

    public static void search(Set<Noutbuck> setNubuk) {
        Map<String, Object> search = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите параметр для поиска:");
        System.out.println("1 - Бренд: Msi / Apple / HONOR");
        System.out.println("2 - Модель: Katana / Katana17 / MacBook Air / MagicBook 15 / MagicBook 14 / MacBook Air ");
        System.out.println("3 - RAM: 8 / 16");
        System.out.println("4 - HDD : 256 / 512");
        System.out.println("5 - Диагональ: 17.3 / 13.3 / 15.6 / 14 / 15.3");
        System.out.println("6 - Цвет : Black / Grey");
        System.out.println(
                "7 - Видеокарта: RTX 4060 8 ГБ / GeForce RTX 2050 4 ГБ / Apple M1 7-core / AMD Radeon Graphics / AMD Radeon Graphics / Apple M2 10-core");
        System.out.println("8 - Операционная система: Windows / macOS");
        int searching = scan.nextInt();
        switch (searching) {
            case 1:
                System.out.println("Введите бренд:");
                String searching_brand = scan.next();
                search.put("Бренд", searching_brand);

                break;

            case 2:
                System.out.println("Введите модель:");
                String searching_model = scan.next();
                search.put("Модель", searching_model);

                break;

            case 3:
                System.out.println("Введите минимальное колличество гигабайтов RAM:");
                int minRam = scan.nextInt();
                search.put("RAM", minRam);

                break;

            case 4:
                System.out.println("Введите минимальное колличество гигабайтов HDD:");
                int minHdd = scan.nextInt();
                search.put("HDD", minHdd);

                break;

            case 5:
                System.out.println("Введите минимальную диагональ:");
                double mindiagonal = scan.nextDouble();
                search.put("Диагональ", mindiagonal);

                break;

            case 6:
                System.out.println("Введите цвет:");
                String switch_color = scan.next();
                search.put("Цвет", switch_color);

                break;

            case 7:
                System.out.println("Введите название видеокарты:");
                String switch_video_card = scan.next();
                search.put("Видеокарта", switch_video_card);

                break;

            case 8:
                System.out.println("Введите название операционной системы:");
                String operating_system_searching = scan.next();
                search.put("Операционная система", operating_system_searching);
                break;

            default:
                System.out.println("You INVALID!");
                break;
        }
        scan.close();
        filterNubuk(setNubuk, search);
    }

    public static void filterNubuk(Set<Noutbuck> setNubuk, Map<String, Object> search) {
        for (Noutbuck Noutbuck : setNubuk) {
            boolean passesFilter = true;

            for (Map.Entry<String, Object> entry : search.entrySet()) {
                String key = entry.getKey();

                Object value = entry.getValue();

                switch (key) {
                    case "RAM":
                        if (Noutbuck.getRam() < (int) value) {
                            passesFilter = false;
                        }

                        break;
                    case "HDD":
                        if (Noutbuck.getHdd() < (int) value) {
                            passesFilter = false;
                        }

                        break;
                    case "Диагональ":
                        if (Noutbuck.getDiagonal() < (double) value) {
                            passesFilter = false;
                        }

                        break;
                    case "Бренд":
                        if (!Noutbuck.getBrand().equals(value)) {
                            passesFilter = false;
                        }

                        break;
                    case "Цвет":
                        if (!Noutbuck.getColor().equals(value)) {
                            passesFilter = false;
                        }

                        break;
                    case "Модель":
                        if (!Noutbuck.getModel().equals(value)) {
                            passesFilter = false;
                        }

                        break;
                    case "Видеокарта":
                        if (!Noutbuck.getVideo_card().equals(value)) {
                            passesFilter = false;
                        }

                        break;
                    case "Операционная система":
                        if (!Noutbuck.getOperating_system().equals(value)) {
                            passesFilter = false;
                        }

                        break;

                    default:
                        System.out.println("You INVALID!");
                        break;

                }
            }
            if (passesFilter) {
                System.out.println("Ноутбуки по запросу - RAM: " + Noutbuck.getRam() + " Бренд: " + Noutbuck.getBrand()
                        + " Модель: " + Noutbuck.getModel() + " HDD: " + Noutbuck.getHdd() + " Диагональ: "
                        + Noutbuck.getDiagonal() + " Цвет: " + Noutbuck.getColor() + " Видеокарта: "
                        + Noutbuck.getVideo_card() + " Операционная система: " + Noutbuck.getOperating_system());
            }

        }
        System.out.println("Купи ещё вифи и фрешку");
    }
}