package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "CallbackAndContract", "Companion", "LifecycleContainer", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f212a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f213b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f214c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f215d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f216e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f217f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f218g = new Bundle();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class CallbackAndContract<O> {

        /* JADX INFO: renamed from: a */
        public final ActivityResultCallback f219a;

        /* JADX INFO: renamed from: b */
        public final ActivityResultContract f220b;

        public CallbackAndContract(ActivityResultContract contract, ActivityResultCallback callback) {
            Intrinsics.m18599g(callback, "callback");
            Intrinsics.m18599g(contract, "contract");
            this.f219a = callback;
            this.f220b = contract;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m18302d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "", "INITIAL_REQUEST_CODE_VALUE", "I", "", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class LifecycleContainer {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f221a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f222b = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            this.f221a = lifecycle;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m222a(int i, Serializable serializable) {
        String str = (String) this.f212a.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.f216e.get(str);
        if ((callbackAndContract != null ? callbackAndContract.f219a : null) == null) {
            this.f218g.remove(str);
            this.f217f.put(str, serializable);
            return;
        }
        ActivityResultCallback activityResultCallback = callbackAndContract.f219a;
        Intrinsics.m18597e(activityResultCallback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (this.f215d.remove(str)) {
            activityResultCallback.mo185a(serializable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m223b(int i, int i2, Intent intent) {
        String str = (String) this.f212a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.f216e.get(str);
        if ((callbackAndContract != null ? callbackAndContract.f219a : null) != null) {
            ArrayList arrayList = this.f215d;
            if (arrayList.contains(str)) {
                callbackAndContract.f219a.mo185a(callbackAndContract.f220b.parseResult(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f217f.remove(str);
        this.f218g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo152c(int i, ActivityResultContract activityResultContract, Object obj);

    /* JADX INFO: renamed from: d */
    public final ActivityResultRegistry$register$2 m224d(String key, LifecycleOwner lifecycleOwner, ActivityResultContract contract, ActivityResultCallback callback) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(lifecycleOwner, "lifecycleOwner");
        Intrinsics.m18599g(contract, "contract");
        Intrinsics.m18599g(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getF24894d().compareTo(Lifecycle.State.f24883d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getF24894d() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m226f(key);
        LinkedHashMap linkedHashMap = this.f214c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        C0053a c0053a = new C0053a(this, key, callback, contract);
        lifecycleContainer.f221a.mo9123a(c0053a);
        lifecycleContainer.f222b.add(c0053a);
        linkedHashMap.put(key, lifecycleContainer);
        return new ActivityResultRegistry$register$2(this, key, contract);
    }

    /* JADX INFO: renamed from: e */
    public final ActivityResultRegistry$register$3 m225e(String key, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        Intrinsics.m18599g(key, "key");
        m226f(key);
        this.f216e.put(key, new CallbackAndContract(activityResultContract, activityResultCallback));
        LinkedHashMap linkedHashMap = this.f217f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            activityResultCallback.mo185a(obj);
        }
        Bundle bundle = this.f218g;
        ActivityResult activityResult = (ActivityResult) BundleCompat.m7634a(bundle, key, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(key);
            activityResultCallback.mo185a(activityResultContract.parseResult(activityResult.f210a, activityResult.f211b));
        }
        return new ActivityResultRegistry$register$3(this, key, activityResultContract);
    }

    /* JADX INFO: renamed from: f */
    public final void m226f(String str) {
        LinkedHashMap linkedHashMap = this.f213b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (ConstrainedOnceSequence) SequencesKt.m20369k(ActivityResultRegistry$generateRandomNumber$1.f223a)) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f212a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: g */
    public final void m227g(String key) {
        Integer num;
        Intrinsics.m18599g(key, "key");
        if (!this.f215d.contains(key) && (num = (Integer) this.f213b.remove(key)) != null) {
            this.f212a.remove(num);
        }
        this.f216e.remove(key);
        LinkedHashMap linkedHashMap = this.f217f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbM23t = AbstractC0000a.m23t("Dropping pending result for request ", key, ": ");
            sbM23t.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbM23t.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f218g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) BundleCompat.m7634a(bundle, key, ActivityResult.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f214c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap2.get(key);
        if (lifecycleContainer != null) {
            ArrayList arrayList = lifecycleContainer.f222b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lifecycleContainer.f221a.mo9125c((LifecycleEventObserver) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
