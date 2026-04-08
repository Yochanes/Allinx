package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.DisposableEffectResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C1202x25c9094c implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SaveableStateHolderImpl f16980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f16981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SaveableStateRegistry f16982c;

    public C1202x25c9094c(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateRegistry saveableStateRegistry) {
        this.f16980a = saveableStateHolderImpl;
        this.f16981b = obj;
        this.f16982c = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        SaveableStateHolderImpl saveableStateHolderImpl = this.f16980a;
        MutableScatterMap mutableScatterMap = saveableStateHolderImpl.f16972b;
        Object obj = this.f16981b;
        Object objM2079k = mutableScatterMap.m2079k(obj);
        SaveableStateRegistry saveableStateRegistry = this.f16982c;
        if (objM2079k == saveableStateRegistry) {
            Map mapMo3080b = saveableStateRegistry.mo3080b();
            boolean zIsEmpty = mapMo3080b.isEmpty();
            Map map = saveableStateHolderImpl.f16971a;
            if (zIsEmpty) {
                map.remove(obj);
            } else {
                map.put(obj, mapMo3080b);
            }
        }
    }
}
