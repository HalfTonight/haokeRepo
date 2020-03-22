package ll.p3143.haoke.dubbo.server.service;


import ll.p3143.haoke.dubbo.server.pojo.HouseResource;


public interface HRService {
    //spring Service 可以做自己的service
    /**
     * 新增房源
     *
     * @param houseResource
     *
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    int save(HouseResource houseResource);
}
