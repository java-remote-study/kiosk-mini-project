package order;

public class MenuCategory {

    private Long menuCategoryId;
    private String menuCategoryName;

    public MenuCategory() {
    }

    public MenuCategory(Long menuCategoryId, String menuCategoryName) {
        this.menuCategoryId = menuCategoryId;
        this.menuCategoryName = menuCategoryName;
    }

    public Long getMenuCategoryId() {
        return menuCategoryId;
    }

    public void setMenuCategoryId(Long menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }

    public String getMenuCategoryName() {
        return menuCategoryName;
    }

    public void setMenuCategoryName(String menuCategoryName) {
        this.menuCategoryName = menuCategoryName;
    }
}
