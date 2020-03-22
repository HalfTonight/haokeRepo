package ll.p3143.haoke.dubbo.server.service.impl;


import ll.p3143.haoke.dubbo.server.pojo.HouseResource;
import ll.p3143.haoke.dubbo.server.service.HRService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class HouseResourcesServiceImpl extends BaseServiceImpl implements HRService {

    /**
     * @param houseResources
     *
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    @Override
    public int save(HouseResource houseResources) {

        // 添加校验或者是其他的一些逻辑

        if(StringUtils.isBlank(houseResources.getTitle())){
            // 不符合要求
            return -1;
        }

        return super.save(houseResources);
    }
}
