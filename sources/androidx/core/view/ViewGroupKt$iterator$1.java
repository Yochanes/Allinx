package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "core-ktx_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ViewGroupKt$iterator$1 implements Iterator<View>, KMutableIterator {

    /* JADX INFO: renamed from: a */
    public int f23426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f23427b;

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.f23427b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23426a < this.f23427b.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i = this.f23426a;
        this.f23426a = i + 1;
        View childAt = this.f23427b.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f23426a - 1;
        this.f23426a = i;
        this.f23427b.removeViewAt(i);
    }
}
