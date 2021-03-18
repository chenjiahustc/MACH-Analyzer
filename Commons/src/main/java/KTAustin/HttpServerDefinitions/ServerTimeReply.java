package KTAustin.HttpServerDefinitions;

import lombok.Data;

import java.util.Date;

@Data
public class ServerTimeReply extends ReplyMessage {
    private Date serverTime;
    private long clockDifference;
}
