package com.rainbow.common.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
@ApiModel("用户")
public class User {
    // fields
    @ApiModelProperty("用户主键")
    @TableId(value="id",type = IdType.AUTO)
    protected Integer id;
    @ApiModelProperty("ship-id")
    @TableField("shipping_id")
    protected Integer shippingId;
    @ApiModelProperty("发单单价,rate分")
    @TableField("shipping_rate")
    protected Integer shippingRate;
}
