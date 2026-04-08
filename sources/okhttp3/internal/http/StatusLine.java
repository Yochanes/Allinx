package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/http/StatusLine;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class StatusLine {

    /* JADX INFO: renamed from: a */
    public final Protocol f57487a;

    /* JADX INFO: renamed from: b */
    public final int f57488b;

    /* JADX INFO: renamed from: c */
    public final String f57489c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m18302d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static StatusLine m21439a(String statusLine) throws ProtocolException {
            int i;
            String strSubstring;
            Intrinsics.m18599g(statusLine, "statusLine");
            boolean zM20416N = StringsKt.m20416N(statusLine, "HTTP/1.", false);
            Protocol protocol = Protocol.HTTP_1_0;
            if (zM20416N) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt != 0) {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!StringsKt.m20416N(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i2);
                Intrinsics.m18598f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
    }

    public StatusLine(Protocol protocol, int i, String message) {
        Intrinsics.m18599g(protocol, "protocol");
        Intrinsics.m18599g(message, "message");
        this.f57487a = protocol;
        this.f57488b = i;
        this.f57489c = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f57487a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f57488b);
        sb.append(' ');
        sb.append(this.f57489c);
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
