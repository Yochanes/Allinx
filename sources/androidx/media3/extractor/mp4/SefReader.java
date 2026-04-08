package androidx.media3.extractor.mp4;

import com.google.common.base.Splitter;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SefReader {

    /* JADX INFO: renamed from: d */
    public static final Splitter f28860d = Splitter.m14767on(':');

    /* JADX INFO: renamed from: e */
    public static final Splitter f28861e = Splitter.m14767on('*');

    /* JADX INFO: renamed from: a */
    public final ArrayList f28862a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f28863b = 0;

    /* JADX INFO: renamed from: c */
    public int f28864c;

    /* JADX INFO: compiled from: Proguard */
    public static final class DataReference {

        /* JADX INFO: renamed from: a */
        public final long f28865a;

        /* JADX INFO: renamed from: b */
        public final int f28866b;

        public DataReference(long j, int i) {
            this.f28865a = j;
            this.f28866b = i;
        }
    }
}
