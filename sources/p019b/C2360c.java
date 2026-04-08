package p019b;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2UseCaseConfigFactory;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: renamed from: b.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2360c implements UseCaseConfigFactory.Provider {
    @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
    /* JADX INFO: renamed from: a */
    public final Camera2UseCaseConfigFactory mo1575a(Context context) {
        return new Camera2UseCaseConfigFactory(context);
    }
}
