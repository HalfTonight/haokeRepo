package ll.p3143.haoke.dubbo.api.service;


import com.alibaba.dubbo.config.annotation.Reference;
import ll.p3143.haoke.dubbo.server.api.ApiHouseResource;
import ll.p3143.haoke.dubbo.server.pojo.HouseResource;
import org.springframework.stereotype.Service;


@Service
public class ApiService {
    @Reference(version = "1.0.0")
    ApiHouseResource apiHouseResource;

    public boolean save(HouseResource houseResource){
        int result = this.apiHouseResource.save(houseResource);
        return result==1;

    }

}
