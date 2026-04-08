package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorReport {

    @SerializedName("exception_reports")
    private final List<ExceptionReport> exceptionReports;
    private final long timestamp;

    public ErrorReport(List<ExceptionReport> list, long j) {
        this.exceptionReports = list;
        this.timestamp = j;
    }

    public List<ExceptionReport> getExceptionReports() {
        return this.exceptionReports;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
