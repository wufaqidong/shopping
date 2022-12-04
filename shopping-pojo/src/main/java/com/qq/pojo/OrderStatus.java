package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 订单状态表;订单的每个状态更改都需要进行记录
10：待付款  20：已付款，待发货  30：已发货，待收货（7天自动确认）  40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭）
退货/退货，此分支流程不做，所以不加入
 * @TableName order_status
 */
@TableName(value ="order_status")
@Data
public class OrderStatus implements Serializable {
    /**
     * 订单ID;对应订单表的主键id
     */
    @TableId(value = "order_id")
    private String order_id;

    /**
     * 订单状态
     */
    @TableField(value = "order_status")
    private Integer order_status;

    /**
     * 订单创建时间;对应[10:待付款]状态
     */
    @TableField(value = "created_time")
    private LocalDateTime created_time;

    /**
     * 支付成功时间;对应[20:已付款，待发货]状态
     */
    @TableField(value = "pay_time")
    private LocalDateTime pay_time;

    /**
     * 发货时间;对应[30：已发货，待收货]状态
     */
    @TableField(value = "deliver_time")
    private LocalDateTime deliver_time;

    /**
     * 交易成功时间;对应[40：交易成功]状态
     */
    @TableField(value = "success_time")
    private LocalDateTime success_time;

    /**
     * 交易关闭时间;对应[50：交易关闭]状态
     */
    @TableField(value = "close_time")
    private LocalDateTime close_time;

    /**
     * 留言时间;用户在交易成功后的留言时间
     */
    @TableField(value = "comment_time")
    private LocalDateTime comment_time;

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
        OrderStatus other = (OrderStatus) that;
        return (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getOrder_status() == null ? other.getOrder_status() == null : this.getOrder_status().equals(other.getOrder_status()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getPay_time() == null ? other.getPay_time() == null : this.getPay_time().equals(other.getPay_time()))
            && (this.getDeliver_time() == null ? other.getDeliver_time() == null : this.getDeliver_time().equals(other.getDeliver_time()))
            && (this.getSuccess_time() == null ? other.getSuccess_time() == null : this.getSuccess_time().equals(other.getSuccess_time()))
            && (this.getClose_time() == null ? other.getClose_time() == null : this.getClose_time().equals(other.getClose_time()))
            && (this.getComment_time() == null ? other.getComment_time() == null : this.getComment_time().equals(other.getComment_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getOrder_status() == null) ? 0 : getOrder_status().hashCode());
        result = prime * result + ((getCreated_time() == null) ? 0 : getCreated_time().hashCode());
        result = prime * result + ((getPay_time() == null) ? 0 : getPay_time().hashCode());
        result = prime * result + ((getDeliver_time() == null) ? 0 : getDeliver_time().hashCode());
        result = prime * result + ((getSuccess_time() == null) ? 0 : getSuccess_time().hashCode());
        result = prime * result + ((getClose_time() == null) ? 0 : getClose_time().hashCode());
        result = prime * result + ((getComment_time() == null) ? 0 : getComment_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", order_id=").append(order_id);
        sb.append(", order_status=").append(order_status);
        sb.append(", created_time=").append(created_time);
        sb.append(", pay_time=").append(pay_time);
        sb.append(", deliver_time=").append(deliver_time);
        sb.append(", success_time=").append(success_time);
        sb.append(", close_time=").append(close_time);
        sb.append(", comment_time=").append(comment_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}