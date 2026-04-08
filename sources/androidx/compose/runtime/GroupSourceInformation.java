package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class GroupSourceInformation {

    /* JADX INFO: renamed from: a */
    public ArrayList f16370a;

    /* JADX INFO: renamed from: a */
    public final boolean m4377a(Anchor anchor) {
        ArrayList arrayList = this.f16370a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (Intrinsics.m18594b(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).m4377a(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final GroupSourceInformation m4378b() {
        Object obj;
        ArrayList arrayList = this.f16370a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if (obj instanceof GroupSourceInformation) {
                    ((GroupSourceInformation) obj).getClass();
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return groupSourceInformation != null ? groupSourceInformation.m4378b() : this;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4379c(Anchor anchor) {
        ArrayList arrayList = this.f16370a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (Intrinsics.m18594b(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).m4379c(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f16370a = null;
                return false;
            }
        }
        return true;
    }
}
