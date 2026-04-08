package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a */
    public final boolean f25317a;

    /* JADX INFO: renamed from: b */
    public final int f25318b;

    public ParserException(String str, RuntimeException runtimeException, boolean z2, int i) {
        super(str, runtimeException);
        this.f25317a = z2;
        this.f25318b = i;
    }

    /* JADX INFO: renamed from: a */
    public static ParserException m9344a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ParserException m9345b(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f25317a);
        sb.append(", dataType=");
        return AbstractC0000a.m11h(this.f25318b, "}", sb);
    }
}
