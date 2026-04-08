package androidx.compose.p013ui.platform;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.core.os.BundleKt;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.os.SavedStateRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1317m implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19660a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f19661b;

    public /* synthetic */ C1317m(Object obj, int i) {
        this.f19660a = i;
        this.f19661b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    /* JADX INFO: renamed from: a */
    public final Bundle mo175a() {
        Pair[] pairArr;
        switch (this.f19660a) {
            case 0:
                Map mapMo3080b = ((SaveableStateRegistry) this.f19661b).mo3080b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapMo3080b.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                SavedStateHandleImpl savedStateHandleImpl = (SavedStateHandleImpl) this.f19661b;
                for (Map.Entry entry2 : MapsKt.m18490m(savedStateHandleImpl.f25033d).entrySet()) {
                    savedStateHandleImpl.m9185a(((MutableStateFlow) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : MapsKt.m18490m(savedStateHandleImpl.f25031b).entrySet()) {
                    savedStateHandleImpl.m9185a(((SavedStateRegistry.SavedStateProvider) entry3.getValue()).mo175a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = savedStateHandleImpl.f25030a;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return BundleKt.m7644a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
