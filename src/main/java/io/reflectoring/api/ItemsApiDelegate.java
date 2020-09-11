package io.reflectoring.api;

import io.reflectoring.model.InlineResponse200;
import io.reflectoring.model.ItemStatus;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.*;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ItemsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-10T17:37:19.958+02:00[Europe/Berlin]")

public interface ItemsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
//        HttpServletRequest request  = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes())
//            .getRequest();
//        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
//        NativeWebRequest req = new ServletWebRequest(servletRequestAttributes.getRequest());
//        return Optional.of(req);
        return Optional.empty();
    }

    /**
     * GET /items
     * Recupera una lista di oggetti dallo store
     *
     * @param limit  (optional, default to 10)
     * @param cursor  (optional)
     * @return Una lista di oggetti presenti nello store (status code 200)
     * @see ItemsApi#apiGetItems
     */
    default ResponseEntity<InlineResponse200> apiGetItems(Integer limit,
        UUID cursor) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"offset\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"count\" : 10, \"limit\" : 10, \"items\" : [ { \"item\" : { \"a\" : 1, \"b\" : \"ciao\" }, \"timestamp\" : \"2018-12-30T12:23:32Z\n\" }, { \"item\" : { \"a\" : 1, \"b\" : \"ciao\" }, \"timestamp\" : \"2018-12-30T12:23:32Z\n\" }, { \"item\" : { \"a\" : 1, \"b\" : \"ciao\" }, \"timestamp\" : \"2018-12-30T12:23:32Z\n\" }, { \"item\" : { \"a\" : 1, \"b\" : \"ciao\" }, \"timestamp\" : \"2018-12-30T12:23:32Z\n\" }, { \"item\" : { \"a\" : 1, \"b\" : \"ciao\" }, \"timestamp\" : \"2018-12-30T12:23:32Z\n\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /items : Inserisce un oggetto nello store
     * Inserisce un oggetto nello store 
     *
     * @param body  (required)
     * @return Bad Request (status code 400)
     *         or Too many requests (status code 429)
     *         or Service Unavailable (status code 503)
     *         or L&#39;oggetto è stato aggiunto correttamente nello store Il percorso dell&#39;oggetto viene ritornato nell&#39;header &#x60;Location&#x60;  (status code 201)
     *         or Unexpected error (status code 200)
     * @see ItemsApi#apiPostItems
     */
    default ResponseEntity<ItemStatus> apiPostItems(Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"status\" : \"success\", \"url\" : \"http://localhost:5000/item/8d549ad5-950d-4b35-b85b-64712a57397b\", \"id\" : \"8d549ad5-950d-4b35-b85b-64712a57397b\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
