package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-10T17:14:02.142903+09:00[Asia/Tokyo]")

@Controller
@RequestMapping("${openapi.inheritanceTest.base-path:}")
public class SampleBApiController implements SampleBApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SampleBApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
