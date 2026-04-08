package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ExtractorsFactory {
    /* JADX INFO: renamed from: b */
    Extractor[] mo10147b();

    /* JADX INFO: renamed from: c */
    default Extractor[] mo10794c(Uri uri, Map map) {
        return mo10147b();
    }
}
