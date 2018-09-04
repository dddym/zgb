package cn.zgbfour.zgb.entity;

import java.io.Serializable;

public class DistributeProduct implements Serializable {
    private Integer productId;

    private Integer distributeId;

    private Integer outAmount;

    private Integer cancelAmount;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getDistributeId() {
        return distributeId;
    }

    public void setDistributeId(Integer distributeId) {
        this.distributeId = distributeId;
    }

    public Integer getOutAmount() {
        return outAmount;
    }

    public void setOutAmount(Integer outAmount) {
        this.outAmount = outAmount;
    }

    public Integer getCancelAmount() {
        return cancelAmount;
    }

    public void setCancelAmount(Integer cancelAmount) {
        this.cancelAmount = cancelAmount;
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
        DistributeProduct other = (DistributeProduct) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getDistributeId() == null ? other.getDistributeId() == null : this.getDistributeId().equals(other.getDistributeId()))
            && (this.getOutAmount() == null ? other.getOutAmount() == null : this.getOutAmount().equals(other.getOutAmount()))
            && (this.getCancelAmount() == null ? other.getCancelAmount() == null : this.getCancelAmount().equals(other.getCancelAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getDistributeId() == null) ? 0 : getDistributeId().hashCode());
        result = prime * result + ((getOutAmount() == null) ? 0 : getOutAmount().hashCode());
        result = prime * result + ((getCancelAmount() == null) ? 0 : getCancelAmount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", distributeId=").append(distributeId);
        sb.append(", outAmount=").append(outAmount);
        sb.append(", cancelAmount=").append(cancelAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}