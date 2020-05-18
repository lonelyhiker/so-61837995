package sotest.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class SoService {
    @Autowired
    SoDao soDao;
    @Transactional
    public int incincUsernum(){
//        String bm = "'15','16','17'";
        int i = soDao.incUsernum();
        System.out.println("--->"+i);
        return i;
    }
}
