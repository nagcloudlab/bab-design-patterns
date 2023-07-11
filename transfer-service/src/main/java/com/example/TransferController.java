package com.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    @PostMapping("/api/transfer")
    public TransferResponse transfer(@RequestBody TransferRequest transferRequest) {
        System.out.println(transferRequest);
        TransferResponse transferResponse = new TransferResponse();
        transferResponse.setStatus("success");
        return transferResponse;
    }

}
