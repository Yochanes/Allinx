package androidx.media3.datasource;

import com.google.common.base.Predicate;
import java.util.Map;

/* JADX INFO: renamed from: androidx.media3.datasource.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1760b implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25916a;

    public /* synthetic */ C1760b(int i) {
        this.f25916a = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f25916a) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
            default:
                if (((String) obj) != null) {
                }
                break;
        }
        return false;
    }
}
