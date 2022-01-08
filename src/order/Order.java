package order;

import java.util.Date;

public class Order {

    private Long orderId;
    private Date orderDate;
    private String orderStatus;
    private Boolean isTakeOut;

    public Order() {
    }

    public Order(Long orderId, Date orderDate, String orderStatus, Boolean isTakeOut) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.isTakeOut = isTakeOut;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getTakeOut() {
        return isTakeOut;
    }

    public void setTakeOut(Boolean takeOut) {
        isTakeOut = takeOut;
    }
}
