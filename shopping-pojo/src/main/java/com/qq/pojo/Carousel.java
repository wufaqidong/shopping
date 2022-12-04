package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 轮播图 
 * @TableName carousel
 */
@TableName(value ="carousel")
@Data
public class Carousel implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 图片 图片地址
     */
    @TableField(value = "image_url")
    private String image_url;

    /**
     * 背景色
     */
    @TableField(value = "background_color")
    private String background_color;

    /**
     * 商品id 商品id
     */
    @TableField(value = "item_id")
    private String item_id;

    /**
     * 商品分类id 商品分类id
     */
    @TableField(value = "cat_id")
    private String cat_id;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 轮播图展示顺序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 是否展示
     */
    @TableField(value = "is_show")
    private Integer is_show;

    /**
     * 创建时间 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 更新时间 更新
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

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
        Carousel other = (Carousel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImage_url() == null ? other.getImage_url() == null : this.getImage_url().equals(other.getImage_url()))
            && (this.getBackground_color() == null ? other.getBackground_color() == null : this.getBackground_color().equals(other.getBackground_color()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getCat_id() == null ? other.getCat_id() == null : this.getCat_id().equals(other.getCat_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getIs_show() == null ? other.getIs_show() == null : this.getIs_show().equals(other.getIs_show()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImage_url() == null) ? 0 : getImage_url().hashCode());
        result = prime * result + ((getBackground_color() == null) ? 0 : getBackground_color().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getCat_id() == null) ? 0 : getCat_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getIs_show() == null) ? 0 : getIs_show().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", image_url=").append(image_url);
        sb.append(", background_color=").append(background_color);
        sb.append(", item_id=").append(item_id);
        sb.append(", cat_id=").append(cat_id);
        sb.append(", type=").append(type);
        sb.append(", sort=").append(sort);
        sb.append(", is_show=").append(is_show);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}