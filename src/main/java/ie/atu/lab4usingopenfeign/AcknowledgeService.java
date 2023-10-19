package ie.atu.lab4usingopenfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "acknowledge-service", url = "http://localhost:8082")

public interface AcknowledgeService {

    @PostMapping("/acknowledge")
    String someDetails(@RequestBody UserDetails userDetails);

}