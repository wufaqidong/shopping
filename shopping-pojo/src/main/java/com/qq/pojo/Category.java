package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品分类 
 * @TableName category
 */
@TableName(value ="category")
@Data
public class Category implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 分类类型
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 父id
     */
    @TableField(value = "father_id")
    private Integer father_id;

    /**
     * 图标
     */
    @TableField(value = "logo")
    private String logo;

    /**
     * 口号
     */
    @TableField(value = "slogan")
    private String slogan;

    /**
     * 分类图
     */
    @TableField(value = "cat_image")
    private String cat_image;

    /**
     * 背景颜色
     */
    @TableField(value = "bg_color")
    private String bg_color;

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
        Category other = (Category) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFather_id() == null ? other.getFather_id() == null : this.getFather_id().equals(other.getFather_id()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getSlogan() == null ? other.getSlogan() == null : this.getSlogan().equals(other.getSlogan()))
            && (this.getCat_image() == null ? other.getCat_image() == null : this.getCat_image().equals(other.getCat_image()))
            && (this.getBg_color() == null ? other.getBg_color() == null : this.getBg_color().equals(other.getBg_color()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFather_id() == null) ? 0 : getFather_id().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getSlogan() == null) ? 0 : getSlogan().hashCode());
        result = prime * result + ((getCat_image() == null) ? 0 : getCat_image().hashCode());
        result = prime * result + ((getBg_color() == null) ? 0 : getBg_color().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", father_id=").append(father_id);
        sb.append(", logo=").append(logo);
        sb.append(", slogan=").append(slogan);
        sb.append(", cat_image=").append(cat_image);
        sb.append(", bg_color=").append(bg_color);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}