package coil.request;

import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/OneShotDisposable;", "Lcoil/request/Disposable;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class OneShotDisposable implements Disposable {

    /* JADX INFO: renamed from: a */
    public final Deferred f33895a;

    public OneShotDisposable(Deferred deferred) {
        this.f33895a = deferred;
    }
}
