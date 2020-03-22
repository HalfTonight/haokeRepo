package ll.p3143.haoke.dubbo.server.api;

import com.alibaba.dubbo.config.annotation.Service;
import ll.p3143.haoke.dubbo.server.pojo.HouseResource;
import ll.p3143.haoke.dubbo.server.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class ApiHouseResourceImpl implements ApiHouseResource {
    @Autowired
    HRService hrService;
    @Override
    public int save(HouseResource houseResource) {
        return this.hrService.save(houseResource);
    }
}
