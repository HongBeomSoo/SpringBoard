package com.spring;

import com.spring.domain.ProductVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

    @RequestMapping("/doJson")
    @ResponseBody
    public ProductVO doJson() {

        ProductVO productVO = new ProductVO("laptop", 3000000);

        return productVO;
    }
}
