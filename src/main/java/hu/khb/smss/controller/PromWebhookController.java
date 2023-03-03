package hu.khb.smss.controller;

import hu.khb.smss.prometheus.model.Root;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromWebhookController {

    @PostMapping("/prom")
    public void webhookReceiver(@RequestBody Root root) {

    }

}
