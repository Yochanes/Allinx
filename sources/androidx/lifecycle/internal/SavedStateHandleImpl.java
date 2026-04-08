package androidx.lifecycle.internal;

import androidx.compose.p013ui.platform.C1317m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SavedStateHandleImpl {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f25030a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f25031b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f25032c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f25033d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final C1317m f25034e = new C1317m(this, 1);

    public SavedStateHandleImpl(Map map) {
        this.f25030a = MapsKt.m18492o(map);
    }

    /* JADX INFO: renamed from: a */
    public final void m9185a(Object obj, String key) {
        Intrinsics.m18599g(key, "key");
        this.f25030a.put(key, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f25032c.get(key);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.f25033d.get(key);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(obj);
        }
    }
}
