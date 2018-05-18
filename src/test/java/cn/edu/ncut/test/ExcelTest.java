package cn.edu.ncut.test;

import cn.edu.ncut.test.models.Resources;
import cn.edu.ncut.test.models.Rightinfo;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Ocean lin on 2018/5/17.
 *
 * @author Ocean lin
 */
public class ExcelTest {

    @Test
    public void importExcel() {
        List<Resources> resourcesList = new ArrayList<>();
        List<Integer> siteList = new ArrayList<>();
        File file = new File("C:\\Users\\lenovo\\Desktop\\0802 资源资产数据模板.xlsx");

        try {
            InputStream in = new FileInputStream(file.getAbsolutePath());
            Map<String, List<List<Object>>> listob = new ImportExcelUtil().getBankListByExcel(in, "0802 资源资产数据模板.xlsx");
            List<List<Object>> lists = listob.get("0");
            for (int i = 0; i < lists.size(); i++) {
                if (lists.get(i).size() == 0) {
                    siteList.add(i);
                }
            }
            siteList.add(lists.size() - 1);

            int j = 0;
            for (int i = 0; i < siteList.size(); i++) {
                Resources resources = new Resources();
                List<Rightinfo> rightinfoList = Lists.newArrayList();
                int site = siteList.get(i);

                for (int k = 0; j < lists.size(); j++) {
                    if (siteList.contains(j) && j != siteList.get(siteList.size() - 1)) {
                        k = 0;
                        continue;
                    }
                    List<Object> lo = lists.get(j);
                    if (k == 0 || k == 2) {
                        k++;
                        continue;
                    } else if (k == 1) {
                        /********************************必填项*******************************/
                        // 构造主表Resources
                        resources.setOrignid((String) lo.get(0)); // 资源编号
                        resources.setResourcename((String) lo.get(1)); // 资源名称
                        resources.setIscutoff((String) lo.get(2)); // 是否截稿
                        resources.setResourcekind((String) lo.get(3)); // 类别
                        resources.setResgainway((String) lo.get(4));   // 获取方式
                        resources.setRightgainway((String) lo.get(5)); //归属方式
                        /********************************必填项*******************************/

                        /********************************选填项*******************************/
                        resources.setResmedium((String) lo.get(6));   // 介质
                        resources.setSignname((String) lo.get(7));   // 作者署名

                        // todo resources.setAuthorid(authorinfoDao.getByName((String) lo.get(8)).getId()); // 作者

                        // 	todo 权利来源 第9列

                        resources.setResfinishdate(ImportExcelUtil.getTimestamp((String) lo.get(10)));// 创作完成日期 10
                        resources.setPublicNation((String) lo.get(11));          // 创作国家
                        resources.setPublicCity((String) lo.get(12));// 创作地点（城市）
                        resources.setIsrelease((String) lo.get(13)); // 是否已发表
                        resources.setFstrlsadd((String) lo.get(14)); // 首发地址
                        resources.setFstrlsdate(ImportExcelUtil.getTimestamp((String) lo.get(15)));// 发表日期
                        resources.setDepartmentnum((String) lo.get(16));        // 所属部门
                        resources.setIsbnnum((String) lo.get(17));  // 等级	ISBN/版号/播放许可证
                        // todo reslabel 关键字  第19列
                        // todo resdiscribe 资源内容描述  第20列


                        Float resourcecost = 0.0f; // 成本
                        if (!"".equals(lo.get(21)) && lo.get(21) != null) {
                            resourcecost = Float.valueOf((String) lo.get(17));
                        }
                        resources.setResourcecost(resourcecost);

                        /********************************选填项*******************************/
                        // todo    resources.preInsert();

                        k++;
                    } else if (j < site) {
                        // 构造子表Rightinfo
                        Rightinfo rightinfo = new Rightinfo();
                        rightinfo.setCopyright((String) lo.get(0)); // 权利项 copyright
                        rightinfo.setStartdate(ImportExcelUtil.getTimestamp((String) lo.get(1))); // 开始时间 startdate
                        rightinfo.setFinishdate(ImportExcelUtil.getTimestamp((String) lo.get(2))); // 	到期时间 finishdate
                        rightinfo.setGainway((String) lo.get(3)); // 取得方式  gainway
                        rightinfo.setRightattribute((String) lo.get(4)); // 权利属性 rightattribute
                        // todo finishplacearea 使用地域
                        rightinfo.setLanguages((String) lo.get(6)); // 使用语种 languages
                        // todo  rightrestrict 其他限制
                        // todo  信息网络传播权使用限制
                        rightinfo.setNote((String) lo.get(9)); // 补充说明 note
                        rightinfoList.add(rightinfo);
                    } else {
                        resources.setRightinfoList(rightinfoList);
                        resourcesList.add(resources);
                        j = site + 1;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


//        for (Resources r : resourcesList)
//        {
//            System.out.println(r.toString());
//            for(Rightinfo ri :r.getRightinfoList())
//            {
//                System.out.println(ri.toString());
//            }
//        }

    }


}
