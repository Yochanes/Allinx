package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "headerId", "", "dataSize", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ZipFilesKt$readOrSkipLocalHeader$1 extends Lambda implements Function2<Integer, Long, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RealBufferedSource f57981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f57982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f57983c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f57984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZipFilesKt$readOrSkipLocalHeader$1(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, RealBufferedSource realBufferedSource) {
        super(2);
        this.f57981a = realBufferedSource;
        this.f57982b = objectRef;
        this.f57983c = objectRef2;
        this.f57984d = objectRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            RealBufferedSource realBufferedSource = this.f57981a;
            byte bM21697g = realBufferedSource.m21697g();
            boolean z2 = (bM21697g & 1) == 1;
            boolean z3 = (bM21697g & 2) == 2;
            boolean z4 = (bM21697g & 4) == 4;
            long j = z2 ? 5L : 1L;
            if (z3) {
                j += 4;
            }
            if (z4) {
                j += 4;
            }
            if (jLongValue < j) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z2) {
                this.f57982b.f51659a = Integer.valueOf(realBufferedSource.m21701k());
            }
            if (z3) {
                this.f57983c.f51659a = Integer.valueOf(realBufferedSource.m21701k());
            }
            if (z4) {
                this.f57984d.f51659a = Integer.valueOf(realBufferedSource.m21701k());
            }
        }
        return Unit.f51459a;
    }
}
