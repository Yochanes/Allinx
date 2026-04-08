package okhttp3.internal.p047ws;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class WebSocketExtensions {

    /* JADX INFO: renamed from: a */
    public final boolean f57777a;

    /* JADX INFO: renamed from: b */
    public final Integer f57778b;

    /* JADX INFO: renamed from: c */
    public final boolean f57779c;

    /* JADX INFO: renamed from: d */
    public final Integer f57780d;

    /* JADX INFO: renamed from: e */
    public final boolean f57781e;

    /* JADX INFO: renamed from: f */
    public final boolean f57782f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public WebSocketExtensions(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5) {
        this.f57777a = z2;
        this.f57778b = num;
        this.f57779c = z3;
        this.f57780d = num2;
        this.f57781e = z4;
        this.f57782f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f57777a == webSocketExtensions.f57777a && Intrinsics.m18594b(this.f57778b, webSocketExtensions.f57778b) && this.f57779c == webSocketExtensions.f57779c && Intrinsics.m18594b(this.f57780d, webSocketExtensions.f57780d) && this.f57781e == webSocketExtensions.f57781e && this.f57782f == webSocketExtensions.f57782f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z2 = this.f57777a;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int i = r1 * 31;
        Integer num = this.f57778b;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z3 = this.f57779c;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i2 = (iHashCode + r3) * 31;
        Integer num2 = this.f57780d;
        int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z4 = this.f57781e;
        ?? r2 = z4;
        if (z4) {
            r2 = 1;
        }
        int i3 = (iHashCode2 + r2) * 31;
        boolean z5 = this.f57782f;
        return i3 + (z5 ? 1 : z5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f57777a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f57778b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f57779c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f57780d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f57781e);
        sb.append(", unknownValues=");
        return AbstractC0455a.m2243r(sb, this.f57782f, ')');
    }
}
