package scaler.example.EmailService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailEventDto {
    private String to;
    private String from;
    private String fromPassword;
    private  String subject;
    private String body;
}
