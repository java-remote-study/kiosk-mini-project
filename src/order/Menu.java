package order;

public class Menu {

    private Long menuId;
    private String menuName;
    private Integer price;
    private Integer totalStock;
    private Long menuCategoryId;
    private String recipeOrigin;
    private String imagePath;

    public Menu() {
    }

    public Menu(Long menuId, String menuName, Integer price, Integer totalStock,
                Long menuCategoryId, String recipeOrigin, String imagePath) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.price = price;
        this.totalStock = totalStock;
        this.menuCategoryId = menuCategoryId;
        this.recipeOrigin = recipeOrigin;
        this.imagePath = imagePath;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Long getMenuCategoryId() {
        return menuCategoryId;
    }

    public void setMenuCategoryId(Long menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }

    public String getRecipeOrigin() {
        return recipeOrigin;
    }

    public void setRecipeOrigin(String recipeOrigin) {
        this.recipeOrigin = recipeOrigin;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
