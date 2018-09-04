package cn.zgbfour.zgb.entity;

import java.io.Serializable;
import java.util.Date;

public class Strategy implements Serializable {
    private Integer id;

    private String title;

    private Integer category;

    private Long price;

    private Integer amount;

    private Integer promotionType;

    private Float discount;

    private String send;

    private Integer promotionWay;

    private Integer priorityCustomer;

    private Date statrTime;

    private Date endTime;

    private Date createTime;

    private Integer productId;

    private Integer categoryId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send == null ? null : send.trim();
    }

    public Integer getPromotionWay() {
        return promotionWay;
    }

    public void setPromotionWay(Integer promotionWay) {
        this.promotionWay = promotionWay;
    }

    public Integer getPriorityCustomer() {
        return priorityCustomer;
    }

    public void setPriorityCustomer(Integer priorityCustomer) {
        this.priorityCustomer = priorityCustomer;
    }

    public Date getStatrTime() {
        return statrTime;
    }

    public void setStatrTime(Date statrTime) {
        this.statrTime = statrTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Strategy other = (Strategy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPromotionType() == null ? other.getPromotionType() == null : this.getPromotionType().equals(other.getPromotionType()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getSend() == null ? other.getSend() == null : this.getSend().equals(other.getSend()))
            && (this.getPromotionWay() == null ? other.getPromotionWay() == null : this.getPromotionWay().equals(other.getPromotionWay()))
            && (this.getPriorityCustomer() == null ? other.getPriorityCustomer() == null : this.getPriorityCustomer().equals(other.getPriorityCustomer()))
            && (this.getStatrTime() == null ? other.getStatrTime() == null : this.getStatrTime().equals(other.getStatrTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPromotionType() == null) ? 0 : getPromotionType().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getSend() == null) ? 0 : getSend().hashCode());
        result = prime * result + ((getPromotionWay() == null) ? 0 : getPromotionWay().hashCode());
        result = prime * result + ((getPriorityCustomer() == null) ? 0 : getPriorityCustomer().hashCode());
        result = prime * result + ((getStatrTime() == null) ? 0 : getStatrTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", category=").append(category);
        sb.append(", price=").append(price);
        sb.append(", amount=").append(amount);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", discount=").append(discount);
        sb.append(", send=").append(send);
        sb.append(", promotionWay=").append(promotionWay);
        sb.append(", priorityCustomer=").append(priorityCustomer);
        sb.append(", statrTime=").append(statrTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", productId=").append(productId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}