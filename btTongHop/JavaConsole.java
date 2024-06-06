package btsession04.btTongHop;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class JavaConsole {
    static Scanner scanner = new Scanner(System.in);
    static Categories[] categories = new Categories[100];
    static Product[] products = new Product[100];

    static int indexCate = 0;
    static int indexProduct = 0;

    public static void main(String[] args) throws ParseException {
        allMenu();
    }

    public static void allMenu() throws ParseException {
        System.out.println("***************SHOP MENU**************");
        System.out.println("1. Quản lý danh mục");
        System.out.println("2. Quản lý sản phẩm");
        System.out.println("3.Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                showCategoryMenu();
                break;
            case 2:
                showProductMenu();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Chọn 1 trong 2");
        }
    }

    public static void showCategoryMenu() throws ParseException {

        do {
            System.out.println("***************CATEGORY MENU**************");
            System.out.println("1. Nhập thông tin danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xoá danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    listCategory();
                    break;
                case 3:
                    updateCategory();
                    break;
                case 4:
                    break;
                case 5:
                    updateStatus();
                    break;
                case 6:
                    allMenu();
                    System.exit(0);
                default:
                    System.out.println("Nhập cho đúng ");
            }
        } while (true);
    }

    public static void addCategory() {
        Categories category = new Categories();
        category.inputData(scanner, categories, indexCate);
        indexCate++;
        for (int i = 0; i < categories.length; i++) {
            if (categories[i] == null) {
                categories[i] = category;
                break;
            }
        }
    }

    public static void listCategory() {
        for (Categories cate : categories) {
            if (cate != null) {
                System.out.println(cate);
            }
        }
    }

    public static void updateCategory() {
        System.out.println("Nhập vào mã danh mục");
        int oldCategory = Integer.parseInt(scanner.nextLine());
        boolean isCategoryExist = false;
        for (Categories category : categories) {
            if (category.getCatalogId() == oldCategory) {
                category.inputData(scanner, categories);
                isCategoryExist = true;
                break;
            }
        }
        if (!isCategoryExist) {
            System.out.println("Không đúng mã danh mục");
        }
    }

    public static void updateStatus() {
        System.out.println("Nhập vào mã danh mục");
        int oldCategory = Integer.parseInt(scanner.nextLine());
        boolean isCategoryExist = false;
        for (Categories category : categories) {
            if (category.getCatalogId() == oldCategory) {
                category.setCatalogStatus(!category.isCatalogStatus());
                isCategoryExist = true;
                System.out.println("Cập nhật status thành công");
                break;
            }
        }
        if (!isCategoryExist) {
            System.out.println("Không đúng mã danh mục");
        }
    }

    public static void showProductMenu() throws ParseException {
        do {
            System.out.println("****************PRODUCT MENU ******************");
            System.out.println("1.Nhập thông tin các sản phẩm");
            System.out.println("2.Hiển thị thông tin các sản phẩm");
            System.out.println("3.Sắp xếp sản phẩm theo giá");
            System.out.println("4.Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5.Xoá sản phẩm theo mã sản phẩm");
            System.out.println("6.Tìm kiếm sản phẩm theo tên sản phẩm");
            System.out.println("7.Tìm kiếm sản phẩm trong khoảng giá");
            System.out.println("8.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    listProduct();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    allMenu();
                    break;
            }
        } while (true);
    }
    public static void addProduct() throws ParseException {
        Product product = new Product();
        product.inputData(scanner,products,indexProduct,categories);
        for (int i=0;i<products.length;i++){
            if (products[i] == null) {
                products[i]=product;
                break;
            }
        }
    }
    public static void listProduct(){
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }
}
