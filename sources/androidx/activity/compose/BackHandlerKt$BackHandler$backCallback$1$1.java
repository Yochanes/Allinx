package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/activity/compose/BackHandlerKt$BackHandler$backCallback$1$1", "Landroidx/activity/OnBackPressedCallback;", "activity-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BackHandlerKt$BackHandler$backCallback$1$1 extends OnBackPressedCallback {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MutableState f146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$backCallback$1$1(MutableState mutableState, boolean z2) {
        super(z2);
        this.f146d = mutableState;
    }

    @Override // androidx.activity.OnBackPressedCallback
    /* JADX INFO: renamed from: b */
    public final void mo161b() {
        ((Function0) this.f146d.getF20325a()).invoke();
    }
}
