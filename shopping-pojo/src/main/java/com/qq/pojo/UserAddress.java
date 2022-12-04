package com.qq.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户地址表 
 * @TableName user_address
 */
@TableName(value ="user_address")
@Data
public class UserAddress implements Serializable {
    /**
     * 地址主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 关联用户id
     */
    @TableField(value = "user_id")
    private String user_id;

    /**
     * 收件人姓名
     */
    @TableField(value = "receiver")
    private String receiver;

    /**
     * 收件人手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 省份
     */
    @TableField(value = "province")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 区县
     */
    @TableField(value = "district")
    private String district;

    /**
     * 详细地址
     */
    @TableField(value = "detail")
    private String detail;

    /**
     * 扩展字段
     */
    @TableField(value = "extand")
    private String extand;

    /**
     * 是否默认地址
     */
    @TableField(value = "is_default")
    private Integer is_default;

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
        UserAddress other = (UserAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getExtand() == null ? other.getExtand() == null : this.getExtand().equals(other.getExtand()))
            && (this.getIs_default() == null ? other.getIs_default() == null : this.getIs_default().equals(other.getIs_default()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getExtand() == null) ? 0 : getExtand().hashCode());
        result = prime * result + ((getIs_default() == null) ? 0 : getIs_default().hashCode());
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
        sb.append(", receiver=").append(receiver);
        sb.append(", mobile=").append(mobile);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", detail=").append(detail);
        sb.append(", extand=").append(extand);
        sb.append(", is_default=").append(is_default);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}