package io.reflectoring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-10T17:37:19.958+02:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.storeAPI.base-path:/store/v1}")
public class ItemApiController implements ItemApi {

    private final ItemApiDelegate delegate;

    public ItemApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ItemApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ItemApiDelegate() {});
    }

    @Override
    public ItemApiDelegate getDelegate() {
        return delegate;
    }

}
