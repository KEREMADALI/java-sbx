package com.adl.javasbx.api.rest;

import com.adl.javasbx.business.PseudoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller/v1")
@RequiredArgsConstructor
public class PseudoController
{
    private final PseudoService pseudoService;

    @GetMapping("/getFoo")
    public void getFoo() throws InterruptedException {
        pseudoService.getFoo();
    }
}
