package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * @TableName items
 */
@TableName(value ="items")
@Data
public class Items implements Serializable {
    /**
     * 商品主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 商品名称 商品名称
     */
    @TableField(value = "item_name")
    private String item_name;

    /**
     * 分类外键id 分类id
     */
    @TableField(value = "cat_id")
    private Integer cat_id;

    /**
     * 一级分类外键id
     */
    @TableField(value = "root_cat_id")
    private Integer root_cat_id;

    /**
     * 累计销售 累计销售
     */
    @TableField(value = "sell_counts")
    private Integer sell_counts;

    /**
     * 上下架状态 上下架状态,1:上架 2:下架
     */
    @TableField(value = "on_off_status")
    private Integer on_off_status;

    /**
     * 商品内容 商品内容
     */
    @TableField(value = "content")
    private String content;

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
        Items other = (Items) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItem_name() == null ? other.getItem_name() == null : this.getItem_name().equals(other.getItem_name()))
            && (this.getCat_id() == null ? other.getCat_id() == null : this.getCat_id().equals(other.getCat_id()))
            && (this.getRoot_cat_id() == null ? other.getRoot_cat_id() == null : this.getRoot_cat_id().equals(other.getRoot_cat_id()))
            && (this.getSell_counts() == null ? other.getSell_counts() == null : this.getSell_counts().equals(other.getSell_counts()))
            && (this.getOn_off_status() == null ? other.getOn_off_status() == null : this.getOn_off_status().equals(other.getOn_off_status()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItem_name() == null) ? 0 : getItem_name().hashCode());
        result = prime * result + ((getCat_id() == null) ? 0 : getCat_id().hashCode());
        result = prime * result + ((getRoot_cat_id() == null) ? 0 : getRoot_cat_id().hashCode());
        result = prime * result + ((getSell_counts() == null) ? 0 : getSell_counts().hashCode());
        result = prime * result + ((getOn_off_status() == null) ? 0 : getOn_off_status().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
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
        sb.append(", item_name=").append(item_name);
        sb.append(", cat_id=").append(cat_id);
        sb.append(", root_cat_id=").append(root_cat_id);
        sb.append(", sell_counts=").append(sell_counts);
        sb.append(", on_off_status=").append(on_off_status);
        sb.append(", content=").append(content);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}