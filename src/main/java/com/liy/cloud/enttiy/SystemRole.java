package com.liy.cloud.enttiy;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class SystemRole  {

    @Id

    private Long id;

    /**
     * 租户id
     */
    @Column(name = "tenant_id")
    private Long tenantId;

    /**
     * 租户名称
     */
    @Column(name = "tenant_name")
    private String tenantName;

    /**
     * 租户类型
     */
    @Column(name = "tenant_type")
    private Integer tenantType;

    /**
     * 所属系统编号
     */
    @Column(name = "project_id")
    private Long projectId;

    /**
     * 所属系统名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 系统角色名称
     */
    private String name;

    /**
     * 系统角色名称拼音
     */
    private String pinyin;

    /**
     * 系统角色名称简拼
     */
    @Column(name = "short_pinyin")
    private String shortPinyin;

    /**
     * 功能权限字符串，e.g. home:C|R|U,user:R
     */
    private String permissions;

    /**
     * 备注
     */
    private String descp;

    /**
     * 状态：0=不可用，1=正常
     */
    private Integer status;

    /**
     * 最后修改人账户
     */
    @Column(name = "modified_account")
    private String modifiedAccount;

    /**
     * 最后修改人名称
     */
    @Column(name = "modified_name")
    private String modifiedName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modified_time")
    private Date modifiedTime;

    @Column(name = "access_type")
    private Integer accessType;
}
