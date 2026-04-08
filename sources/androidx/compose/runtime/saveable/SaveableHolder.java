package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/saveable/SaveableHolder;", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/RememberObserver;", "runtime-saveable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SaveableHolder<T> implements SaverScope, RememberObserver {

    /* JADX INFO: renamed from: a */
    public Saver f16962a;

    /* JADX INFO: renamed from: b */
    public SaveableStateRegistry f16963b;

    /* JADX INFO: renamed from: c */
    public String f16964c;

    /* JADX INFO: renamed from: d */
    public Object f16965d;

    /* JADX INFO: renamed from: f */
    public Object[] f16966f;

    /* JADX INFO: renamed from: g */
    public SaveableStateRegistry.Entry f16967g;

    /* JADX INFO: renamed from: i */
    public final Function0 f16968i = new SaveableHolder$valueProvider$1(this);

    public SaveableHolder(Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        this.f16962a = saver;
        this.f16963b = saveableStateRegistry;
        this.f16964c = str;
        this.f16965d = obj;
        this.f16966f = objArr;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    /* JADX INFO: renamed from: a */
    public final boolean mo4753a(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.f16963b;
        return saveableStateRegistry == null || saveableStateRegistry.mo3079a(obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m4754b() {
        String strM4750a;
        SaveableStateRegistry saveableStateRegistry = this.f16963b;
        if (this.f16967g != null) {
            throw new IllegalArgumentException(("entry(" + this.f16967g + ") is not null").toString());
        }
        if (saveableStateRegistry != null) {
            Function0 function0 = this.f16968i;
            Object objInvoke = ((SaveableHolder$valueProvider$1) function0).invoke();
            if (objInvoke == null || saveableStateRegistry.mo3079a(objInvoke)) {
                this.f16967g = saveableStateRegistry.mo3082d(this.f16964c, function0);
                return;
            }
            if (objInvoke instanceof SnapshotMutableState) {
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) objInvoke;
                if (snapshotMutableState.getF16615b() == SnapshotStateKt.m4526h() || snapshotMutableState.getF16615b() == SnapshotStateKt.m4533o() || snapshotMutableState.getF16615b() == SnapshotStateKt.m4530l()) {
                    strM4750a = "MutableState containing " + snapshotMutableState.getF20325a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM4750a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM4750a = RememberSaveableKt.m4750a(objInvoke);
            }
            throw new IllegalArgumentException(strM4750a);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.f16967g;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SaveableStateRegistry.Entry entry = this.f16967g;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        m4754b();
    }
}
