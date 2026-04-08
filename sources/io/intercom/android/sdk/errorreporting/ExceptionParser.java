package io.intercom.android.sdk.errorreporting;

import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class ExceptionParser {
    private static final String[] ALLOWED_PACKAGES = {"io.intercom.android.sdk", "java.", "kotlin.", "kotlinx.", "android.", "androidx.", "com.android.", "com.google."};
    private static final String INTERCOM_SDK_PACKAGE = "io.intercom.android.sdk";
    private static final String REDACTION_LINE = "[Non Intercom/OS method]";

    private List<ExceptionReport> createExceptionReports(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null) {
            arrayList.add(new ExceptionReport(th.getClass().getName(), th.getLocalizedMessage(), getStacktraceString(th.getStackTrace())));
            th = th.getCause();
        }
        return arrayList;
    }

    private String getStacktraceString(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            sb.append(isFromAllowedPackage(stackTraceElement) ? stackTraceElement.toString() : REDACTION_LINE);
            if (i < stackTraceElementArr.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private boolean isFromAllowedPackage(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        for (String str : ALLOWED_PACKAGES) {
            if (className.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsIntercomMethod(Throwable th) {
        while (true) {
            if (th == null) {
                return false;
            }
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (stackTraceElement.getClassName().startsWith("io.intercom.android.sdk")) {
                    return true;
                }
            }
            th = th.getCause();
        }
    }

    public ErrorReport createReportFrom(Throwable th) {
        return new ErrorReport(createExceptionReports(th), TimeProvider.SYSTEM.currentTimeMillis());
    }
}
