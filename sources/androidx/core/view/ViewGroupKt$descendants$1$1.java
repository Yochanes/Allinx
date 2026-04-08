package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroid/view/View;", "child", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ViewGroupKt$descendants$1$1 extends Lambda implements Function1<View, Iterator<? extends View>> {

    /* JADX INFO: renamed from: a */
    public static final ViewGroupKt$descendants$1$1 f23425a = new ViewGroupKt$descendants$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new ViewGroupKt$children$1(viewGroup).getF55142a();
        }
        return null;
    }
}
