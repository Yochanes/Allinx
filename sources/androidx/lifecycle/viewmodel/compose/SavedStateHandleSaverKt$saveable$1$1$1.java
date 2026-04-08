package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, FunctionAdapter {
    @Override // androidx.compose.runtime.saveable.SaverScope
    /* JADX INFO: renamed from: a */
    public final boolean mo4753a(Object obj) {
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: b */
    public final Function mo3595b() {
        return new FunctionReferenceImpl(1, null, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof FunctionAdapter)) {
            return mo3595b().equals(((FunctionAdapter) obj).mo3595b());
        }
        return false;
    }

    public final int hashCode() {
        return mo3595b().hashCode();
    }
}
