package io.reflectoring.api;

import io.reflectoring.model.Item;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ItemApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-10T17:37:19.958+02:00[Europe/Berlin]")

public interface ItemApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /item/{uuid} : Ritorna l&#39;oggetto archiviato nello store.
     * Ritorna un l&#39;oggetto archiviato nello store insieme al timestamp di archiviazione. 
     *
     * @param uuid  (required)
     * @return Bad Request (status code 400)
     *         or Too many requests (status code 429)
     *         or Service Unavailable (status code 503)
     *         or Il server ha ritornato l&#39;oggetto.  (status code 200)
     *         or Unexpected error (status code 200)
     * @see ItemApi#apiGetItem
     */
    default ResponseEntity<Item> apiGetItem(UUID uuid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"item\" : { \"a\" : 1, \"b\" : \"ciao\" }, \"timestamp\" : \"2018-12-30T12:23:32Z\n\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
