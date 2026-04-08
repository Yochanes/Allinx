package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "SavingStateLiveData", "Companion", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SavedStateHandle {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f24974a;

    /* JADX INFO: renamed from: b */
    public final SavedStateHandleImpl f24975b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static SavedStateHandle m9163a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.m18596d(classLoader);
            bundle.setClassLoader(classLoader);
            MapBuilder mapBuilder = new MapBuilder(bundle.size());
            for (String str : bundle.keySet()) {
                Intrinsics.m18596d(str);
                mapBuilder.put(str, bundle.get(str));
            }
            return new SavedStateHandle(mapBuilder.m18531e());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {

        /* JADX INFO: renamed from: l */
        public String f24976l;

        /* JADX INFO: renamed from: m */
        public SavedStateHandle f24977m;

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: k */
        public final void mo9147k(Object obj) {
            SavedStateHandleImpl savedStateHandleImpl;
            SavedStateHandle savedStateHandle = this.f24977m;
            if (savedStateHandle != null && (savedStateHandleImpl = savedStateHandle.f24975b) != null) {
                savedStateHandleImpl.m9185a(obj, this.f24976l);
            }
            super.mo9147k(obj);
        }
    }

    public SavedStateHandle(MapBuilder mapBuilder) {
        this.f24974a = new LinkedHashMap();
        this.f24975b = new SavedStateHandleImpl(mapBuilder);
    }

    /* JADX INFO: renamed from: a */
    public final SavingStateLiveData m9161a(String str) {
        SavingStateLiveData savingStateLiveData;
        SavedStateHandleImpl savedStateHandleImpl = this.f24975b;
        if (savedStateHandleImpl.f25033d.containsKey(str)) {
            throw new IllegalArgumentException(AbstractC0000a.m3D("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both.").toString());
        }
        LinkedHashMap linkedHashMap = this.f24974a;
        Object obj = linkedHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            LinkedHashMap linkedHashMap2 = savedStateHandleImpl.f25030a;
            if (linkedHashMap2.containsKey(str)) {
                SavingStateLiveData savingStateLiveData2 = new SavingStateLiveData(linkedHashMap2.get(str));
                savingStateLiveData2.f24976l = str;
                savingStateLiveData2.f24977m = this;
                savingStateLiveData = savingStateLiveData2;
            } else {
                SavingStateLiveData savingStateLiveData3 = new SavingStateLiveData();
                savingStateLiveData3.f24976l = str;
                savingStateLiveData3.f24977m = this;
                savingStateLiveData = savingStateLiveData3;
            }
            linkedHashMap.put(str, savingStateLiveData);
            obj2 = savingStateLiveData;
        }
        return (SavingStateLiveData) obj2;
    }

    /* JADX INFO: renamed from: b */
    public final void m9162b(Object obj, String key) {
        Intrinsics.m18599g(key, "key");
        if (obj != null) {
            ArrayList arrayList = SavedStateHandleImpl_androidKt.f25035a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            Intrinsics.m18596d(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        ArrayList arrayList2 = SavedStateHandleImpl_androidKt.f25035a;
        Object obj2 = this.f24974a.get(key);
        MutableLiveData mutableLiveData = obj2 instanceof MutableLiveData ? (MutableLiveData) obj2 : null;
        if (mutableLiveData != null) {
            mutableLiveData.mo9147k(obj);
        }
        this.f24975b.m9185a(obj, key);
    }

    public SavedStateHandle() {
        this.f24974a = new LinkedHashMap();
        this.f24975b = new SavedStateHandleImpl(MapsKt.m18481d());
    }
}
