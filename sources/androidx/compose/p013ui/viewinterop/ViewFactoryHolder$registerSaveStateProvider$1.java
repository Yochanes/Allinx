package androidx.compose.p013ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class ViewFactoryHolder$registerSaveStateProvider$1 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewFactoryHolder f20687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$registerSaveStateProvider$1(ViewFactoryHolder viewFactoryHolder) {
        super(0);
        this.f20687a = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f20687a.f20680F.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
