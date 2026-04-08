package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JobSupportKt {

    /* JADX INFO: renamed from: a */
    public static final Symbol f55348a = new Symbol("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    public static final Symbol f55349b = new Symbol("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    public static final Symbol f55350c = new Symbol("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    public static final Symbol f55351d = new Symbol("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    public static final Symbol f55352e = new Symbol("SEALED");

    /* JADX INFO: renamed from: f */
    public static final Empty f55353f = new Empty(false);

    /* JADX INFO: renamed from: g */
    public static final Empty f55354g = new Empty(true);

    /* JADX INFO: renamed from: a */
    public static final Object m20641a(Object obj) {
        Incomplete incomplete;
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.f55318a) == null) ? obj : incomplete;
    }
}
