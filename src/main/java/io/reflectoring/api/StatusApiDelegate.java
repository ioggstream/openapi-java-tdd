package io.reflectoring.api;

import io.reflectoring.model.Problem;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link StatusApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-10T17:37:19.958+02:00[Europe/Berlin]")

public interface StatusApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /status : Ritorna lo stato dell&#39;applicazione.
     * Ritorna lo stato dell&#39;applicazione. A scopo di test, su base randomica puo&#39; ritornare un errore. 
     *
     * @return Bad Request (status code 400)
     *         or Too many requests (status code 429)
     *         or Service Unavailable (status code 503)
     *         or Il server ha ritornato lo status. In caso di problemi ritorna sempre un problem+json.  (status code 200)
     *         or Unexpected error (status code 200)
     * @see StatusApi#apiGetStatus
     */
    default ResponseEntity<Problem> apiGetStatus() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
