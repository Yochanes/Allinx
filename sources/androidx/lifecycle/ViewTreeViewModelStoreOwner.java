package androidx.lifecycle;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import com.exchange.allin.R;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"lifecycle-viewmodel_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
public final class ViewTreeViewModelStoreOwner {
    /* JADX INFO: renamed from: a */
    public static final ViewModelStoreOwner m9182a(View view) {
        Intrinsics.m18599g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            ViewModelStoreOwner viewModelStoreOwner = tag instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) tag : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            Object objM8156a = ViewTree.m8156a(view);
            view = objM8156a instanceof View ? (View) objM8156a : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m9183b(View view, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.m18599g(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
