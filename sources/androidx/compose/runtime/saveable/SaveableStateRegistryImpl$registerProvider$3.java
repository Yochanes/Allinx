package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/runtime/saveable/SaveableStateRegistryImpl$registerProvider$3", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "runtime-saveable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SaveableStateRegistryImpl$registerProvider$3 implements SaveableStateRegistry.Entry {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableScatterMap f16988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f16989b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lambda f16990c;

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateRegistryImpl$registerProvider$3(MutableScatterMap mutableScatterMap, String str, Function0 function0) {
        this.f16988a = mutableScatterMap;
        this.f16989b = str;
        this.f16990c = (Lambda) function0;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
    public final void unregister() {
        MutableScatterMap mutableScatterMap = this.f16988a;
        String str = this.f16989b;
        List list = (List) mutableScatterMap.m2079k(str);
        if (list != null) {
            list.remove(this.f16990c);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        mutableScatterMap.m2081m(str, list);
    }
}
