package one.digitalinnovation.presonapi.dto;

import lombok.Builder;
import lombok.Data;

import java.security.cert.CertPathBuilder;

@Data
@Builder
public class MessageResponseDTO {

    private String message;

}
