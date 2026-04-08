package coil.request;

import android.view.View;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/ViewTargetDisposable;", "Lcoil/request/Disposable;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ViewTargetDisposable implements Disposable {

    /* JADX INFO: renamed from: a */
    public final View f33928a;

    /* JADX INFO: renamed from: b */
    public volatile Deferred f33929b;

    public ViewTargetDisposable(View view, Deferred deferred) {
        this.f33928a = view;
        this.f33929b = deferred;
    }
}
