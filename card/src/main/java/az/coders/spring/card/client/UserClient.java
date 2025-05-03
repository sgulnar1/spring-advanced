package az.coders.spring.card.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user", url = "${user.client.url}")
public interface UserClient {
    @GetMapping
    String getName(@RequestParam Integer id);
}
