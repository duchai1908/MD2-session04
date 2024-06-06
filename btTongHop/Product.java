package btsession04.btTongHop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int productStatus;

    public Product() {

    }

    public Product(String productId, String productName, float price, String description, Date created, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(Scanner scanner, Product[] arrProduct, int index, Categories[] arrCategories) throws ParseException {
        // Kiểm tra tồn tại danh mục
        int count = 0;
        for (Categories categories : arrCategories) {
            if (categories != null) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Bạn cần nhập danh mục trước");
            return;
        }
        // Nhập mã sản phẩm
        boolean checkId = true;
        String checkProductId = null;
        do {
            while (true) {
                System.out.println("Nhập mã sản phẩm đồ uống, bắt đầu bằng ký tự C S A và có độ dài là 4");
                checkProductId = scanner.nextLine();
                if (checkProductId.length() <= 4 && checkProductId.charAt(0) == 'C' || checkProductId.length() <= 4 && checkProductId.charAt(0) == 'S' || checkProductId.length() <= 4 && checkProductId.charAt(0) == 'A') {
                    checkId = false;
                    break;
                }else{
                    System.out.println("Phải bắt đầu bằng C S A  và có độ dài bằng 4");
                }
            }
            int countProduct = 0;
            for (Product product : arrProduct) {
                if (product != null) {
                    countProduct++;
                }
            }
            if (countProduct > 0) {
                for (int i = 0; i < arrProduct.length; i++) {
                    if (arrProduct[i] != null && checkProductId.equals(arrProduct[i].getProductId())) {
                        checkId = true;
                        System.out.println("Mã sản phẩm đã tồn tại");
                        break;
                    }
                }
            }
            if(!checkId){
                productId = checkProductId;
            }
            System.out.println(checkId);

        } while (checkId);
        //Nhập tên sản phẩm
        boolean checkName = true;
        String checkProductName = "";
        do {
            while (true) {
                System.out.println("Nhập tên sản phẩm");
                checkProductName = scanner.nextLine();
                if (checkProductName.length() >= 10 && checkProductName.length() <= 50) {
                    checkName = false;
                    break;
                }
                System.out.println("Tên không hợp lệ");
            }
            int countProduct = 0;
            for (Product product : arrProduct) {
                if (product != null) {
                    countProduct++;
                    break;
                }
            }
            if (countProduct > 0) {
                for (int i = 0; i < arrProduct.length; i++) {
                    if (arrProduct[i] != null && checkProductName.equals(arrProduct[i].getProductName())) {
                        checkName = true;
                        break;
                    }
                }
                if (checkName) {
                    System.out.println("Tên đã tồn tại");
                }

            }
            if(!checkName){
                productName = checkProductName;
            }
        } while (checkName);
        //Nhập giá tiền
        while (true) {
            System.out.println("Nhập giá tiền");
            price = Float.parseFloat(scanner.nextLine());
            if (price > 0) {
                break;
            }
            System.out.println("Giá tiền không được nhỏ hơn 0");
        }
        //Nhập mô tả
        System.out.println("Nhập mô tả sản phẩm");
        description = scanner.nextLine();
        //Nhập ngày nhập sản phẩm
        System.out.print("Nhập ngày nhập sản phẩm (dd/MM/yyyy): ");
        created = dateFormat.parse(scanner.nextLine());
        //Nhập mã danh mục
        System.out.println("Nhập mã danh mục");
        for (Categories categories : arrCategories) {
            if (categories != null) {
                System.out.println(categories);
            }
        }
        System.out.println("Nhập danh mục");
        catalogId = Integer.parseInt(scanner.nextLine());
        //Nhập trạng thái
        while (true) {
            System.out.println("Nhập trạng thái sản phẩm");
            System.out.println("0: Đang bán / 1: Hết Hàng / 2: Không Bán");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice >= 0 && choice <= 2) {
                productStatus = choice;
                break;
            } else {
                System.out.println("Vui lòng chọn từ 0 đến 2");
            }
        }
        System.out.println("Thêm mới thành công");
    }

    // Hiển thị sản phẩm
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", catalogId=" + catalogId +
                ", productStatus=" + productStatus +
                '}';
    }
}
