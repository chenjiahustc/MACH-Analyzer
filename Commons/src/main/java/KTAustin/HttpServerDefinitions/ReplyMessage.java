package KTAustin.HttpServerDefinitions;

import lombok.Data;

import java.util.Date;

@Data
public class ReplyMessage {
    private ErrorCode errorCode;
    private String message;
    private String exceptionDetail;
    private String name;
    private Date replyTime;
    private boolean recoverableError;
}
