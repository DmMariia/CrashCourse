package Task5;

public enum HTTPError {
    BAD_REQUEST(400), UNAUTHORIZED(401), PAYMENT_REQUIRED(402), FORBIDDEN(403), NOT_FOUND(404);

    private int httpError;

    private HTTPError (int httpError) {
        this.httpError = httpError;
    }

    public int getHTTPError() {
        return httpError;
    }
}

