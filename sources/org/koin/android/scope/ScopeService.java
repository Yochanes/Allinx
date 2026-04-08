package org.koin.android.scope;

import android.app.Service;
import kotlin.Metadata;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lorg/koin/android/scope/ScopeService;", "Landroid/app/Service;", "Lorg/koin/android/scope/AndroidScopeComponent;", "koin-android_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public abstract class ScopeService extends Service implements AndroidScopeComponent {
    @Override // org.koin.android.scope.AndroidScopeComponent
    /* JADX INFO: renamed from: e */
    public final Scope mo21788e() {
        throw null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        mo21788e();
        throw null;
    }
}
