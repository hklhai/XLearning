/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.edu.ncut.test.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import java.util.Date;
import java.util.List;

/**
 * 资源表Entity
 *
 * @author zhangq
 * @version 2018-01-19
 */
public class Resources {

    private static final long serialVersionUID = 1L;
    private String authorid;        // 作者ID
    private String detailid;        // 详细信息ID
    private String crownerids;        // 著作权人ID
    private String contactids;        // 合同ID
    private String authorname;
    private String rightinfoid;        // 权利信息ID
    private String audvispdtid;        // 音像制品信息ID
    private String orignid;        // 原资源ID
    private String iscontact;        // 是否关联合同
    private String resourceno;        // 资源编号
    private String resourcename;        // 资源名称
    private String resourcekind;        // 作品类别
    private String resmedium;        // 资源介质
    private String reslevel;        // 资源级别
    private Date resfinishdate;        // 创作完成日期


    private String finishplace;        // 创作完成地点
    private String isrelease;        // 是否已发表

    private String iscutoff;         //是否已截稿
    private Date cutoffdate;        //截稿日期
    private String isfstrls;        // 是否首发
    private String fstrlsadd;        // 首发地址
    private Date fstrlsdate;        // 发表日期
    private String releaseplace;        // 发表地址
    private String resourcelabel;        // 资源标签
    private Integer count;        // 数量
    private String createnature;        // 创作性质
    private String resgainway;        // 资源取得方式
    private Long cost;        // 成本
    private String resdiscribe;        // 资源描述
    private String rightgainway;        // 权利归属方式
    private String rightgainnote;        // 权利归属说明
    private String warehousestatus;        // warehousestatus
    private String departmentnum;        // 部门编号
    private String status;        // 状态
    private String isbnnum;        // ISBN编号
    private String relevantcontract;        // 关联合同
    private String resourcetype;        // 资源类型
    private Float resourcecost;   // 资产成本
    private String specialrestrict;   // 特殊使用方式限制
    private String previewimg;    // 预览图
    private String credentials;   // 资质证明
    private String otherrestrict;  // 其他特殊限制
    private String isContinue;   // 是否继续新建
    private String isPutInStorage; // 是否入库
    //创作完成地点
    private String createNation;
    private String createCity;
    private String createdate;
    //首次发表地点
    private String publicNation;
    private String publicCity;
    //作品署名
    private String signname;

    private String costSort;
    private String createdateSort;
    private String cstartdate;
    private String cenddate;
    private String warningdate;

    public String publicNationSel;
    public String publicCitySel;
    public String createNationSel;
    public String createCitySel;
    public String righterid;

    private String reslabel;

    private List<String> resourcekindlist;
    private List<String> statuslist;
    private List<String> rightgainnotelist;  //用于版权信息管理  查询          问题资产、历史资产、即将过期list
    public String isbnnumatt;//isbn编号附件
    public String rightgainwayatt;//权力归属方式附件

    private List<Rightinfo> rightinfoList = Lists.newArrayList();        // 子表列表

    public Resources() {
        super();
    }

    public String getIsbnnumatt() {
        return isbnnumatt;
    }

    public void setIsbnnumatt(String isbnnumatt) {
        this.isbnnumatt = isbnnumatt;
    }

    public String getRightgainwayatt() {
        return rightgainwayatt;
    }

    public void setRightgainwayatt(String rightgainwayatt) {
        this.rightgainwayatt = rightgainwayatt;
    }

    @Length(min = 0, max = 500, message = "作者ID长度必须介于 0 和 500 之间")
    public String getAuthorid() {
        return authorid;
    }

    public void setAuthorid(String authorid) {
        this.authorid = authorid;
    }

    @Length(min = 0, max = 32, message = "详细信息ID长度必须介于 0 和 32 之间")
    public String getDetailid() {
        return detailid;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getPublicNationSel() {
        return publicNationSel;
    }

    public void setPublicNationSel(String publicNationSel) {
        this.publicNationSel = publicNationSel;
    }

    public String getPublicCitySel() {
        return publicCitySel;
    }

    public void setPublicCitySel(String publicCitySel) {
        this.publicCitySel = publicCitySel;
    }

    public String getCreateNationSel() {
        return createNationSel;
    }

    public void setCreateNationSel(String createNationSel) {
        this.createNationSel = createNationSel;
    }

    public String getCreateCitySel() {
        return createCitySel;
    }

    public void setCreateCitySel(String createCitySel) {
        this.createCitySel = createCitySel;
    }

    public String getSignname() {
        return signname;
    }

    public void setSignname(String signname) {
        this.signname = signname;
    }

    public void setDetailid(String detailid) {
        this.detailid = detailid;
    }

    @Length(min = 0, max = 500, message = "著作权人ID长度必须介于 0 和 500 之间")
    public String getCrownerids() {
        return crownerids;
    }

    public void setCrownerids(String crownerids) {
        this.crownerids = crownerids;
    }

    public String getCreateNation() {
        return createNation;
    }

    public void setCreateNation(String createNation) {
        this.createNation = createNation;
    }

    public String getCreateCity() {
        return createCity;
    }

    public void setCreateCity(String createCity) {
        this.createCity = createCity;
    }

    public String getPublicNation() {
        return publicNation;
    }

    public void setPublicNation(String publicNation) {
        this.publicNation = publicNation;
    }

    public String getPublicCity() {
        return publicCity;
    }

    public void setPublicCity(String publicCity) {
        this.publicCity = publicCity;
    }

    @Length(min = 0, max = 500, message = "合同ID长度必须介于 0 和 500 之间")
    public String getContactids() {
        return contactids;
    }

    public void setContactids(String contactids) {
        this.contactids = contactids;
    }

    @Length(min = 0, max = 32, message = "权利信息ID长度必须介于 0 和 32 之间")
    public String getRightinfoid() {
        return rightinfoid;
    }

    public void setRightinfoid(String rightinfoid) {
        this.rightinfoid = rightinfoid;
    }

    @Length(min = 0, max = 32, message = "音像制品信息ID长度必须介于 0 和 32 之间")
    public String getAudvispdtid() {
        return audvispdtid;
    }

    public void setAudvispdtid(String audvispdtid) {
        this.audvispdtid = audvispdtid;
    }

    @Length(min = 0, max = 32, message = "原资源ID长度必须介于 0 和 32 之间")
    public String getOrignid() {
        return orignid;
    }

    public void setOrignid(String orignid) {
        this.orignid = orignid;
    }

    @Length(min = 0, max = 1, message = "是否关联合同长度必须介于 0 和 1 之间")
    public String getIscontact() {
        return iscontact;
    }

    public void setIscontact(String iscontact) {
        this.iscontact = iscontact;
    }


    @Length(min = 0, max = 32, message = "资源编号长度必须介于 0 和 32 之间")
    public String getResourceno() {
        return resourceno;
    }

    public void setResourceno(String resourceno) {
        this.resourceno = resourceno;
    }

    @Length(min = 0, max = 100, message = "资源名称长度必须介于 0 和 100 之间")
    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    @Length(min = 0, max = 50, message = "作品类别长度必须介于 0 和 50 之间")
    public String getResourcekind() {
        return resourcekind;
    }

    public void setResourcekind(String resourcekind) {
        this.resourcekind = resourcekind;
    }

    @Length(min = 0, max = 32, message = "资源介质长度必须介于 0 和 32 之间")
    public String getResmedium() {
        return resmedium;
    }

    public void setResmedium(String resmedium) {
        this.resmedium = resmedium;
    }

    @Length(min = 0, max = 32, message = "资源级别长度必须介于 0 和 32 之间")
    public String getReslevel() {
        return reslevel;
    }

    public void setReslevel(String reslevel) {
        this.reslevel = reslevel;
    }
	
	/*@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getFinishdate() {
		return finishdate;
	}

	public void setFinishdate(Date finishdate) {
		this.finishdate = finishdate;
	}*/

    @Length(min = 0, max = 200, message = "创作完成地点长度必须介于 0 和 200 之间")
    public String getFinishplace() {
        return finishplace;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getResfinishdate() {
        return resfinishdate;
    }

    public void setResfinishdate(Date resfinishdate) {
        this.resfinishdate = resfinishdate;
    }

    public void setFinishplace(String finishplace) {
        this.finishplace = finishplace;
    }


    @Length(min = 0, max = 1, message = "是否已发表长度必须介于 0 和 1 之间")
    public String getIsrelease() {
        return isrelease;
    }

    public void setIsrelease(String isrelease) {
        this.isrelease = isrelease;
    }

    @Length(min = 0, max = 1, message = "是否首发长度必须介于 0 和 1 之间")
    public String getIsfstrls() {
        return isfstrls;
    }

    public void setIsfstrls(String isfstrls) {
        this.isfstrls = isfstrls;
    }


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getFstrlsdate() {
        return fstrlsdate;
    }

    public void setFstrlsdate(Date fstrlsdate) {
        this.fstrlsdate = fstrlsdate;
    }

    @Length(min = 0, max = 200, message = "发表地址长度必须介于 0 和 200 之间")
    public String getReleaseplace() {
        return releaseplace;
    }

    public void setReleaseplace(String releaseplace) {
        this.releaseplace = releaseplace;
    }

    @Length(min = 0, max = 50, message = "资源标签长度必须介于 0 和 50 之间")
    public String getResourcelabel() {
        return resourcelabel;
    }

    public void setResourcelabel(String resourcelabel) {
        this.resourcelabel = resourcelabel;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Length(min = 0, max = 32, message = "创作性质长度必须介于 0 和 32 之间")
    public String getCreatenature() {
        return createnature;
    }

    public void setCreatenature(String createnature) {
        this.createnature = createnature;
    }

    @Length(min = 0, max = 50, message = "资源取得方式长度必须介于 0 和 50 之间")
    public String getResgainway() {
        return resgainway;
    }

    public void setResgainway(String resgainway) {
        this.resgainway = resgainway;
    }

    @Digits(integer = 10, fraction = 2, message = "请填写数字，小数位不能超过三位")
    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @Length(min = 0, max = 500, message = "资源描述长度必须介于 0 和 500 之间")
    public String getResdiscribe() {
        return resdiscribe;
    }

    public void setResdiscribe(String resdiscribe) {
        this.resdiscribe = resdiscribe;
    }

    @Length(min = 0, max = 32, message = "权利归属方式长度必须介于 0 和 32 之间")
    public String getRightgainway() {
        return rightgainway;
    }

    public void setRightgainway(String rightgainway) {
        this.rightgainway = rightgainway;
    }

    @Length(min = 0, max = 500, message = "权利归属说明长度必须介于 0 和 500 之间")
    public String getRightgainnote() {
        return rightgainnote;
    }

    public void setRightgainnote(String rightgainnote) {
        this.rightgainnote = rightgainnote;
    }

    @Length(min = 0, max = 20, message = "warehousestatus长度必须介于 0 和 20 之间")
    public String getWarehousestatus() {
        return warehousestatus;
    }

    public void setWarehousestatus(String warehousestatus) {
        this.warehousestatus = warehousestatus;
    }

    @Length(min = 0, max = 20, message = "部门编号长度必须介于 0 和 20 之间")
    public String getDepartmentnum() {
        return departmentnum;
    }

    public void setDepartmentnum(String departmentnum) {
        this.departmentnum = departmentnum;
    }

    @Length(min = 0, max = 20, message = "状态长度必须介于 0 和 20 之间")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Length(min = 0, max = 32, message = "ISBN编号长度必须介于 0 和 32 之间")
    public String getIsbnnum() {
        return isbnnum;
    }

    public void setIsbnnum(String isbnnum) {
        this.isbnnum = isbnnum;
    }

    @Length(min = 0, max = 32, message = "关联合同长度必须介于 0 和 32 之间")
    public String getRelevantcontract() {
        return relevantcontract;
    }

    public void setRelevantcontract(String relevantcontract) {
        this.relevantcontract = relevantcontract;
    }

    @Length(min = 0, max = 32, message = "资源类型长度必须介于 0 和 32 之间")
    public String getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype;
    }

    public List<Rightinfo> getRightinfoList() {
        return rightinfoList;
    }

    public void setRightinfoList(List<Rightinfo> rightinfoList) {
        this.rightinfoList = rightinfoList;
    }

    @Digits(integer = 10, fraction = 2, message = "请填写数字，小数位不能超过三位")
    public Float getResourcecost() {
        return resourcecost;
    }

    public void setResourcecost(Float resourcecost) {
        this.resourcecost = resourcecost;
    }

    public String getSpecialrestrict() {
        return specialrestrict;
    }

    public void setSpecialrestrict(String specialrestrict) {
        this.specialrestrict = specialrestrict;
    }

    public String getPreviewimg() {
        return previewimg;
    }

    public void setPreviewimg(String previewimg) {
        this.previewimg = previewimg;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getIsContinue() {
        return isContinue;
    }

    public void setIsContinue(String isContinue) {
        this.isContinue = isContinue;
    }

    public String getIsPutInStorage() {
        return isPutInStorage;
    }

    public void setIsPutInStorage(String isPutInStorage) {
        this.isPutInStorage = isPutInStorage;
    }

    public String getFstrlsadd() {
        return fstrlsadd;
    }

    public void setFstrlsadd(String fstrlsadd) {
        this.fstrlsadd = fstrlsadd;
    }

    public String getOtherrestrict() {
        return otherrestrict;
    }

    public void setOtherrestrict(String otherrestrict) {
        this.otherrestrict = otherrestrict;
    }

    public String getCostSort() {
        return costSort;
    }

    public void setCostSort(String costSort) {
        this.costSort = costSort;
    }

    public String getCreatedateSort() {
        return createdateSort;
    }

    public void setCreatedateSort(String createdateSort) {
        this.createdateSort = createdateSort;
    }

    public List<String> getResourcekindlist() {
        return resourcekindlist;
    }

    public void setResourcekindlist(List<String> resourcekindlist) {
        this.resourcekindlist = resourcekindlist;
    }

    public String getCstartdate() {
        return cstartdate;
    }

    public void setCstartdate(String cstartdate) {
        this.cstartdate = cstartdate;
    }

    public String getCenddate() {
        return cenddate;
    }

    public void setCenddate(String cenddate) {
        this.cenddate = cenddate;
    }

    public String getWarningdate() {
        return warningdate;
    }

    public void setWarningdate(String warningdate) {
        this.warningdate = warningdate;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public List<String> getRightgainnotelist() {
        return rightgainnotelist;
    }

    public void setRightgainnotelist(List<String> rightgainnotelist) {
        this.rightgainnotelist = rightgainnotelist;
    }

    public String getReslabel() {
        return reslabel;
    }

    public void setReslabel(String reslabel) {
        this.reslabel = reslabel;
    }

    public List<String> getStatuslist() {
        return statuslist;
    }

    public void setStatuslist(List<String> statuslist) {
        this.statuslist = statuslist;
    }

    public String getRighterid() {
        return righterid;
    }

    public Date getCutoffdate() {
        return cutoffdate;
    }

    public void setCutoffdate(Date cutoffdate) {
        this.cutoffdate = cutoffdate;
    }

    public void setRighterid(String righterid) {
        this.righterid = righterid;
    }

    public String getIscutoff() {
        return iscutoff;
    }

    public void setIscutoff(String iscutoff) {
        this.iscutoff = iscutoff;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Resources{");
        sb.append("authorid='").append(authorid).append('\'');
        sb.append(", detailid='").append(detailid).append('\'');
        sb.append(", crownerids='").append(crownerids).append('\'');
        sb.append(", contactids='").append(contactids).append('\'');
        sb.append(", authorname='").append(authorname).append('\'');
        sb.append(", rightinfoid='").append(rightinfoid).append('\'');
        sb.append(", audvispdtid='").append(audvispdtid).append('\'');
        sb.append(", orignid='").append(orignid).append('\'');
        sb.append(", iscontact='").append(iscontact).append('\'');
        sb.append(", resourceno='").append(resourceno).append('\'');
        sb.append(", resourcename='").append(resourcename).append('\'');
        sb.append(", resourcekind='").append(resourcekind).append('\'');
        sb.append(", resmedium='").append(resmedium).append('\'');
        sb.append(", reslevel='").append(reslevel).append('\'');
        sb.append(", resfinishdate=").append(resfinishdate);
        sb.append(", finishplace='").append(finishplace).append('\'');
        sb.append(", isrelease='").append(isrelease).append('\'');
        sb.append(", iscutoff='").append(iscutoff).append('\'');
        sb.append(", cutoffdate=").append(cutoffdate);
        sb.append(", isfstrls='").append(isfstrls).append('\'');
        sb.append(", fstrlsadd='").append(fstrlsadd).append('\'');
        sb.append(", fstrlsdate=").append(fstrlsdate);
        sb.append(", releaseplace='").append(releaseplace).append('\'');
        sb.append(", resourcelabel='").append(resourcelabel).append('\'');
        sb.append(", count=").append(count);
        sb.append(", createnature='").append(createnature).append('\'');
        sb.append(", resgainway='").append(resgainway).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", resdiscribe='").append(resdiscribe).append('\'');
        sb.append(", rightgainway='").append(rightgainway).append('\'');
        sb.append(", rightgainnote='").append(rightgainnote).append('\'');
        sb.append(", warehousestatus='").append(warehousestatus).append('\'');
        sb.append(", departmentnum='").append(departmentnum).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", isbnnum='").append(isbnnum).append('\'');
        sb.append(", relevantcontract='").append(relevantcontract).append('\'');
        sb.append(", resourcetype='").append(resourcetype).append('\'');
        sb.append(", resourcecost=").append(resourcecost);
        sb.append(", specialrestrict='").append(specialrestrict).append('\'');
        sb.append(", previewimg='").append(previewimg).append('\'');
        sb.append(", credentials='").append(credentials).append('\'');
        sb.append(", otherrestrict='").append(otherrestrict).append('\'');
        sb.append(", isContinue='").append(isContinue).append('\'');
        sb.append(", isPutInStorage='").append(isPutInStorage).append('\'');
        sb.append(", createNation='").append(createNation).append('\'');
        sb.append(", createCity='").append(createCity).append('\'');
        sb.append(", createdate='").append(createdate).append('\'');
        sb.append(", publicNation='").append(publicNation).append('\'');
        sb.append(", publicCity='").append(publicCity).append('\'');
        sb.append(", signname='").append(signname).append('\'');
        sb.append(", costSort='").append(costSort).append('\'');
        sb.append(", createdateSort='").append(createdateSort).append('\'');
        sb.append(", cstartdate='").append(cstartdate).append('\'');
        sb.append(", cenddate='").append(cenddate).append('\'');
        sb.append(", warningdate='").append(warningdate).append('\'');
        sb.append(", publicNationSel='").append(publicNationSel).append('\'');
        sb.append(", publicCitySel='").append(publicCitySel).append('\'');
        sb.append(", createNationSel='").append(createNationSel).append('\'');
        sb.append(", createCitySel='").append(createCitySel).append('\'');
        sb.append(", righterid='").append(righterid).append('\'');
        sb.append(", reslabel='").append(reslabel).append('\'');
        sb.append(", resourcekindlist=").append(resourcekindlist);
        sb.append(", statuslist=").append(statuslist);
        sb.append(", rightgainnotelist=").append(rightgainnotelist);
        sb.append(", isbnnumatt='").append(isbnnumatt).append('\'');
        sb.append(", rightgainwayatt='").append(rightgainwayatt).append('\'');
        sb.append(", rightinfoList=").append(rightinfoList);
        sb.append('}');
        return sb.toString();
    }
}