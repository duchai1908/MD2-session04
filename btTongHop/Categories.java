package btsession04.btTongHop;

import java.util.Scanner;

public class Categories {
    private int catalogId;
    private String catalogName;
    private String description;
    private boolean catalogStatus;

    public Categories(int catalogId, String catalogName, String description, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.description = description;
        this.catalogStatus = catalogStatus;
    }

    public Categories() {

    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    public void inputData(Scanner scanner, Categories[] arrCategories, int index){
        System.out.println("Nhập tên danh mục");
        this.catalogName = scanner.nextLine();
        System.out.println("Nhập mô tả");
        this.description = scanner.nextLine();
        System.out.println("Nhập trạng thái");
        System.out.println("1.Hoạt động");
        System.out.println("2.Không hoạt động");
        int choice = Integer.parseInt(scanner.nextLine());
        boolean choiceStatus = true;
        do {
            switch (choice) {
                case 1:
                    this.catalogStatus = true;
                    choiceStatus = false;
                    break;
                case 2:
                    this.catalogStatus = false;
                    choiceStatus = false;
                    break;
                default:
                    System.out.println("Có biết đọc không?");
            }
        } while (choiceStatus);
        this.catalogId = index;
    }
    public void inputData(Scanner scanner, Categories[] arrCategories){
        System.out.println("Nhập tên danh mục");
        this.catalogName = scanner.nextLine();
        System.out.println("Nhập mô tả");
        this.description = scanner.nextLine();
        System.out.println("Nhập trạng thái");
        System.out.println("1.Hoạt động");
        System.out.println("2.Không hoạt động");
        int choice = Integer.parseInt(scanner.nextLine());
        boolean choiceStatus = true;
        do {
            switch (choice) {
                case 1:
                    this.catalogStatus = true;
                    choiceStatus = false;
                    break;
                case 2:
                    this.catalogStatus = false;
                    choiceStatus = false;
                    break;
                default:
                    System.out.println("Có biết đọc không?");
            }
        } while (choiceStatus);

    }
    @Override
    public String toString() {
        return "Categories{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", description='" + description + '\'' +
                ", catalogStatus=" + (catalogStatus?"Hoạt động":"Không hoạt động") +
                '}';
    }
}
