package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongObjectMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface SelectionLayout {
    /* JADX INFO: renamed from: a */
    boolean mo3553a();

    /* JADX INFO: renamed from: b */
    SelectableInfo mo3554b();

    /* JADX INFO: renamed from: c */
    Selection mo3555c();

    /* JADX INFO: renamed from: d */
    SelectableInfo mo3556d();

    /* JADX INFO: renamed from: e */
    MutableLongObjectMap mo3557e(Selection selection);

    /* JADX INFO: renamed from: f */
    boolean mo3558f(SelectionLayout selectionLayout);

    /* JADX INFO: renamed from: g */
    int mo3559g();

    int getSize();

    /* JADX INFO: renamed from: h */
    SelectableInfo mo3560h();

    /* JADX INFO: renamed from: i */
    CrossStatus mo3561i();

    /* JADX INFO: renamed from: j */
    void mo3562j(Function1 function1);

    /* JADX INFO: renamed from: k */
    SelectableInfo mo3563k();

    /* JADX INFO: renamed from: l */
    int mo3564l();
}
