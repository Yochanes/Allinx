package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.C0213n;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.workaround.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0202a implements AsyncFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0213n f2101a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraDevice f2102b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SessionConfigurationCompat f2103c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f2104d;

    public /* synthetic */ C0202a(C0213n c0213n, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        this.f2101a = c0213n;
        this.f2102b = cameraDevice;
        this.f2103c = sessionConfigurationCompat;
        this.f2104d = list;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.android.datatransport.Transformer
    public final ListenableFuture apply(Object obj) {
        return this.f2101a.m1167a(this.f2102b, this.f2103c, this.f2104d);
    }
}
