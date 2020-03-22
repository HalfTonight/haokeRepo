package ll.p3143.haoke.dubbo.server.api;

import ll.p3143.haoke.dubbo.server.pojo.HouseResource;

public interface ApiHouseResource {
    /**
     * 新增房源
     *
     * @param houseResource
     *
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    int save(HouseResource houseResource);
}
