package sotest.code;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SoDao {
    /**
     * @Description: update usernum
     * @Param: [personBean]
     * @return: java.util.List<com.shineyue.zzjg.bean.PersonBean>
     * @Author: Mr.Wang
     * @Date: 2020/5/14
     */
//    @Update("begin" +
//            " update pt_jg set usernum = 1 where jgbh in (#{bm});" +
//            " update pt_bm set usernum = 1 where bmbh in (#{bm});" +
//            "end;")
    @Update("begin" +
            " update pt_jg set usernum = 1 where jgbh = '15';" +
            " update pt_bm set usernum = 1 where bmbh = '15';" +
            "end;")
    public int incUsernum();
}
