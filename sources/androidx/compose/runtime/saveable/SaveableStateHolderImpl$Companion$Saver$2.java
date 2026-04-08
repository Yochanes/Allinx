package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "it", "", "", "", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SaveableStateHolderImpl$Companion$Saver$2 extends Lambda implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {

    /* JADX INFO: renamed from: a */
    public static final SaveableStateHolderImpl$Companion$Saver$2 f16976a = new SaveableStateHolderImpl$Companion$Saver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new SaveableStateHolderImpl((Map) obj);
    }
}
