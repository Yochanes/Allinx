package io.intercom.android.sdk.api;

import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import retrofit2.Response;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorObject {

    @Nullable
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig = LumberMill.getLogger();

    public ErrorObject(Throwable th, @Nullable Response response) {
        this.throwable = th;
        this.errorBody = parseErrorBody(response);
        this.statusCode = parseStatusCode(response);
    }

    private String parseErrorBody(@Nullable Response response) {
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1;
        if (response == null || (responseBody$Companion$asResponseBody$1 = response.f59452c) == null) {
            return null;
        }
        try {
            return responseBody$Companion$asResponseBody$1.m21313g();
        } catch (IOException e) {
            this.twig.internal("Couldn't parse error body: " + e.getMessage());
            return null;
        }
    }

    private int parseStatusCode(@Nullable Response response) {
        if (response != null) {
            return response.f59450a.f57232d;
        }
        return -1;
    }

    @Nullable
    public String getErrorBody() {
        return this.errorBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean hasErrorBody() {
        return this.errorBody != null;
    }
}
