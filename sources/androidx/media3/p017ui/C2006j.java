package androidx.media3.p017ui;

import androidx.media3.p017ui.SpannedToHtmlConverter;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.media3.ui.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2006j implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30160a;

    public /* synthetic */ C2006j(int i) {
        this.f30160a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        SpannedToHtmlConverter.SpanInfo spanInfo = (SpannedToHtmlConverter.SpanInfo) obj;
        SpannedToHtmlConverter.SpanInfo spanInfo2 = (SpannedToHtmlConverter.SpanInfo) obj2;
        switch (this.f30160a) {
            case 0:
                int iCompare = Integer.compare(spanInfo2.f30068b, spanInfo.f30068b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = spanInfo.f30069c.compareTo(spanInfo2.f30069c);
                return iCompareTo != 0 ? iCompareTo : spanInfo.f30070d.compareTo(spanInfo2.f30070d);
            default:
                int iCompare2 = Integer.compare(spanInfo2.f30067a, spanInfo.f30067a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = spanInfo2.f30069c.compareTo(spanInfo.f30069c);
                return iCompareTo2 != 0 ? iCompareTo2 : spanInfo2.f30070d.compareTo(spanInfo.f30070d);
        }
    }
}
