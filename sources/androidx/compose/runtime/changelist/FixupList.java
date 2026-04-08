package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FixupList extends OperationsDebugStringFormattable {

    /* JADX INFO: renamed from: a */
    public final Operations f16681a = new Operations();

    /* JADX INFO: renamed from: b */
    public final Operations f16682b = new Operations();

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    /* JADX INFO: renamed from: a */
    public final String mo4537a(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FixupList instance containing ");
        Operations operations = this.f16681a;
        sb2.append(operations.f16721b);
        sb2.append(" operations");
        sb.append(sb2.toString());
        if (sb.length() > 0) {
            sb.append(":\n" + operations.mo4537a(str));
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
