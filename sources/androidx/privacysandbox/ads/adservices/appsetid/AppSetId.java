package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "", "Companion", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AppSetId {

    /* JADX INFO: renamed from: a */
    public final String f31415a;

    /* JADX INFO: renamed from: b */
    public final int f31416b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId$Companion;", "", "", "SCOPE_APP", "I", "SCOPE_DEVELOPER", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public AppSetId(String str, int i) {
        this.f31415a = str;
        this.f31416b = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return this.f31415a.equals(appSetId.f31415a) && this.f31416b == appSetId.f31416b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31416b) + (this.f31415a.hashCode() * 31);
    }

    public final String toString() {
        return "AppSetId: id=" + this.f31415a + ", scope=" + (this.f31416b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
