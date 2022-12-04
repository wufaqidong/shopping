package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 商品参数 
 * @TableName items_param
 */
@TableName(value ="items_param")
@Data
public class ItemsParam implements Serializable {
    /**
     * 商品参数id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 商品外键id
     */
    @TableField(value = "item_id")
    private String item_id;

    /**
     * 产地 产地，例：中国江苏
     */
    @TableField(value = "produc_place")
    private String produc_place;

    /**
     * 保质期 保质期，例：180天
     */
    @TableField(value = "foot_period")
    private String foot_period;

    /**
     * 品牌名 品牌名，例：三只大灰狼
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 生产厂名 生产厂名，例：大灰狼工厂
     */
    @TableField(value = "factory_name")
    private String factory_name;

    /**
     * 生产厂址 生产厂址，例：大灰狼生产基地
     */
    @TableField(value = "factory_address")
    private String factory_address;

    /**
     * 包装方式 包装方式，例：袋装
     */
    @TableField(value = "packaging_method")
    private String packaging_method;

    /**
     * 规格重量 规格重量，例：35g
     */
    @TableField(value = "weight")
    private String weight;

    /**
     * 存储方法 存储方法，例：常温5~25°
     */
    @TableField(value = "storage_method")
    private String storage_method;

    /**
     * 食用方式 食用方式，例：开袋即食
     */
    @TableField(value = "eat_method")
    private String eat_method;

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
        ItemsParam other = (ItemsParam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getProduc_place() == null ? other.getProduc_place() == null : this.getProduc_place().equals(other.getProduc_place()))
            && (this.getFoot_period() == null ? other.getFoot_period() == null : this.getFoot_period().equals(other.getFoot_period()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getFactory_name() == null ? other.getFactory_name() == null : this.getFactory_name().equals(other.getFactory_name()))
            && (this.getFactory_address() == null ? other.getFactory_address() == null : this.getFactory_address().equals(other.getFactory_address()))
            && (this.getPackaging_method() == null ? other.getPackaging_method() == null : this.getPackaging_method().equals(other.getPackaging_method()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getStorage_method() == null ? other.getStorage_method() == null : this.getStorage_method().equals(other.getStorage_method()))
            && (this.getEat_method() == null ? other.getEat_method() == null : this.getEat_method().equals(other.getEat_method()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getProduc_place() == null) ? 0 : getProduc_place().hashCode());
        result = prime * result + ((getFoot_period() == null) ? 0 : getFoot_period().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getFactory_name() == null) ? 0 : getFactory_name().hashCode());
        result = prime * result + ((getFactory_address() == null) ? 0 : getFactory_address().hashCode());
        result = prime * result + ((getPackaging_method() == null) ? 0 : getPackaging_method().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getStorage_method() == null) ? 0 : getStorage_method().hashCode());
        result = prime * result + ((getEat_method() == null) ? 0 : getEat_method().hashCode());
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
        sb.append(", produc_place=").append(produc_place);
        sb.append(", foot_period=").append(foot_period);
        sb.append(", brand=").append(brand);
        sb.append(", factory_name=").append(factory_name);
        sb.append(", factory_address=").append(factory_address);
        sb.append(", packaging_method=").append(packaging_method);
        sb.append(", weight=").append(weight);
        sb.append(", storage_method=").append(storage_method);
        sb.append(", eat_method=").append(eat_method);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}