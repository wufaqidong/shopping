package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 商品评价表 
 * @TableName items_comments
 */
@TableName(value ="items_comments")
@Data
public class ItemsComments implements Serializable {
    /**
     * id主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 用户id 用户名须脱敏
     */
    @TableField(value = "user_id")
    private String user_id;

    /**
     * 商品id
     */
    @TableField(value = "item_id")
    private String item_id;

    /**
     * 商品名称
     */
    @TableField(value = "item_name")
    private String item_name;

    /**
     * 商品规格id 可为空
     */
    @TableField(value = "item_spec_id")
    private String item_spec_id;

    /**
     * 规格名称 可为空
     */
    @TableField(value = "sepc_name")
    private String sepc_name;

    /**
     * 评价等级 1：好评 2：中评 3：差评
     */
    @TableField(value = "comment_level")
    private Integer comment_level;

    /**
     * 评价内容
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
        ItemsComments other = (ItemsComments) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getItem_name() == null ? other.getItem_name() == null : this.getItem_name().equals(other.getItem_name()))
            && (this.getItem_spec_id() == null ? other.getItem_spec_id() == null : this.getItem_spec_id().equals(other.getItem_spec_id()))
            && (this.getSepc_name() == null ? other.getSepc_name() == null : this.getSepc_name().equals(other.getSepc_name()))
            && (this.getComment_level() == null ? other.getComment_level() == null : this.getComment_level().equals(other.getComment_level()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getItem_name() == null) ? 0 : getItem_name().hashCode());
        result = prime * result + ((getItem_spec_id() == null) ? 0 : getItem_spec_id().hashCode());
        result = prime * result + ((getSepc_name() == null) ? 0 : getSepc_name().hashCode());
        result = prime * result + ((getComment_level() == null) ? 0 : getComment_level().hashCode());
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
        sb.append(", user_id=").append(user_id);
        sb.append(", item_id=").append(item_id);
        sb.append(", item_name=").append(item_name);
        sb.append(", item_spec_id=").append(item_spec_id);
        sb.append(", sepc_name=").append(sepc_name);
        sb.append(", comment_level=").append(comment_level);
        sb.append(", content=").append(content);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}