package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/navigation/NavViewModelStoreProvider;", "<init>", "()V", "Companion", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f30196a = new LinkedHashMap();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavControllerViewModel$Companion;", "", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    /* JADX INFO: renamed from: a */
    public final ViewModelStore mo11216a(String backStackEntryId) {
        Intrinsics.m18599g(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f30196a;
        ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        linkedHashMap.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f30196a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).m9179a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        CharsKt.m20380b(16);
        sb.append(UnsignedKt.m18317b(16, ((long) iIdentityHashCode) & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.f30196a.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
