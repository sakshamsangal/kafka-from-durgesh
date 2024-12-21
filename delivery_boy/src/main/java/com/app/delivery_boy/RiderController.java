package com.app.delivery_boy;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RiderController {

    private  final RiderService riderService;

    @PostMapping("/rider")
    public ResponseEntity<?> postLocation(){
        riderService.updateLocation();
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
