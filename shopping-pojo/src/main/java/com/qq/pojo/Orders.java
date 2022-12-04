package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 订单表;
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    /**
     * 订单主键;同时也是订单编号
     */
    @TableId(value = "id")
    private String id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private String user_id;

    /**
     * 收货人快照
     */
    @TableField(value = "receiver_name")
    private String receiver_name;

    /**
     * 收货人手机号快照
     */
    @TableField(value = "receiver_mobile")
    private String receiver_mobile;

    /**
     * 收货地址快照
     */
    @TableField(value = "receiver_address")
    private String receiver_address;

    /**
     * 订单总价格
     */
    @TableField(value = "total_amount")
    private Integer total_amount;

    /**
     * 实际支付总价格
     */
    @TableField(value = "real_pay_amount")
    private Integer real_pay_amount;

    /**
     * 邮费;默认可以为零，代表包邮
     */
    @TableField(value = "post_amount")
    private Integer post_amount;

    /**
     * 支付方式
     */
    @TableField(value = "pay_method")
    private Integer pay_method;

    /**
     * 买家留言
     */
    @TableField(value = "left_msg")
    private String left_msg;

    /**
     * 扩展字段
     */
    @TableField(value = "extand")
    private String extand;

    /**
     * 买家是否评价;1：已评价，0：未评价
     */
    @TableField(value = "is_comment")
    private Integer is_comment;

    /**
     * 逻辑删除状态;1: 删除 0:未删除
     */
    @TableField(value = "is_delete")
    private Integer is_delete;

    /**
     * 创建时间（成交时间）
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
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getReceiver_name() == null ? other.getReceiver_name() == null : this.getReceiver_name().equals(other.getReceiver_name()))
            && (this.getReceiver_mobile() == null ? other.getReceiver_mobile() == null : this.getReceiver_mobile().equals(other.getReceiver_mobile()))
            && (this.getReceiver_address() == null ? other.getReceiver_address() == null : this.getReceiver_address().equals(other.getReceiver_address()))
            && (this.getTotal_amount() == null ? other.getTotal_amount() == null : this.getTotal_amount().equals(other.getTotal_amount()))
            && (this.getReal_pay_amount() == null ? other.getReal_pay_amount() == null : this.getReal_pay_amount().equals(other.getReal_pay_amount()))
            && (this.getPost_amount() == null ? other.getPost_amount() == null : this.getPost_amount().equals(other.getPost_amount()))
            && (this.getPay_method() == null ? other.getPay_method() == null : this.getPay_method().equals(other.getPay_method()))
            && (this.getLeft_msg() == null ? other.getLeft_msg() == null : this.getLeft_msg().equals(other.getLeft_msg()))
            && (this.getExtand() == null ? other.getExtand() == null : this.getExtand().equals(other.getExtand()))
            && (this.getIs_comment() == null ? other.getIs_comment() == null : this.getIs_comment().equals(other.getIs_comment()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getReceiver_name() == null) ? 0 : getReceiver_name().hashCode());
        result = prime * result + ((getReceiver_mobile() == null) ? 0 : getReceiver_mobile().hashCode());
        result = prime * result + ((getReceiver_address() == null) ? 0 : getReceiver_address().hashCode());
        result = prime * result + ((getTotal_amount() == null) ? 0 : getTotal_amount().hashCode());
        result = prime * result + ((getReal_pay_amount() == null) ? 0 : getReal_pay_amount().hashCode());
        result = prime * result + ((getPost_amount() == null) ? 0 : getPost_amount().hashCode());
        result = prime * result + ((getPay_method() == null) ? 0 : getPay_method().hashCode());
        result = prime * result + ((getLeft_msg() == null) ? 0 : getLeft_msg().hashCode());
        result = prime * result + ((getExtand() == null) ? 0 : getExtand().hashCode());
        result = prime * result + ((getIs_comment() == null) ? 0 : getIs_comment().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
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
        sb.append(", receiver_name=").append(receiver_name);
        sb.append(", receiver_mobile=").append(receiver_mobile);
        sb.append(", receiver_address=").append(receiver_address);
        sb.append(", total_amount=").append(total_amount);
        sb.append(", real_pay_amount=").append(real_pay_amount);
        sb.append(", post_amount=").append(post_amount);
        sb.append(", pay_method=").append(pay_method);
        sb.append(", left_msg=").append(left_msg);
        sb.append(", extand=").append(extand);
        sb.append(", is_comment=").append(is_comment);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}