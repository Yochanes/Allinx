package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class LocaleListPlatformWrapper implements LocaleListInterface {

    /* JADX INFO: renamed from: a */
    public final LocaleList f23261a;

    public LocaleListPlatformWrapper(LocaleList localeList) {
        this.f23261a = localeList;
    }

    @Override // androidx.core.os.LocaleListInterface
    /* JADX INFO: renamed from: a */
    public final Object mo7657a() {
        return this.f23261a;
    }

    public final boolean equals(Object obj) {
        return this.f23261a.equals(((LocaleListInterface) obj).mo7657a());
    }

    public final int hashCode() {
        return this.f23261a.hashCode();
    }

    public final String toString() {
        return this.f23261a.toString();
    }
}
