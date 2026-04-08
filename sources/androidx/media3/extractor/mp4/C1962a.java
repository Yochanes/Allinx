package androidx.media3.extractor.mp4;

import com.google.common.base.Function;
import com.google.common.escape.Escaper;

/* JADX INFO: renamed from: androidx.media3.extractor.mp4.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1962a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f28911b;

    public /* synthetic */ C1962a(Object obj, int i) {
        this.f28910a = i;
        this.f28911b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f28910a) {
            case 0:
                Track track = (Track) obj;
                ((FragmentedMp4Extractor) this.f28911b).getClass();
                return track;
            default:
                return ((Escaper) this.f28911b).escape((String) obj);
        }
    }
}
