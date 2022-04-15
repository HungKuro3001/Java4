package entities;

import java.util.List;

public class ListCart {
    private List<Cart> order;
    private boolean status;
    private User user;
    public List<Cart> getOrder() {
        return order;
    }
    public void setOrder(List<Cart> order) {
        this.order = order;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
}
