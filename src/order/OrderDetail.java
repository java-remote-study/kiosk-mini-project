package order;

public class OrderDetail {

    private Long menuId;
    private Long orderId;
    private Integer count;
    private String orderDetailStatus;

    public OrderDetail() {
    }

    public OrderDetail(Long menuId, Long orderId, Integer count, String orderDetailStatus) {
        this.menuId = menuId;
        this.orderId = orderId;
        this.count = count;
        this.orderDetailStatus = orderDetailStatus;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getOrderDetailStatus() {
        return orderDetailStatus;
    }

    public void setOrderDetailStatus(String orderDetailStatus) {
        this.orderDetailStatus = orderDetailStatus;
    }
}
