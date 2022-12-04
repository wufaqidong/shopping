package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * @TableName items_spec
 */
@TableName(value ="items_spec")
@Data
public class ItemsSpec implements Serializable {
    /**
     * 商品规格id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 商品外键id
     */
    @TableField(value = "item_id")
    private String item_id;

    /**
     * 规格名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 库存
     */
    @TableField(value = "stock")
    private Integer stock;

    /**
     * 折扣力度
     */
    @TableField(value = "discounts")
    private BigDecimal discounts;

    /**
     * 优惠价
     */
    @TableField(value = "price_discount")
    private Integer price_discount;

    /**
     * 原价
     */
    @TableField(value = "price_normal")
    private Integer price_normal;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private LocalDateTime created_time;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private LocalDateTime updated_time;

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
        ItemsSpec other = (ItemsSpec) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getDiscounts() == null ? other.getDiscounts() == null : this.getDiscounts().equals(other.getDiscounts()))
            && (this.getPrice_discount() == null ? other.getPrice_discount() == null : this.getPrice_discount().equals(other.getPrice_discount()))
            && (this.getPrice_normal() == null ? other.getPrice_normal() == null : this.getPrice_normal().equals(other.getPrice_normal()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getDiscounts() == null) ? 0 : getDiscounts().hashCode());
        result = prime * result + ((getPrice_discount() == null) ? 0 : getPrice_discount().hashCode());
        result = prime * result + ((getPrice_normal() == null) ? 0 : getPrice_normal().hashCode());
        result = prime * result + ((getCreated_time() == null) ? 0 : getCreated_time().hashCode());
        result = prime * result + ((getUpdated_time() == null) ? 0 : getUpdated_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", item_id=").append(item_id);
        sb.append(", name=").append(name);
        sb.append(", stock=").append(stock);
        sb.append(", discounts=").append(discounts);
        sb.append(", price_discount=").append(price_discount);
        sb.append(", price_normal=").append(price_normal);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}