package kotlin.reflect.jvm.internal.impl.name;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableId {

    /* JADX INFO: renamed from: a */
    public final FqName f54022a;

    /* JADX INFO: renamed from: b */
    public final Name f54023b;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    static {
        FqName.m19585j(SpecialNames.f54045f);
    }

    public CallableId(FqName packageName, Name name) {
        Intrinsics.m18599g(packageName, "packageName");
        this.f54022a = packageName;
        this.f54023b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.m18594b(this.f54022a, callableId.f54022a) && this.f54023b.equals(callableId.f54023b);
    }

    public final int hashCode() {
        return (this.f54023b.hashCode() + (this.f54022a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = StringsKt.m20410H(this.f54022a.m19586b(), '.', '/') + RemoteSettings.FORWARD_SLASH_STRING + this.f54023b;
        Intrinsics.m18598f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
