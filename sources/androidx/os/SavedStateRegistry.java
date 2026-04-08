package androidx.os;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.os.Recreator;
import androidx.os.internal.SavedStateRegistryImpl;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "SavedStateProvider", "AutoRecreated", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: a */
    public final SavedStateRegistryImpl f32027a;

    /* JADX INFO: renamed from: b */
    public Recreator.SavedStateProvider f32028b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface AutoRecreated {
        /* JADX INFO: renamed from: a */
        void mo9122a(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface SavedStateProvider {
        /* JADX INFO: renamed from: a */
        Bundle mo175a();
    }

    public SavedStateRegistry(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.f32027a = savedStateRegistryImpl;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m11871a(String key) {
        Intrinsics.m18599g(key, "key");
        SavedStateRegistryImpl savedStateRegistryImpl = this.f32027a;
        if (!savedStateRegistryImpl.f32038g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = savedStateRegistryImpl.f32037f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM11865g = bundle.containsKey(key) ? SavedStateReader.m11865g(bundle, key) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            savedStateRegistryImpl.f32037f = null;
        }
        return bundleM11865g;
    }

    /* JADX INFO: renamed from: b */
    public final SavedStateProvider m11872b() {
        SavedStateProvider savedStateProvider;
        SavedStateRegistryImpl savedStateRegistryImpl = this.f32027a;
        synchronized (savedStateRegistryImpl.f32034c) {
            Iterator it = savedStateRegistryImpl.f32035d.entrySet().iterator();
            do {
                savedStateProvider = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                SavedStateProvider savedStateProvider2 = (SavedStateProvider) entry.getValue();
                if (Intrinsics.m18594b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    savedStateProvider = savedStateProvider2;
                }
            } while (savedStateProvider == null);
        }
        return savedStateProvider;
    }

    /* JADX INFO: renamed from: c */
    public final void m11873c(String str, SavedStateProvider provider) {
        Intrinsics.m18599g(provider, "provider");
        SavedStateRegistryImpl savedStateRegistryImpl = this.f32027a;
        synchronized (savedStateRegistryImpl.f32034c) {
            if (savedStateRegistryImpl.f32035d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            savedStateRegistryImpl.f32035d.put(str, provider);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11874d() {
        if (!this.f32027a.f32039h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.SavedStateProvider savedStateProvider = this.f32028b;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.f32028b = savedStateProvider;
        try {
            LegacySavedStateHandleController.OnRecreation.class.getDeclaredConstructor(new Class[0]);
            Recreator.SavedStateProvider savedStateProvider2 = this.f32028b;
            if (savedStateProvider2 != null) {
                savedStateProvider2.f32026a.add(LegacySavedStateHandleController.OnRecreation.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + LegacySavedStateHandleController.OnRecreation.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
