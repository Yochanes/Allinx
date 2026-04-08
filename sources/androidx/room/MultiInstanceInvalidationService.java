package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalRoomApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a */
    public int f31927a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f31928b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final MultiInstanceInvalidationService$callbackList$1 f31929c = new MultiInstanceInvalidationService$callbackList$1(this);

    /* JADX INFO: renamed from: d */
    public final MultiInstanceInvalidationService$binder$1 f31930d = new MultiInstanceInvalidationService$binder$1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.m18599g(intent, "intent");
        return this.f31930d;
    }
}
