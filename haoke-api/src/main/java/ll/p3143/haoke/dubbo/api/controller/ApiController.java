package ll.p3143.haoke.dubbo.api.controller;

import ll.p3143.haoke.dubbo.server.pojo.HouseResource;
import ll.p3143.haoke.dubbo.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("house/resources")
public class ApiController {

    @Autowired
    ApiService apiService;
    @PostMapping
    @ResponseBody
    public ResponseEntity<Void> save(@RequestBody HouseResource houseResource){
        try {
            boolean bool = this.apiService.save(houseResource);
            if (bool) {
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    @GetMapping
    @ResponseBody
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("ok");
    }
}
