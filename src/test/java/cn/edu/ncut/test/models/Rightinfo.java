/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.edu.ncut.test.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.List;

/**
 * 资源表Entity
 *
 * @author zhangq
 * @version 2018-01-19
 */
public class Rightinfo {

    private static final long serialVersionUID = 1L;
    private String rightinfoid;        // rightinfoid
    private String copyright;        // 权利名称
    private Resources resources;        // 资源ID 父类
    private Date startdate;        // 权利开始时间
    private Date finishdate;        // 权利结束时间
    private String region;        // 权利作用范围
    private String belongway;        // 权利归属方式
    private String gainway;        // 权利取得方式
    private String contactid;        // 合同ID
    private String note;        // 备注
    private String rightattribute;        // 权利属性
    private Date createtime;        // 创建时间
    private String createuser;        // 创建人
    private String personalproduct;        // 许可方式
    private String cooperationproduct;        // 权利归属方式
    private String legalperson;        //
    private String positionproduct;        // 限制条件
    private String entrustproduct;        // 特殊使用方式限制
    private String languages;        // 语种
    private String finishplacearea;        // 区域   	territoryrestrict数据项

    private String rightrestrict;       //其他限制

    private String createuserdesc;        // createuserdesc
    private String contractname;//合同名称
    private String rightno;// 权利编号
    private String status;// 权利状态     1:问题资产   2：过期资产
    private String statusreason;//问题原因 1 、权属不清  2、超限使用   3、超期使用
    private String usestatus;//使用状态
    private Double costprice;//成本价格
    private String isupdateprice;//是否变更过成本价格

    private String contractnum;
    private String resourceno;
    private String resourcename;

    private List<String> selectedRightList;

    public Rightinfo() {
        super();
    }


    public Rightinfo(Resources resources) {
        this.resources = resources;
    }

    public String getIsupdateprice() {
        return isupdateprice;
    }

    public void setIsupdateprice(String isupdateprice) {
        this.isupdateprice = isupdateprice;
    }

    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRightno() {
        return rightno;
    }

    public void setRightno(String rightno) {
        this.rightno = rightno;
    }

    @Length(min = 1, max = 32, message = "rightinfoid长度必须介于 1 和 32 之间")
    public String getRightinfoid() {
        return rightinfoid;
    }

    public void setRightinfoid(String rightinfoid) {
        this.rightinfoid = rightinfoid;
    }

    @Length(min = 0, max = 32, message = "资源ID长度必须介于 0 和 32 之间")
    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public String getContractname() {
        return contractname;
    }

    public void setContractname(String contractname) {
        this.contractname = contractname;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    @Length(min = 0, max = 50, message = "权利作用范围长度必须介于 0 和 50 之间")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Length(min = 0, max = 20, message = "权利归属方式长度必须介于 0 和 20 之间")
    public String getBelongway() {
        return belongway;
    }

    public void setBelongway(String belongway) {
        this.belongway = belongway;
    }

    @Length(min = 0, max = 20, message = "权利取得方式长度必须介于 0 和 20 之间")
    public String getGainway() {
        return gainway;
    }

    public void setGainway(String gainway) {
        this.gainway = gainway;
    }

    @Length(min = 0, max = 32, message = "合同ID长度必须介于 0 和 32 之间")
    public String getContactid() {
        return contactid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    @Length(min = 0, max = 200, message = "备注长度必须介于 0 和 200 之间")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Length(min = 0, max = 32, message = "权利属性长度必须介于 0 和 32 之间")
    public String getRightattribute() {
        return rightattribute;
    }

    public void setRightattribute(String rightattribute) {
        this.rightattribute = rightattribute;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Length(min = 0, max = 32, message = "createuser长度必须介于 0 和 32 之间")
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Length(min = 0, max = 32, message = "复制权长度必须介于 0 和 32 之间")
    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @Length(min = 0, max = 32, message = "个人产品长度必须介于 0 和 32 之间")
    public String getPersonalproduct() {
        return personalproduct;
    }

    public void setPersonalproduct(String personalproduct) {
        this.personalproduct = personalproduct;
    }

    @Length(min = 0, max = 32, message = "合作作品长度必须介于 0 和 32 之间")
    public String getCooperationproduct() {
        return cooperationproduct;
    }

    public void setCooperationproduct(String cooperationproduct) {
        this.cooperationproduct = cooperationproduct;
    }

    @Length(min = 0, max = 32, message = "法人作品长度必须介于 0 和 32 之间")
    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    @Length(min = 0, max = 32, message = "职务作品长度必须介于 0 和 32 之间")
    public String getPositionproduct() {
        return positionproduct;
    }

    public void setPositionproduct(String positionproduct) {
        this.positionproduct = positionproduct;
    }

    @Length(min = 0, max = 32, message = "委托作品长度必须介于 0 和 32 之间")
    public String getEntrustproduct() {
        return entrustproduct;
    }

    public void setEntrustproduct(String entrustproduct) {
        this.entrustproduct = entrustproduct;
    }

    @Length(min = 0, max = 32, message = "语种长度必须介于 0 和 32 之间")
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getFinishplacearea() {
        return finishplacearea;
    }

    public void setFinishplacearea(String finishplacearea) {
        this.finishplacearea = finishplacearea;
    }

    @Length(min = 0, max = 32, message = "createuserdesc长度必须介于 0 和 32 之间")
    public String getCreateuserdesc() {
        return createuserdesc;
    }

    public void setCreateuserdesc(String createuserdesc) {
        this.createuserdesc = createuserdesc;
    }

    public String getContractnum() {
        return contractnum;
    }

    public void setContractnum(String contractnum) {
        this.contractnum = contractnum;
    }

    public String getResourceno() {
        return resourceno;
    }

    public void setResourceno(String resourceno) {
        this.resourceno = resourceno;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getStatusreason() {
        return statusreason;
    }

    public void setStatusreason(String statusreason) {
        this.statusreason = statusreason;
    }

    public String getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(String usestatus) {
        this.usestatus = usestatus;
    }

    public String getRightrestrict() {
        return rightrestrict;
    }

    public void setRightrestrict(String rightrestrict) {
        this.rightrestrict = rightrestrict;
    }

    public List<String> getSelectedRightList() {
        return selectedRightList;
    }

    public void setSelectedRightList(List<String> selectedRightList) {
        this.selectedRightList = selectedRightList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rightinfo{");
        sb.append("rightinfoid='").append(rightinfoid).append('\'');
        sb.append(", copyright='").append(copyright).append('\'');
        sb.append(", resources=").append(resources);
        sb.append(", startdate=").append(startdate);
        sb.append(", finishdate=").append(finishdate);
        sb.append(", region='").append(region).append('\'');
        sb.append(", belongway='").append(belongway).append('\'');
        sb.append(", gainway='").append(gainway).append('\'');
        sb.append(", contactid='").append(contactid).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append(", rightattribute='").append(rightattribute).append('\'');
        sb.append(", createtime=").append(createtime);
        sb.append(", createuser='").append(createuser).append('\'');
        sb.append(", personalproduct='").append(personalproduct).append('\'');
        sb.append(", cooperationproduct='").append(cooperationproduct).append('\'');
        sb.append(", legalperson='").append(legalperson).append('\'');
        sb.append(", positionproduct='").append(positionproduct).append('\'');
        sb.append(", entrustproduct='").append(entrustproduct).append('\'');
        sb.append(", languages='").append(languages).append('\'');
        sb.append(", finishplacearea='").append(finishplacearea).append('\'');
        sb.append(", rightrestrict='").append(rightrestrict).append('\'');
        sb.append(", createuserdesc='").append(createuserdesc).append('\'');
        sb.append(", contractname='").append(contractname).append('\'');
        sb.append(", rightno='").append(rightno).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", statusreason='").append(statusreason).append('\'');
        sb.append(", usestatus='").append(usestatus).append('\'');
        sb.append(", costprice=").append(costprice);
        sb.append(", isupdateprice='").append(isupdateprice).append('\'');
        sb.append(", contractnum='").append(contractnum).append('\'');
        sb.append(", resourceno='").append(resourceno).append('\'');
        sb.append(", resourcename='").append(resourcename).append('\'');
        sb.append(", selectedRightList=").append(selectedRightList);
        sb.append('}');
        return sb.toString();
    }
}