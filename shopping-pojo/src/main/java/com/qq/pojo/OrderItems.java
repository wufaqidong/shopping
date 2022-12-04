package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 订单商品关联表 
 * @TableName order_items
 */
@TableName(value ="order_items")
@Data
public class OrderItems implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 归属订单id
     */
    @TableField(value = "order_id")
    private String order_id;

    /**
     * 商品id
     */
    @TableField(value = "item_id")
    private String item_id;

    /**
     * 商品图片
     */
    @TableField(value = "item_img")
    private String item_img;

    /**
     * 商品名称
     */
    @TableField(value = "item_name")
    private String item_name;

    /**
     * 规格id
     */
    @TableField(value = "item_spec_id")
    private String item_spec_id;

    /**
     * 规格名称
     */
    @TableField(value = "item_spec_name")
    private String item_spec_name;

    /**
     * 成交价格
     */
    @TableField(value = "price")
    private Integer price;

    /**
     * 购买数量
     */
    @TableField(value = "buy_counts")
    private Integer buy_counts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        OrderItems other = (OrderItems) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getItem_img() == null ? other.getItem_img() == null : this.getItem_img().equals(other.getItem_img()))
            && (this.getItem_name() == null ? other.getItem_name() == null : this.getItem_name().equals(other.getItem_name()))
            && (this.getItem_spec_id() == null ? other.getItem_spec_id() == null : this.getItem_spec_id().equals(other.getItem_spec_id()))
            && (this.getItem_spec_name() == null ? other.getItem_spec_name() == null : this.getItem_spec_name().equals(other.getItem_spec_name()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBuy_counts() == null ? other.getBuy_counts() == null : this.getBuy_counts().equals(other.getBuy_counts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getItem_img() == null) ? 0 : getItem_img().hashCode());
        result = prime * result + ((getItem_name() == null) ? 0 : getItem_name().hashCode());
        result = prime * result + ((getItem_spec_id() == null) ? 0 : getItem_spec_id().hashCode());
        result = prime * result + ((getItem_spec_name() == null) ? 0 : getItem_spec_name().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBuy_counts() == null) ? 0 : getBuy_counts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", order_id=").append(order_id);
        sb.append(", item_id=").append(item_id);
        sb.append(", item_img=").append(item_img);
        sb.append(", item_name=").append(item_name);
        sb.append(", item_spec_id=").append(item_spec_id);
        sb.append(", item_spec_name=").append(item_spec_name);
        sb.append(", price=").append(price);
        sb.append(", buy_counts=").append(buy_counts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}