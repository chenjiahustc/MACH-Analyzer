package KTAustin.HttpServerDefinitions;

public enum ErrorCode {
    Success(0),
    InvalidVersion(1),
    InvalidConfiguration(2),
    DatabaseConnectionError(3),
    PartialSuccess(4),
    InvalidLicense(5),
    InvalidUserCredentials(6),
    Failure(7),
    UnexpectedFailure(8),
    ServiceConnectionError(9),
    InvalidApiVersion(10);

    private int nCode;

    private ErrorCode(int nCode){
        this.nCode = nCode;
    }

    @Override
    public String toString(){
        return String.valueOf(this.nCode);
    }
}
