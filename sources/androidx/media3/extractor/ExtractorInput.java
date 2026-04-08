package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ExtractorInput extends DataReader {
    /* JADX INFO: renamed from: a */
    boolean mo10780a(byte[] bArr, int i, int i2, boolean z2);

    /* JADX INFO: renamed from: c */
    boolean mo10781c(byte[] bArr, int i, int i2, boolean z2);

    /* JADX INFO: renamed from: d */
    long mo10782d();

    /* JADX INFO: renamed from: e */
    void mo10783e(int i);

    /* JADX INFO: renamed from: g */
    void mo10784g();

    long getLength();

    long getPosition();

    /* JADX INFO: renamed from: h */
    void mo10785h(int i);

    /* JADX INFO: renamed from: j */
    void mo10786j(byte[] bArr, int i, int i2);

    void readFully(byte[] bArr, int i, int i2);
}
