package androidx.compose.p013ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.io.Serializable;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DisposableSaveableStateRegistry_androidKt {

    /* JADX INFO: renamed from: a */
    public static final Class[] f19403a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public static final boolean m6140a(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getF16615b() == SnapshotStateKt.m4526h() || snapshotMutableState.getF16615b() == SnapshotStateKt.m4533o() || snapshotMutableState.getF16615b() == SnapshotStateKt.m4530l()) {
                Object f20325a = snapshotMutableState.getF20325a();
                if (f20325a == null) {
                    return true;
                }
                return m6140a(f20325a);
            }
        } else {
            if ((obj instanceof Function) && (obj instanceof Serializable)) {
                return false;
            }
            Class[] clsArr = f19403a;
            for (int i = 0; i < 7; i++) {
                if (clsArr[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
